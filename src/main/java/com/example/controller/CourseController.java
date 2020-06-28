package com.example.controller;

import com.example.entity.Course;
import com.example.service.CourseService;
import com.example.util.ExcelBean;
import com.example.util.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping("/all")
    @ResponseBody
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @RequestMapping("/del")
    @ResponseBody
    public boolean delOneCourse(String courseId){
        boolean result=courseService.delOneStudent(courseId);
        if(result){
            return true;
        }else{
            return false;
        }
    }

    @RequestMapping("/selectByCourseName")
    @ResponseBody
    public List<Course> getCourseByCourseName(String courseName){
        return courseService.getCourseByCourseName(courseName);
    }

    //根据课程号查找具体的课程信息
    @RequestMapping("/getOneCourseByCid")
    @ResponseBody
    public Course getOneCourseByCid(String courseId){
        return courseService.getOneCourseByCid(courseId);
    }

    //根据老师的工号找到对应的课程信息
    @RequestMapping("/getCouorseBycourseTid")
    @ResponseBody
    public Course getCourseByCourseTid(String courseTid){
        return courseService.getOneCourseByCourseTid(courseTid);
    }

    @RequestMapping("/import")
    @ResponseBody
    public String importCourse(MultipartFile excel) throws IOException,Exception{
        InputStream in=excel.getInputStream();
        List<List<Object>> listob= ExcelUtil.getListByExcel(in,excel.getOriginalFilename());
        List<Course> courseList=new ArrayList<>();
        for(int i=0;i<listob.size();i++){
            List<Object> ob=listob.get(i);
            Course course=new Course();
            course.setCourseId(String.valueOf(ob.get(0)));
            course.setCourseName(String.valueOf(ob.get(1)));
            course.setCourseIntroduce(String.valueOf(ob.get(2)));
            course.setCourseTime(String.valueOf(ob.get(3)));
            course.setCourseTid(String.valueOf(ob.get(4)));
            course.setMaxNum(Integer.parseInt(ob.get(5).toString()));
            course.setCredit(String.valueOf(ob.get(6)));
            course.setPeriod(String.valueOf(ob.get(7)));
            course.setLocation(String.valueOf(ob.get(8)));
            course.setCourseImg(String.valueOf(ob.get(9)));
            course.setCoursevideo(String.valueOf(ob.get(10)));
            courseList.add(course);
        }
        courseService.importCourse(courseList);
        return "批量添加课程成功";
    }

    //导出
    @RequestMapping("/export")
    @ResponseBody
    public void exportCourse(HttpServletResponse reps) throws IOException, Exception {
        reps.reset(); // 清除buffer缓存
        // 指定下载的文件名，浏览器都会使用本地编码，即GBK，浏览器收到这个文件名后，用ISO-8859-1来解码，然后用GBK来显示
        // 所以我们用GBK解码，ISO-8859-1来编码，在浏览器那边会反过来执行。
        reps.setHeader("Content-Disposition",
                "attachment;filename=" + new String("course1.xlsx".getBytes("GBK"), "ISO-8859-1"));
        reps.setContentType("application/vnd.ms-excel;charset=UTF-8");
        reps.setHeader("Pragma", "no-cache");
        reps.setHeader("Cache-Control", "no-cache");
        reps.setDateHeader("Expires", 0);
        List<Course> courseList = courseService.getAllCourse();
        // 导出Excel对象
        OutputStream output = null;
        List<ExcelBean> excel=new ArrayList<>();
        Map<Integer,List<ExcelBean>> map=new HashMap<>();
        //设置表头
        excel.add(new ExcelBean("课程号","courseId",0));
        excel.add(new ExcelBean("课程名称","courseName",0));
        excel.add(new ExcelBean("课程介绍","courseIntroduce",0));
        excel.add(new ExcelBean("上课时间","courseTime",0));
        excel.add(new ExcelBean("老师工号","courseTid",0));
        excel.add(new ExcelBean("最大选课人数 ","maxNum",0));
        excel.add(new ExcelBean("学分","credit",0));
        excel.add(new ExcelBean("学时","period",0));
        excel.add(new ExcelBean("上课地点 ","location",0));
        excel.add(new ExcelBean("课程图片 ","courseImg",0));
        excel.add(new ExcelBean("课程视频 ","coursevideo",0));


        map.put(0, excel);
        String sheetName = "course";
        //调用ExcelUtil的方法
        XSSFWorkbook workbook = ExcelUtil.createExcelFile(Course.class, courseList, map, sheetName);
        try {
            output = reps.getOutputStream();
            BufferedOutputStream bufferedOutPut = new BufferedOutputStream(output);
            bufferedOutPut.flush();
            workbook.write(bufferedOutPut);
            bufferedOutPut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

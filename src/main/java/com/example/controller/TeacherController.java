package com.example.controller;

import com.example.entity.Student;
import com.example.entity.Teacher;
import com.example.service.TeacherService;
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
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/all")
    @ResponseBody
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeacher();
    }


    @RequestMapping("/validate")
    @ResponseBody
    public boolean validate(String username2,String password2){
        boolean result=teacherService.validateTeacher(username2,password2);
        if(result){
            return true;
        }else{
            return false;
        }
    }

    @RequestMapping("/del")
    @ResponseBody
    public boolean getDelResult(String tid){
        boolean result=teacherService.delOneTeacher(tid);
        if(result){
            return true;
        }
        else{
            return false;
        }
    }
    @RequestMapping("/selectByName")
    @ResponseBody
    public List<Teacher> getTeacherByTname(String tname){
        return teacherService.getTeacherByName(tname);
    }


    @RequestMapping("/selectByTeachCourse")
    @ResponseBody
    public List<Teacher> getTeacherByTeachCourse(String teachCourse){
        return teacherService.getTeacherByTeachCourse(teachCourse);
    }

    @RequestMapping("/selectByTid")
    @ResponseBody
    public Teacher getOneTeacherByTid(String tid){
        return teacherService.getOneTeacherByTid(tid);
    }

    @RequestMapping("/update")
    @ResponseBody
    public boolean updatePwd(String tid,String pwd){
        boolean result=teacherService.updatePwd(tid,pwd);
        if(result){
            return true;
        }else{
            return false;
        }

    }
    @RequestMapping("/import")
    @ResponseBody
    public String importTeacher(MultipartFile excel) throws IOException,Exception{
        InputStream in=excel.getInputStream();
        List<List<Object>> listob= ExcelUtil.getListByExcel(in,excel.getOriginalFilename());
        List<Teacher> list=new ArrayList<>();
        for(int i=0;i<listob.size();i++){
            List<Object> ob=listob.get(i);
            Teacher teacher=new Teacher();
            teacher.setTid(String.valueOf(ob.get(0)));
            teacher.setTname(String.valueOf(ob.get(1)));
            teacher.setTpwd(String.valueOf(ob.get(2)));
            teacher.setTitle(String.valueOf(ob.get(3)));
            teacher.setPhone(String.valueOf(ob.get(4)));
            teacher.setTeachCourse(String.valueOf(ob.get(5)));
            list.add(teacher);
        }
        teacherService.importTeacher(list);
        return "批量添加教师成功";
    }

    //导出
    @RequestMapping("/export")
    @ResponseBody
    public void exportTeacher(HttpServletResponse reps) throws IOException, Exception {
        reps.reset(); // 清除buffer缓存
        // 指定下载的文件名，浏览器都会使用本地编码，即GBK，浏览器收到这个文件名后，用ISO-8859-1来解码，然后用GBK来显示
        // 所以我们用GBK解码，ISO-8859-1来编码，在浏览器那边会反过来执行。
        reps.setHeader("Content-Disposition",
                "attachment;filename=" + new String("teacher1.xlsx".getBytes("GBK"), "ISO-8859-1"));
        reps.setContentType("application/vnd.ms-excel;charset=UTF-8");
        reps.setHeader("Pragma", "no-cache");
        reps.setHeader("Cache-Control", "no-cache");
        reps.setDateHeader("Expires", 0);
        List<Teacher> teacherList = teacherService.getAllTeacher();
        // 导出Excel对象
        OutputStream output = null;
        List<ExcelBean> excel=new ArrayList<>();
        Map<Integer,List<ExcelBean>> map=new HashMap<>();
        //设置表头
        excel.add(new ExcelBean("工号","tid",0));
        excel.add(new ExcelBean("姓名","tname",0));
        excel.add(new ExcelBean("密码","tpwd",0));
        excel.add(new ExcelBean("职称","title",0));
        excel.add(new ExcelBean("电话","phone",0));
        excel.add(new ExcelBean("教师课程 ","teachCourse",0));
        map.put(0, excel);
        String sheetName = "teacher";
        //调用ExcelUtil的方法
        XSSFWorkbook workbook = ExcelUtil.createExcelFile(Teacher.class, teacherList, map, sheetName);
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

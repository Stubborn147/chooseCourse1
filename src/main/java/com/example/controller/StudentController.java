package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
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
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

//获取全部学生
    @RequestMapping("/all")
    @ResponseBody
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

//登录功能
    @RequestMapping("/validate")
    @ResponseBody
    public boolean validate(String username1,String password1){
      boolean result=studentService.ValidateStudent(username1,password1);
      if(result){
          return true;
      }else{
          return false;
      }
  }
  //删除功能
    @RequestMapping("/del")
    @ResponseBody
    public boolean getDelResult(String sid){
        boolean result=studentService.delOneStudent(sid);
        if(result){
            return true;
        }
        else{
            return false;
        }
    }

    //根据学号获取一条学生数据
    @RequestMapping("/getOneStudentBySid")
    @ResponseBody
    public Student getOneStudentBySid(String sid){
        return studentService.getOneStudent(sid);
    }

    //修改密码
    @RequestMapping("/update")
    @ResponseBody
    public boolean updatePwd(String sid,String pwd){
        boolean result=studentService.updatePwd(sid,pwd);
        if(result){
            return true;
        }else{
            return false;
        }
    }

    //文件上传功能
    @RequestMapping("/import")
    @ResponseBody
    public String importStudent(MultipartFile excel) throws IOException, Exception {
        InputStream in = excel.getInputStream();
        //in:文件的内容；excel.getOriginalFilename();上传的文件名
        //List<List<Object>> 工作簿对象
        //List<Object>   Sheet页对象
        //Object     单元格数据
        List<List<Object>> listob = ExcelUtil.getListByExcel(in, excel.getOriginalFilename());
        in.close();
        List<Student> studentList = new ArrayList<Student>();
        // 遍历listob数据，把数据放到List中
        for (int i = 0; i < listob.size(); i++) {
            List<Object> ob = listob.get(i);//Sheet页
            Student student = new Student();
            //用户编号int\昵称\登录密码\性别\头像地址\出生日期date\最高学历\毕业院校\手机号码\邮箱\账户余额double
            student.setSid(String.valueOf(ob.get(0)));
            student.setName(String.valueOf(ob.get(1)));
            student.setPwd(String.valueOf(ob.get(2)));
            student.setGender(String.valueOf(ob.get(3)));
            student.setBirthday(String.valueOf(ob.get(4)));
            student.setAddress(String.valueOf(ob.get(5)));
            student.setClassName(String.valueOf(ob.get(6)));
            student.setCredit(Double.parseDouble(ob.get(7).toString()));
            studentList.add(student);
        }
        studentService.importStudent(studentList);
        return "批量添加学生成功";
    }

    //数据导出到Excel
    @RequestMapping("/export")
    @ResponseBody
    public void exportStudent(HttpServletResponse reps) throws IOException, Exception {
        reps.reset(); // 清除buffer缓存
        // 指定下载的文件名，浏览器都会使用本地编码，即GBK，浏览器收到这个文件名后，用ISO-8859-1来解码，然后用GBK来显示
        // 所以我们用GBK解码，ISO-8859-1来编码，在浏览器那边会反过来执行。
        reps.setHeader("Content-Disposition",
                "attachment;filename=" + new String("student1.xlsx".getBytes("GBK"), "ISO-8859-1"));
        reps.setContentType("application/vnd.ms-excel;charset=UTF-8");
        reps.setHeader("Pragma", "no-cache");
        reps.setHeader("Cache-Control", "no-cache");
        reps.setDateHeader("Expires", 0);
        List<Student> studentList = studentService.getAllStudent();
        // 导出Excel对象
        OutputStream output = null;
        List<ExcelBean> excel=new ArrayList<>();
        Map<Integer,List<ExcelBean>> map=new HashMap<>();
        //设置表头
        excel.add(new ExcelBean("学号","sid",0));
        excel.add(new ExcelBean("名字","name",0));
        excel.add(new ExcelBean("密码","pwd",0));
        excel.add(new ExcelBean("性别","gender",0));
        excel.add(new ExcelBean("出生日期","birthday",0));
        excel.add(new ExcelBean("地址 ","address",0));
        excel.add(new ExcelBean("班级","className",0));
        excel.add(new ExcelBean("学分","credit",0));
        map.put(0, excel);
        String sheetName = "student";
        //调用ExcelUtil的方法
        XSSFWorkbook workbook = ExcelUtil.createExcelFile(Student.class, studentList, map, sheetName);
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
    
    @RequestMapping("/insertStudent")
    @ResponseBody
    public boolean insert(Student student){
        boolean result=studentService.insertStudent(student);
        if(result){
            return true;
        }else{
            return false;
        }
    }

}

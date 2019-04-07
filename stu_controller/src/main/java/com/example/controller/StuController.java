package com.example.controller;

import cn.tantan.bean.Classce;
import cn.tantan.bean.Student;
import cn.tantan.service.StuService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("student")
public class StuController {
    @Reference
    private StuService stuService;

    @RequestMapping("getStudent")
    public  String getStudent(Model model){
        List<Student> student = stuService.getStudent();
        model.addAttribute("stus",student);
        return  "stulist";
    }

    @RequestMapping("add")
    public String add(Student student){
        stuService.addStudent(student);
        System.out.println(student.toString());
        return  "forward:/student/getStudent";
    }

    public  String addClass(Classce classce){

        return "";
    }

    @RequestMapping("toadd")
    public String toAdd(){
        return "addStudent";
    }
}

package com.example.service;

import cn.tantan.bean.Classce;
import cn.tantan.bean.Student;
import cn.tantan.service.ClassService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dao.StuDao;
import cn.tantan.service.StuService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StuServiceIMp implements StuService {

    @Autowired
    private StuDao stuDao;

    @Reference
    private ClassService classService;

    @Override
    public List<Student> getStudent() {
        List<Student> students = stuDao.selectList(null);
         List<Classce> allClass = classService.getAllClass();

        for (Student stu : students) {
            for(Classce cla : allClass){
                if(stu.getClassId()==cla.getcId()){
                    stu.setClassce(cla);
                }
            }
            //System.out.println(stu.toString());
        }

        return students;
    }

    @Override
    public List<Integer> getClassId() {

        return null;
    }

    @Override
    public void addStudent(Student student) {
        stuDao.insert(student);
    }
}

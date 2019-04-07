package cn.tantan.service;

import cn.tantan.bean.Student;

import java.util.List;

public interface StuService {
    List<Student> getStudent();

    List<Integer> getClassId();

    void addStudent(Student student);
}

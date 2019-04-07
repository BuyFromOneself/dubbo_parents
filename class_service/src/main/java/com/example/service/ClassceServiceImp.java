package com.example.service;

import cn.tantan.bean.Classce;
import cn.tantan.service.ClassService;
import com.alibaba.dubbo.config.annotation.Service;
import com.example.dao.ClassceDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassceServiceImp implements ClassService {

    @Autowired
    private ClassceDao classceDao;

    @Override
    public List<Classce> getAllClass() {
        return classceDao.selectList(null);
    }


}

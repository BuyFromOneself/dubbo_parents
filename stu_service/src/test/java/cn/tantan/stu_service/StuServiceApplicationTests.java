package cn.tantan.stu_service;

import cn.tantan.bean.Student;
import cn.tantan.service.StuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StuServiceApplicationTests {
	@Autowired
	private StuService stuService;

	@Test
	public void contextLoads() {
		stuService.getStudent();
	}

}

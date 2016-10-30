package pand.dubbo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pand.dubbo.test.bean.User;
import pand.dubbo.test.service.DubboDemoService;

@Controller
@RequestMapping("/consumer")
public class ConsumerController {
	
	@Autowired
    DubboDemoService demoService; //  
	
	@RequestMapping("/test.back")
	public void test() {
		List<User> list = demoService.getUsers();
		System.out.println(list.size());
	}
}

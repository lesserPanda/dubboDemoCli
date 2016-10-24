package pand.dubbo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pand.dubbo.bean.User;
import pand.dubbo.service.DubboDemoService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application.xml"});  
        context.start();  
  
        DubboDemoService demoService = (DubboDemoService) context.getBean("demoService"); //  
        String hello = demoService.sayHello("tom"); //调用sayHello方法
        System.out.println(hello); 
        
        //获取用户列表
        List<User> list = demoService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}

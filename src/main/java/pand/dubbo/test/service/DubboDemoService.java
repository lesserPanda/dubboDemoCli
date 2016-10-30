package pand.dubbo.test.service;

import java.util.List;

import pand.dubbo.test.bean.User;

public interface DubboDemoService {
	String sayHello(String name);  
    public List<User> getUsers();
}

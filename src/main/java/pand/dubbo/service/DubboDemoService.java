package pand.dubbo.service;

import java.util.List;

import pand.dubbo.bean.User;

public interface DubboDemoService {
	String sayHello(String name);  
    public List<User> getUsers();
}

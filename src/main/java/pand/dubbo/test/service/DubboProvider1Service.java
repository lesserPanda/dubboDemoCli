package pand.dubbo.test.service;

import java.util.List;

import pand.dubbo.test.bean.User;

public interface DubboProvider1Service {

	public void delet(String id);
	public List<User> getUser();
}

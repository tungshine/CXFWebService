package com.tung.ws.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.tung.po.Cat;
import com.tung.po.User;
import com.tung.service.UserService;
import com.tung.ws.HelloWord;

@WebService(endpointInterface = "com.tung.ws.HelloWord", serviceName = "HelloWordWs")
public class HelloWordWs implements HelloWord {

	@Override
	public String sayHello(String name) {
		return name + ", 你好" + "现在时间：" + new Date();
	}

	@Override
	public List<Cat> getCatsByUser(User user) {
		// 在实际项目中，Web Service组件自己并不会去实现业务功能，
		// 它只是调用业务逻辑组件的方法来暴露Web Service
		UserService us = new UserServiceImpl();
		return us.getCatsByUser(user);
	}

	@Override
	public Map<String, Cat> getAllCats() {
		UserService us = new UserServiceImpl();
		return us.getAllCats();
	}

}

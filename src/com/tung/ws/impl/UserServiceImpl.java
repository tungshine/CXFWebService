package com.tung.ws.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tung.po.Cat;
import com.tung.po.User;
import com.tung.service.UserService;

public class UserServiceImpl implements UserService {

	// 用一个HashMap来模拟内存中的数据库
	static Map<User, List<Cat>> catDb = new HashMap<User, List<Cat>>();

	static {
		List<Cat> catList1 = new ArrayList<Cat>();
		catList1.add(new Cat(1, "tom", "红色"));
		catList1.add(new Cat(2, "jerry", "蓝色"));
		catDb.put(new User(1, "tung", "tung", "tung"), catList1);

		List<Cat> catList2 = new ArrayList<Cat>();
		catList2.add(new Cat(3, "张三", "白色"));
		catList2.add(new Cat(4, "李四", "黑色"));
		catDb.put(new User(2, "shine", "shine", "shine"), catList2);
	}

	@Override
	public List<Cat> getCatsByUser(User user) {
		return catDb.get(user);
	}

	@Override
	public Map<String, Cat> getAllCats() {
		
		Map<String, Cat> result = new HashMap<String, Cat>();
		int i = 1;
		for(List<Cat> cats : catDb.values()) {
			for(Cat cat : cats) {
				result.put("第" + i++ + "个", cat);
			}
		}
		return result;
	}

}

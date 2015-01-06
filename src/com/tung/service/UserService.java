package com.tung.service;

import java.util.List;
import java.util.Map;

import com.tung.po.Cat;
import com.tung.po.User;

public interface UserService {
	public List<Cat> getCatsByUser(User user);

	public Map<String, Cat> getAllCats();
}

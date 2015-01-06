package com.tung.ws;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.tung.po.Cat;
import com.tung.po.User;

@WebService
public interface HelloWord {
	
	String sayHello(String name);
	
	List<Cat> getCatsByUser(User user);
	
	@XmlJavaTypeAdapter(value = TestAdapter.class)Map<String, Cat> getAllCats();
}

package com.tung.ws;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.tung.po.Cat;
import com.tung.po.StringCat;
import com.tung.po.StringCat.Entry;

public class TestAdapter extends XmlAdapter<StringCat, Map<String, Cat>> {

	@Override
	public Map<String, Cat> unmarshal(StringCat v) throws Exception {
		Map<String, Cat> result = new HashMap<String, Cat>();
		for(Entry entry : v.getEntries()) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	@Override
	public StringCat marshal(Map<String, Cat> v) throws Exception {
		StringCat sc = new StringCat();
		for(String key : v.keySet()) {
			sc.getEntries().add(new Entry(key ,v.get(key)));
		}
		return sc;
	}
	
}

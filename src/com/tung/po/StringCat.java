package com.tung.po;

import java.util.ArrayList;
import java.util.List;

public class StringCat {

	public static class Entry {
		private String key;
		private Cat value;

		public Entry(String key, Cat value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Cat getValue() {
			return value;
		}

		public void setValue(Cat value) {
			this.value = value;
		}

	}
	
	private List<Entry> entries =  new ArrayList<Entry>();

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

}

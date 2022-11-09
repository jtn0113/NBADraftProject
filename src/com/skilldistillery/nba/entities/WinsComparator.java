package com.skilldistillery.nba.entities;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class WinsComparator implements Comparator<String>{
	private Map<String, Integer> map = new HashMap<>();

	public WinsComparator(Map<String, Integer> map) {
		super();
		this.map = map;
	}



	@Override
	public int compare(String o1, String o2) {
		int one = map.get(o1);
		int two = map.get(o2);
		
		return one > two ? 1 : one < two ? -1 : 0;
	}

}

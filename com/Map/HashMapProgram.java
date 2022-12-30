package com.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		//public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Azhar");
		map.put(20, "Salman");
		map.put(30, "Sohail");
		map.put(40, "Azhar");
		System.out.println(map);
		// System.out.println(map.entrySet());
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			//System.out.println(m.getKey());
		}
		map.putIfAbsent(103, "Salman");
		System.out.println(map);
	}

}

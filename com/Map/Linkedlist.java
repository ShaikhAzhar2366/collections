package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(10, "Azhar");
		map.put(12, "Salman");
		map.put(14, "Rehan");
		map.put(15, "Azhar");

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		map.remove(10);
		System.out.println(map);
	}

}

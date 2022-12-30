package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String>map=new HashMap<>();
		map.put(10, "Azhar");
		map.put(11, "Ajaj");
		map.put(120, "Rehan");
		map.put(50, "Salman");
		System.out.println(map);
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m);
	
		}
		
	}

}

package com.Map;

import java.util.LinkedList;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		Map<Integer, String>map=new java.util.LinkedHashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(5, "apple");
	 	System.out.println(map);
	     for(Map.Entry m:map.entrySet()) {
	    	 System.out.println(m);
	     }
	     
	  
	}

}

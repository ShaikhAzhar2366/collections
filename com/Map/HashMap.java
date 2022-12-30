package com.Map;

import java.util.Map;

//import java.util.HashMap;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<Integer, String>map=new java.util.HashMap<>();
		map.put(10, "Salam");
		map.put(20, "Arman");
		map.put(10, "Sohail");
		map.put(14, "Ayan");
	    System.out.println(map);
	    for (Map.Entry m:map.entrySet()) {
			System.out.println(m);
		
	    System.out.println(m.getKey()+""+m.getValue());
	    }
	    
	}

}

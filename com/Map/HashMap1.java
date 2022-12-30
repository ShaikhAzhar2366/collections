package com.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<>();
		map.put(10, "Azhar");
		map.put(12, "Azhar");
		map.put(110, "Sohail");
		map.put(14, "Arman");
		map.put(15, "Rehan");
		map.put(10, "Salman");
         System.out.println(map);
	   for(Map.Entry<Integer, String>entry:map.entrySet()){
		   System.out.println(entry);
		   
	   }
	
	
	
	
	}

}

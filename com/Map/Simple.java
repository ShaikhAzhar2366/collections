package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Simple {

	public static void main(String[] args) {
		Map<Integer, String>map=new HashMap<>();
		map.put(10, "Azhar");
		map.put(20, "khan");
		map.put(300, "Sohail");
		System.out.println(map);
		Set s= map.entrySet();
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		Map.Entry entry=(Map.Entry) itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		
		}
		
	}

}

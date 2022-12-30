package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Simple2 {

	public static void main(String[] args) {
	Map<String , Integer>map=new HashMap<>();
    map.put("Salman", 10);
    map.put("Sohail", 20);
    map.put("Azhar", 40);
    map.put("Arman", 10);
    System.out.println(map);
	Set s1=map.entrySet();
	System.out.println(s1);
	Iterator itr=s1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		System.out.println("this is a set ");
	}
	for(Map.Entry entry:map.entrySet()) {
		System.out.println(entry);
	System.out.println(entry.getValue()+" "+entry.getKey());

	}
	System.out.println("Compairing");
	
	
	}

}

package com.HashSet;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		java.util.HashSet<String> set = new java.util.HashSet<>();
		set.add("Azhar");
		set.add("Azhar");
		set.add("Rehan");
		set.add("Salman");
		System.out.println(set);
		Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
        java.util.HashSet<Integer>set1=new java.util.HashSet<>();
        set1.add(10);
        set1.add(12);
        set1.add(11);
        System.out.println(set1);
        System.out.println(System.currentTimeMillis());
        //Iterator<Integer>itr1=set1.iterator();
	    for(Integer num:set1)
	    {
	    	System.out.println(num);
	
	    
	    }
	   // String s=set.add(set1);
	      //set.addAll(set1);
       java.util.HashSet<String> set3=new java.util.HashSet<>();
       set3.add("Ajaj");
       set3.add("Salman");
	set.addAll(set3);
	System.out.println(set);
	  System.out.println(System.currentTimeMillis());
	}
	

}

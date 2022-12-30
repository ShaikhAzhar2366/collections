package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Azhar");
		list.add("Ajaj");
		list.add("Salman");
		list.add("Arman");
		list.add("Sohail");
		System.out.println("The use of ListIterator");
		java.util.ListIterator<String>lt=list.listIterator(list.size());
       while(lt.hasPrevious()) {
    	 String s1=  lt.previous();
       System.out.println(s1);
       }
       System.out.println("Using for loop");
       for(int i=0;i<list.size();i++) {
    	   System.out.println(list.get(i));
       }
       System.out.println("Ussing for eachRemainig method()");
	Iterator iterator=list.iterator();
	   iterator.forEachRemaining((a)->{
		   System.out.println(a);
	   });
	System.out.println();
	}
	
	
	

}

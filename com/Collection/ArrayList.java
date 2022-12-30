package com.Collection;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
	java.util.ArrayList<String>list=new java.util.ArrayList<>();
	list.add("Mango");
	list.add("Banana");
	list.add("Orange");
	list.add("Apple");
	System.out.println(list);
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
	}

}

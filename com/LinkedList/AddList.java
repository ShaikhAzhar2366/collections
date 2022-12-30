package com.LinkedList;

import java.util.LinkedList;
public class AddList {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<>();
	list.add("azhar");
	list.add("sohail");
	list.add("rehan");
	list.add("salman");
	System.out.println(list);
	
	list.add(1,"salman");
	System.out.println(list);
}

}

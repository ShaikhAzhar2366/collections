package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		Student s1=new Student(10, "Azhar", 20);
		Student s2=new Student(10, "Ajaj", 20);
		Student s3=new Student(12, "Salman", 20);

	ArrayList<String>list=new ArrayList<>();
	Iterator it=list.iterator();
	System.out.println("iterator work");
	while (it.hasNext()) {
		//System.out.println(it.next());
	
		Student s=(Student) it.next();
	System.out.println(s.age+" "+s.name+" "+s.age);
	}
	}

}

package com.ArrayToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		String[] arr= {"Java","Python","PHP","C++"};
	System.out.println("print to Array:"+Arrays.toString(arr));
	List<String>list=new ArrayList(); 
	{
		for(String s1:arr) {
			list.add(s1);
		}
		System.out.println("print to list:"+list);
	}
	
	}

}

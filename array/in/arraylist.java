package com.array.in;
import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		
	

	ArrayList<Integer>list=new ArrayList<>();
	list.add(10);
	list.add(20);
	System.out.println(list);
	list.set(0, 100);
	
	int size=list.size();
	System.out.println(size);
	System.out.println(list);
	list.add(200);
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
}
}

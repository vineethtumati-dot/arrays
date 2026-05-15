package com.array.in;

import java.util.Scanner;

public class hi {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int []arr= {1,2,3,4};
	
	System.out.println("enter the element");
	int element =sc.nextInt();
	
	int index=-1;
	
	boolean found =false;
	
	for(int i=0;i<arr.length;i++) {
	    if(arr[i]==element) {
	    	index=i;
	    	found=true;
	    	System.out.println("found :"+index);
	    }
	}
	
	if(found ==false) {
		System.out.println("not found ");
	}
	
	
	
}
	}
	

	






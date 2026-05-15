package com.array.in;

import java.util.Arrays;

public class linearsearch{
	public static void main(String[] args) {
 
		int[]arr= {10,20,40};
	
		int target=20;
		int index=0;
		 boolean status =false;
		 
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				status=true;
			index=i;
				break;
			}
		}
		if(status==true) {
			System.out.println("element found at index "+index);
			
		}else {
			System.out.println("no element found");
		}
		
		
		
		
		
		
	}
}
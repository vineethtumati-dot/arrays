package com.matrix.in;

import java.util.Scanner;

public class matrix {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	int [] arr = {2,4,6,8,10};
	
//	int target=9;

	System.out.println("enter th target");
	int target=sc.nextInt();
	
	
	int start =0;
	int index=-1;
	
	int end =arr.length-1;
	
	boolean  found =false;
	
	while(start <=end) {
		
		int mid =(start + end)/2;
		
		if(arr[mid]==target) {
			System.out.println("element found at index "+mid);
		found =true;
		
		break;
		
		}
	
		
		else if(target>arr[mid]) {
			start=mid+1;
			
		}else {
			end =mid-1;
		}
	}
		
		if(!found) {
			System.out.println(" elment  not found  "+index);
		}
		
	}
}
	
	
	
	
	
	
	
	
	
	


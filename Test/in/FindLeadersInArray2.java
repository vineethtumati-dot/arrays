package com.Test.in;
import java.util.Arrays;

public class FindLeadersInArray2 {

	public static void main(String[] args) {
		int []arr= {16, 17, 4, 3, 5, 2};
	
		int[] leaders=new int [arr.length];
		
		int index=0;
		 
		int max=arr[arr.length-1];
		

		leaders [index]=max;
		index++;
		System.out.println(Arrays.toString(leaders));
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i] ;
				
				leaders[index]=max;
				index++;
				
				System.out.println(Arrays.toString(leaders));	
				}
			}
		
		for(int i=index-1;i>=0;i--) {
			System.out.print(leaders[i]+" ");
		
		
		}
		
		
		
		
		
	

	
}
}


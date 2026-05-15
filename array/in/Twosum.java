package com.array.in;

public class Twosum {
public static void main(String[] args) {
	
	int []arr= {1,2,3,4,5};
	
	int target=5;
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1;j<arr.length;j++)	{
			
			if(arr[i]+arr[j]==target) {
				System.out.println("index value : "+i+","+j);
				System.out.println("added elements to get target : "+arr[i]+","+arr[j]+" ="+target);
			}
		}
	
	}
	
}
}
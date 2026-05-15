package com.array.in;

public class NoOfoccurency {

	public static void main(String[] args) {
	
		
		String []fruits= {"apple","banana","apple","grapes","orange"};
		
		String  target = "pineapple";
		
		int count=0;
		
		for(int i=0;i<fruits.length;i++) {
			
			if(fruits[i]==target) {
				count++;
	
			}
		
		}
		System.out.println("no.of occurency : "+target+" "+count);
	}
}
package com.array.in;

	import java.util.Arrays;

	public class missingNumber {
		public static void main(String[] args) {
			
			int []arr= {1,2,3,5};
			
			int n=5;
		int expectedsum=n*(n+1)/2;
		System.out.println("arr = "+ Arrays.toString(arr));
		
			System.out.println("expected sum = "+ expectedsum);
			
			
			int actualsum=0;
			for(int i=0;i<arr.length;i++) {
				actualsum+=arr[i];
				}
			
			System.out.println("actual sum = "+actualsum);
			
			
			int missingnumber=expectedsum-actualsum;
			System.out.println("missing number = "+missingnumber);
			
			
		}
	}
package com.array.in;

public class max {
 public static void main(String[] args) {
	
	 int []marks= {1,2,3,4};
	 
	 int max=marks[0];
	 
//	 for(int i=1;i<marks.length;i++) {
//		 if(max>marks[i]) {
//			 max=marks[i];
//		 }
//	 }
	 
	 
	 
	 for(int i:marks) {
//		 System.out.println(i);
		 if(max<i) {
			 max=i;
	 }
	 }
	 System.out.println(max);
}
}
package com.array.in;

public class SecondndLarge {

	public static void main(String[] args) {
	
int [] arr= {1,2,3,4,5,6};

int largest =arr[0];
int secondlargest=arr[0];

for(int i=1;i<arr.length;i++) {
	if(largest<arr[i]) {
		secondlargest=largest;
		largest=arr[i];
	}else if(arr[i]>secondlargest && arr[i]!=largest) {
//		System.out.println(largest);
		arr[i]=secondlargest ;
	}
}
System.out.println("largest = "+largest);
System.out.println("second largest = "+secondlargest);
}
}

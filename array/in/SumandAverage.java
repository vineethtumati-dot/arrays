package com.array.in;

public class SumandAverage {

	public static void main(String[] args) {
	int []price= {10,20,30,40,50,60};
	
	int actualsum=0;
//	for(int i=0;i<price.length;i++) {
//		actualsum+=price[i];
//		
//		
//	}
//
//	System.out.println(actualsum);
//	
//	
//	double average =actualsum/price.length;
//	System.out.println(average);
//	
//	}
//
//	
//	}

       for (int num:price) {
    	   actualsum+=num;
       }
       
       System.out.println("Actual sum = "+actualsum);
      
       double average =actualsum/price.length;
       
       System.out.println("Average = "+average);
       
       
	}  
	}
       
       

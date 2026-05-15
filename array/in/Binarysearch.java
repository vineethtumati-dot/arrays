package com.array.in;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int [] arr = {2,4,6,8,10};
			char choice;
//			int target=9;

			do {
				
			
				
				
			System.out.println("enter th target");
			int target=sc.nextInt();
			
			
			int start =0;
			
			
			int end =arr.length-1;
			
			boolean  found =false;
			int index=-1;
			
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
			System.out.println("do you want to continue ? (y/n)");
			 choice = sc.next().charAt(0);
			 
			}while(choice=='y'||choice=='n');
			 System.out.println("program ended. ");
			 sc.close();
			}
		}
			

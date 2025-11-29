package com.sp.array;

public class Ledder_17_nov_25 {

	public static void main(String[] args) {
		int arr[] = {1,16,5,4,9,8,4};
		int ledder=arr[arr.length-1];
		int j=arr.length-1;
		while(j!=0) {
			if(j==arr.length-1) {
				System.out.print( ledder);
				j--;
				continue;
			}
			if(ledder<arr[j]) {
				ledder=arr[j];
				System.out.print(" "+ ledder);
			}
			j--;
			
		}
		
	}

}

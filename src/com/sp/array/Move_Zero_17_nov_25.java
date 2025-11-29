package com.sp.array;

public class Move_Zero_17_nov_25 {

	public static void main(String[] args) {
		int arr[] = {1,0,2,0,3,0,4,5,0};
		/*int res[] = new int[arr.length];
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				res[c]=arr[i];
				c++;
			}
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] +" ");
		} */
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}

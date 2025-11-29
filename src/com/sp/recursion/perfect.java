package com.sp.recursion;

public class perfect {

	public static void main(String[] args) {
		for(int i=100;i<=150;i++) {
			int r = i^1;
			if(r==(i+1)) {
				System.out.println("even"+ i);
			}
			else {
				System.out.println("odd"+ i);
			}
		}
	}

}

package com.sp.logicalstatement;

public class decimal_to_binary_14_oct_25 {

	public static void main(String[] args) {
		int num =14;
		String s = "";
		while(num!=0) {
			
			int c = num/2;
			int rem = num%2;
			s = rem+s;
			num=c;
		}
		System.out.println(s);

	}

}

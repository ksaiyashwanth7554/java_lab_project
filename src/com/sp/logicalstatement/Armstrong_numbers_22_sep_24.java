package com.sp.logicalstatement;



public class Armstrong_numbers_22_sep_24 {
	//.write a Java Program to print Armstrong numbers between 100 to 450.
	static public boolean isArmstrong(int num) {
		int temp = num;
		String s = Integer.toString(temp);
		int len = s.length();
		int sum=0;
		while(num!=0) {
			int rem = num%10;
			sum = (int) (sum + Math.pow(rem, len));
			num = num/10;
		}
		if(temp==sum) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		for(int i=100;i<=450;i++) {
			if(isArmstrong(i)) {
				System.out.println("Armstrong number "+ i);
			}
			else {
				System.out.println("not Armstrong number "+ i);
			}
			
		}
		

	}

}

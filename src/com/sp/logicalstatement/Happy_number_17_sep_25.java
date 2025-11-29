package com.sp.logicalstatement;

import java.util.Scanner;

public class Happy_number_17_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		boolean flag = isHappy(num);
		if(flag) {
			System.out.println("happy");
		}
		else {
			System.out.println("not happy");
		}

	}

	private static boolean isHappy(int num) {
		while(num>9) {
			int n = num;
			int sum=0;
			while(n!=0) {
				int rem = n%10;
				sum += rem*rem;
				n= n/10;
			}
			num=sum;
			if(sum==1) {
				return true;
			}
		}
		return false;
	}

}

package com.sp.logicalstatement;
import java.util.Scanner;
public class Terminary_Assignment_8_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int f = sc.nextInt();
		System.out.println("enter the second number");
		int s = sc.nextInt();
		System.out.println("enter the thrid number");
		int th = sc.nextInt();
		int res = (f>s && f>th)?f: (s>th)?s:th;
		System.out.println(res);
	}

}

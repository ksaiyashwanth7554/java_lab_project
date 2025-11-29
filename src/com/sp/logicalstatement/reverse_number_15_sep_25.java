package com.sp.logicalstatement;
import java.util.Scanner;
public class reverse_number_15_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		reverse_number_15_sep_25 rn = new reverse_number_15_sep_25();
		int r = rn.reverse(n);
		System.out.println("reverse no "+ r);

	}

	private int reverse(int n) {
		int r = 0;
		while(n!=0) {
			int rem = n%10;
			r = r*10+rem;
			n=n/10;
		}
		return r;
	}

}

package com.sp.logicalstatement;

import java.util.Scanner;

public class Magic_Number_23_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		Magic_Number_23_sep_25 mn = new Magic_Number_23_sep_25();
		mn.magic(n);

	}

	private void magic(int n) {
		int sum = 0;
		while (n >9) {
			sum = 0;
			while (n != 0) {
				int rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n=sum;
		}
		if (n == 1) {
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}

	}

}

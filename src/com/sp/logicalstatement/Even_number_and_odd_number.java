package com.sp.logicalstatement;

import java.util.Scanner;

public class Even_number_and_odd_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println("even " + i);
			} else {
				System.out.println("odd " + i);
			}
		}

	}

}

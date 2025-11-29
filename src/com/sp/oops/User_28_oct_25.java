package com.sp.oops;

import java.util.Scanner;

public class User_28_oct_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int amount = sc.nextInt();
		System.out.println("Enter the payment opition");
		System.out.println("Enter the 1 for Credit card");
		System.out.println("Enter the 2 Debit card");
		System.out.println("Enter the 3 UPI ");
		int opition = sc.nextInt();
		switch (opition) {
		case 1:

			Payment c = new Credit_Card_28_oct_25();

			c.makePay(amount);
			break;

		case 2:
			c = new Debit_card_28_oct_25();
			c.makePay(amount);

			break;

		}

	}

}

package com.sp.oops;

import java.util.Scanner;

public class upi_28_oct_25 implements Payment{

	@Override
	public void makePay(double amount) {
		
		if(amount>0) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upi number");
		String pin = sc.next();
		System.out.println("account number"+ pin);
		System.out.println("upi amount"+ amount);
		}
		
	}
	

}

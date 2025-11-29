package com.sp.oops;

import java.util.Scanner;

public class Debit_card_28_oct_25 implements Payment {
		
	


	@Override
	public void makePay(double amount) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		if(amount>0) {
		System.out.println("Debit amount is "+ amount);
		System.out.println("ENTER THE ACCOUNT NUMBER");
		long account_number  = sc.nextLong();
		System.out.println("account number"+ account_number);
		System.out.println("Debit amount successfully");
		}
		
	}
	}

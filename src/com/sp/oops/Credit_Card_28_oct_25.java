package com.sp.oops;
import java.util.*;
public class Credit_Card_28_oct_25 implements Payment{
	
	@Override
	public void makePay(double amount) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE ACCOUNT NUMBER");
		long account_number  = sc.nextLong();
		System.out.println("account number"+ account_number);
		if(amount>0) {
			System.out.println("Credited amount is "+ amount);
			System.out.println("Credited amount successfully");
		}
		
		
	}

	

}

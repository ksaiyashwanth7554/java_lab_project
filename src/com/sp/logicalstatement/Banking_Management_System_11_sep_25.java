package com.sp.logicalstatement;

import java.util.Scanner;

class Account_On_Password {
	static protected long Account_On[] = { 123456789, 987654321, 1230984567 };
	static protected String password[] = { "sai", "yashwanth", "ram" };
}

public class Banking_Management_System_11_sep_25 extends Account_On_Password {
	private long balance;
	private String name;
	private String password;

	static Scanner sc = new Scanner(System.in);
	static {
		System.out.println("Welcome to Yash Bank");
		System.out.println("Smart Solution for Smart Life");
	}

	Banking_Management_System_11_sep_25(String name, String password, long balance) {
		this.balance = balance;
		this.name = name;
		this.password = password;
	}

	public static void main(String[] args) {
		System.out.println("Do you have account");
		long Defaultbalance = 1000;
		boolean isYouHaveAccount = sc.nextBoolean();
		if (isYouHaveAccount) {
			System.out.println("Enter the User name");
			String name = sc.next();
			System.out.println("Enter the password");
			String password = sc.next();
			Banking_Management_System_11_sep_25 bms1 = new Banking_Management_System_11_sep_25(name, password,
					Defaultbalance);
			System.out.println("Enter the 1 for deposit");
			System.out.println("Enter the 2 for withdraw");
			System.out.println("Enter the 3 for check balance");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the amount you want to deposit");
				long amount = sc.nextLong();
				bms1.deposit(amount);
				break;
			
			case 2:
				System.out.println("enter the amount you want to deposit");
				long amount1 = sc.nextLong();
				boolean isWithdraw = bms1.withdraw(amount1);
				if(isWithdraw) {
					System.out.println("withdraw successfully");
				}
				else {
					System.out.println("withdraw is not Successfully because you do not have enough money");
				}
				break;
			
			case 3:
				bms1.check_Balance();
			}

		} else {
			System.out.println("Enter the Username");
			String name = sc.next();
			System.out.println("Enter the password");
			String password = sc.next();
			System.out.println("Enter the re-password");
			String re_Password = sc.next();
			System.out.println("Enter the balance");
			long balance = sc.nextLong();
			if (password.equals(re_Password)) {
				Banking_Management_System_11_sep_25 bms1 = new Banking_Management_System_11_sep_25(name, password,
						balance);
				System.out.println("Enter the 1 for deposit");
				System.out.println("Enter the 2 for withdraw");
				System.out.println("Enter the 3 for check balance");
				System.out.println("Enter the choice");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("enter the amount you want to deposit");
					long amount = sc.nextLong();
					bms1.deposit(amount);
					break;
				
				case 2:
					System.out.println("enter the amount you want to deposit");
					long amount1 = sc.nextLong();
					boolean isWithdraw = bms1.withdraw(amount1);
					if(isWithdraw) {
						System.out.println("withdraw successfully");
					}
					else {
						System.out.println("withdraw is not Successfully because you do not have enough money");
					}
					break;
				
				case 3:
					bms1.check_Balance();
				}
			}
		}

	}

	private void check_Balance() {
		System.out.println("your balance is "+ balance);
	}

	private void deposit(long amount) {
		balance=+amount;
		System.out.println("deposit successful"+ balance  );
		
	}

	private boolean withdraw(long amount1) {
		if(amount1>balance) {
			return false;
		}
		else {
			balance=-amount1;
		}
		return true;
	}

}

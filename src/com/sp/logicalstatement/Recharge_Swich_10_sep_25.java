package com.sp.logicalstatement;

import java.util.Scanner;

public class Recharge_Swich_10_sep_25 {
	int plan;
	
	static {
		System.out.println("welcome to recharge plan");
	}
	Recharge_Swich_10_sep_25(int plan){
		this.plan =plan;
	}
	void rechargePlan() {
		switch(plan) {
		case 1:
			System.out.println("₹199 – 1.5GB/day for 28 days\r\n");
			break;
		case 2:
			System.out.println("₹399 – 2GB/day for 56 days\r\n");
			break;
		case 3:
			System.out.println("₹599 – 3GB/day for 84 days\r\n");
			break;
		case 4:
			System.out.println("₹999 – Unlimited data for 84 days\r\n");
			break;
		default:
			System.out.println("Exit the program\r\n");
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the plan number");
		int num = sc.nextInt();
		Recharge_Swich_10_sep_25 rs = new Recharge_Swich_10_sep_25(num);
		rs.rechargePlan();
		

	}

}

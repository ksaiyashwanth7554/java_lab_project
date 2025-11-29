package com.sp.oparator.terminary;
import java.util.Scanner;
public class Lead_Year_8_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		if(year%4==0) {
			if(year%400==0 || year%100!=0) {
				System.out.print("leap year "+ year);
			}
			else {
				System.out.print("not leap year  "+ year);
			}
		}
		else {
			System.out.print("not leap year  "+ year);
		}

	}

}

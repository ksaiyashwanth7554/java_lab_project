package com.sp.logicalstatement;
import java.util.Scanner;
public class Sum_of_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum=0;
		for(int i=n;i!=0;i=i/10) {
			int rem = i%10;
			sum=sum+rem;
		}
		System.out.println(sum);

	}

}

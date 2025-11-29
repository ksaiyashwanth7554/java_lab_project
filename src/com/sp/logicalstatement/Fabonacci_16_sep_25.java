package com.sp.logicalstatement;
import java.util.*;
public class Fabonacci_16_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a +" "+ b);
		for(int i=0;i<num-2;i++) {
			int c = a+b;
			System.out.print(" "+ c);
			a=b;
			b=c;
		}

	}

}

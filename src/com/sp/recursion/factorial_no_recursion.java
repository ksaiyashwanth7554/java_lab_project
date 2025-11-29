package com.sp.recursion;
import java.util.Scanner;
public class factorial_no_recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int p = sc.nextInt();
		factorial_no_recursion pnr = new factorial_no_recursion();
		int flag = pnr.isperfect(p);
		System.out.println(flag);

	}

	private int  isperfect(int p) {
		if(p==1 || p==0)
		{
			return 1;
		}
		
		return p* isperfect(p-1);
	}

}

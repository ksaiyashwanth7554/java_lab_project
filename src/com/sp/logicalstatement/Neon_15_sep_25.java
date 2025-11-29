package com.sp.logicalstatement;
import java.util.*;
public class Neon_15_sep_25 {

	public boolean neananswer(int n) {
		boolean flag =false;
		int s = n*n;
		int sum=0;
		while(s!=0) {
			int rem = s%10;
			sum=sum+rem;
			s=s/10;
		}
		if(sum==n) {
			return true;
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int neon = sc.nextInt();
		Neon_15_sep_25 ns = new Neon_15_sep_25();
		boolean flag = ns.neananswer(neon);
		if(flag) {
			System.out.println("yes neon");
		}
		else {
			System.out.println("no neon");
		}
		

	}

}

package com.sp.logicalstatement;
import java.util.Scanner;
import java.util.Random;

public class Random_number_7_oct_25 {

	public static void main(String[] args) {
		int count =3;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ran = r.nextInt(10);
		do {
			System.out.println("enter the number between 1 to 10");
			
			int num = sc.nextInt();
			
		if(num==ran) {
			System.out.println("you guess correct and same number");
			break;
		}
		else {
			
			count--;
			if(count==0) {
				System.out.println("choice are over");
				boolean flag = false;
				System.out.println("enter true for guess agian or enter false for exit");
				flag = sc.nextBoolean();
				if(flag)
				{
					count=3;
					ran = r.nextInt(10);
				}
			}
			else {
			System.out.println("you have "+ count +" choice and random number "+ ran );
			}
		}
		}
			while(count!=0);
		
		

	}

}

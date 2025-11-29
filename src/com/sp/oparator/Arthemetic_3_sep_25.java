package com.sp.oparator;
import java.util.Scanner;
public class Arthemetic_3_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("addition"+ 10 + 20); //addition1020
		//BODMAS
		//System.out.println("subtraction"+ 10 - 20); // ERROR 
		System.out.println("substraction"+(10-20)); // -10
		System.out.println("substraction"+ 10*20);  
		//no need of barkets because the multipcation become before addition in bodmos		
		System.out.println("substraction"+10/20); 
		System.out.println("substraction"+10%20);

	}

}

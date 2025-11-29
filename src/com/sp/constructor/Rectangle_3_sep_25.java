package com.sp.constructor;
import java.util.Scanner;
public class Rectangle_3_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		double length= sc.nextDouble();
		System.out.println("Enter the breath");
		double breath = sc.nextDouble();
		
		System.out.println("Area of Rectangle is "+ length*breath);
		
		System.out.println("Perimeter"+ 2*(length+breath));

	}

}

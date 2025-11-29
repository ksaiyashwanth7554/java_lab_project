package com.sp.oparator.terminary;
import java.util.Scanner;
public class Terminary_Operator_5_sep_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		String result = (
				         (marks>=90 && marks<=100)?"A":
						 (marks>=80 && marks<=89) ? "B":
						 (marks>=70 && marks<=79) ? "C": 
						 (marks>=35 && marks<=69) ? "E" : 
						 (marks<35 && marks>=0) ? "fails" : "Invalid" ); 
		System.out.println(result);
	}

}

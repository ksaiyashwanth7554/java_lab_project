package com.sp.oparator;

import java.util.Scanner;
public class ArthemeticOperation_3_sep_25 {
	
	double addition(double firstValue,double secondValue) {
		double c=  firstValue+secondValue;
		return c;
	}
	
	double substract(double firstValue,double secondValue) {
		return firstValue-secondValue;
	}
	
	double multification(double firstValue,double secondValue) {
		return firstValue*secondValue;
	}
	
	double divisation(double firstValue,double secondValue) {
		return firstValue/secondValue;
	}
	double moducule(double firstValue,double secondValue) {
		return firstValue%secondValue;
	}
	
	
	public static void main(String[] args) {
		ArthemeticOperation_3_sep_25 aop = new ArthemeticOperation_3_sep_25();
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter the first value");
		double firstValue = sc.nextDouble();
		System.out.println("Enter the second value");
		double secondValue = sc.nextDouble();
		
		System.out.println("addition "+ aop.addition(firstValue,secondValue));
		
		System.out.println("substract "+ aop.substract(aop.addition(firstValue,secondValue), secondValue));
		System.out.println("multification "+ aop.multification(aop.substract(aop.addition(firstValue,secondValue), secondValue), secondValue));
		System.out.println("division "+ aop.divisation(aop.multification(aop.substract(aop.addition(firstValue,secondValue), secondValue), secondValue), secondValue));
		System.out.println("moducle "+ aop.moducule(aop.divisation(aop.multification(aop.substract(aop.addition(firstValue,secondValue), secondValue), secondValue), secondValue), secondValue));
	}

}

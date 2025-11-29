package com.sp.logicalstatement;
import java.util.Scanner;
public class Employee_salary_increament_9_sep_25 {
	static Scanner sc = new Scanner(System.in);
	String empname;
	double sal;
	int exp;
	static {
		System.out.println("Welcome to bonus increament portal");
	}
	Employee_salary_increament_9_sep_25(String empname,double sal,int exp){
		this.empname = empname;
		this.sal=sal;
		this.exp=exp;
	}
	
	public void calBonus() {
		
		if(exp<2) {
			double bonus = (sal*5)/100;
			System.out.println("bonus is "+ (bonus+sal));
		}
		else if(exp>=2 && exp<5) {
			double bonus = (sal*10)/100;
			System.out.println("bonus is "+ (bonus+sal));
		}
		else if(exp>=5 && exp<10) {
			double bonus = (sal*15)/100;
			System.out.println("bonus is "+ (bonus+sal));
		}
		else if(exp>=10 && exp<20) {
			double bonus = (sal*20)/100;
			System.out.println("bonus is "+ (bonus+sal));
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter your Employee name");
		String ename = Employee_salary_increament_9_sep_25.sc.next();
		System.out.println("Enter your Employee  mounthly salary");
		double ems = Employee_salary_increament_9_sep_25.sc.nextDouble();
		System.out.println("Enter your Employee ex");
		int noe = Employee_salary_increament_9_sep_25.sc.nextInt();
		Employee_salary_increament_9_sep_25 emp1 = new Employee_salary_increament_9_sep_25(ename,ems,noe);
		emp1.calBonus();

	}

}

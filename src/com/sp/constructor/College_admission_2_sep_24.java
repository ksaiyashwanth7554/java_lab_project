package com.sp.constructor;

public class College_admission_2_sep_24 {
	private String Name;
	private int Age;
	
	College_admission_2_sep_24(){
		Name="unknown";
		Age = 18;
	}
	public void display() {
		System.out.println("Name "+ Name);
		System.out.println("Age "+ Age);
	}
	public static void main(String[] args) {
		College_admission_2_sep_24  cad = new College_admission_2_sep_24();
		cad.display();

	}

}

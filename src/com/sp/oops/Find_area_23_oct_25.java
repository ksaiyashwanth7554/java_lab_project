package com.sp.oops;

public class Find_area_23_oct_25 {
	
	int  findarea(int length,int breath){
		return length*breath;

	}
	
	int findarea(int square) {
		return square*square;
	}
	double findarea(int radius,double pi) {
		return pi*radius*radius;
	}

	public static void main(String[] args) {
		Find_area_23_oct_25 fa = new Find_area_23_oct_25();
		System.out.println("Rectangle "+ fa.findarea(20,30));
		System.out.println("square "+ fa.findarea(30));
		System.out.println("Cricle "+ fa.findarea(10,3.14));


	}

}

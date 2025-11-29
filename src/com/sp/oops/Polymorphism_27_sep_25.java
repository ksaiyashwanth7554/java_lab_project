package com.sp.oops;


interface poly{
	  public  void jump();
}


public class Polymorphism_27_sep_25 implements poly {

	public static void main(String[] args) {
		
		poly p = new Polymorphism_27_sep_25();
		p.jump();
	}

	@Override
	public void jump() {
		System.out.println("iam jumping");
		
	}

}

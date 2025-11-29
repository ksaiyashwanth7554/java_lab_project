package com.sp.oops;


class A{
	
	void jump(){
		System.out.println("juming for A");
	}
	void doing(){
		System.out.println("juming for A");
	}
}


class B extends A{
	void jump(){
		System.out.println("juming for B");
	}
	
	
}
class c extends A{
	
}

public class Runtime_polymorphism_27_oct_25  {

	public static void main(String[] args) {
		
		
		A obj = new B();
		obj.jump();
		obj.doing();
		
		obj = new c();
		obj.jump();

	}

}

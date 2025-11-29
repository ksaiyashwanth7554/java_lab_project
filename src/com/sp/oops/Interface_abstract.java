package com.sp.oops;

interface ans {
	public static final int As = 21;

	public abstract void s();

	public default void Default_function() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public static void Static_fuction() {
		System.out.println("static fuction");
		
		
	}
}

public class Interface_abstract implements ans {

	@Override
	public void s() {
		// TODO Auto-generated method stub

	}
	
	public void k() {
		
	}

	public static void main(String[] args) {
		ans ia = new Interface_abstract();
		ia.Default_function();
		ans.Static_fuction();
	}

}

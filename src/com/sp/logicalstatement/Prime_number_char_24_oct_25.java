package com.sp.logicalstatement;

public class Prime_number_char_24_oct_25 {

	public static void main(String[] args) {
		for(int i=1;i<=26;i++) {
			if(isprime(i)) {
				char  k = (char) (i+64);
				System.out.println(i +" "+ k);
			}
		}

	}

	private static boolean isprime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}

}

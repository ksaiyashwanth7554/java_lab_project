package com.sp.logicalstatement;
//write a Java program to print palindrome numbers between 100 to 200.
public class Palindrome_Numbers_22_sep_25 {

	public static void main(String[] args) {
		for(int i=100;i<=200;i++) {
			if(isPalindrome(i)) {
				System.out.println(" palindrome number "+ i);
			}
			else {
				System.out.println("not palindrome number "+ i);
			}
		}

	}

	private static boolean isPalindrome(int n) {
		int temp = n;
		int sum=0;
		while(temp!=0) {
			int rem = temp%10;
			sum=sum*10+rem;
			temp = temp/10;
		}
		
		if(n == sum) {
			return true;
		}
		return false;
	}

}

package com.sp.logicalstatement;

public class Prime_number_one_two_three_four {

	public static void main(String[] args) {
		int num = 11373;
		int temp = num;
		int n = 10;

		while (num != 0) {
			if (num > n) {
				int rem = num % n;

				boolean flag = isPrime(rem);
				if (rem != 1 && flag) {

					System.out.print(rem + " ");
				}
			}
			num = num / 10;
			if (num == 0) {
				n *= 10;
				num = temp;
			}
			if (n == 1000000) {
				break;
			}
		}

	}

	private static boolean isPrime(int rem) {
		int c = 0;
		for (int i = 1; i <= rem; i++) {
			if (rem % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		}
		return false;

	}

}

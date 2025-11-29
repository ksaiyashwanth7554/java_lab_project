package com.sp.logicalstatement;

public class Armstrong_number_8_oct_sep {

	public static void main(String[] args) {
		for (int i = 0; i <= 10000; i++) {
			int temp = i;
			int c = 0;
			while (temp != 0) {
				int rem = temp % 10;
				c++;
				temp = temp / 10;
			}
			int tem = i;
			int sum = 1;
			int mul = 0;
			while (tem != 0) {
				int rem = tem % 10;
				sum = rem;
				for (int j = 1; j < c; j++) {
					sum *= rem;

				}
				mul += sum;
				tem = tem / 10;
			}

			if (i == mul) {
				System.out.println("this is Armstrong number" + i);
			}
		}
	}

}

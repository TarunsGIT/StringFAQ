package in.co.sentence_reverse;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {
		String dob;
		Scanner in = new Scanner(System.in);
		dob = in.next();
		int number = Integer.parseInt(dob);
		int sum = 0, rev = 0;

		while (number > 9) {
			sum = 0;
			while (number > 0) {

				rev = number % 10;
				sum = sum + rev;
				number = number / 10;

			}
			number=sum;
		}

		System.out.println(sum);
		in.close();

	}
}

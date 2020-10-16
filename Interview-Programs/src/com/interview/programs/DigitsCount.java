
package com.interview.programs;

import java.util.Scanner;

/**
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings("resource")
public class DigitsCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter Digits");
		countDigits(scanner.nextInt());
	}

	private static void countDigits(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.err.println(String.format("no of digits is %s", count));
	}

}

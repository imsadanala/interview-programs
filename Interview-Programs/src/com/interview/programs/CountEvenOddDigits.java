package com.interview.programs;

import java.util.Scanner;

/**
 * 
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings({ "unused", "resource" })
public class CountEvenOddDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the digits");
		countDigits(scanner.nextInt());
	}

	private static void countDigits(int number) {
		int evenCount = 0, oddCount = 0, remainder = 0;
		while (number > 0) {
			remainder = number % 10;
			if (remainder % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			number = number / 10;
		}
		System.err.println(String.format("Even Digits are %s, Odd Digits are %s", evenCount, oddCount));
	}

}

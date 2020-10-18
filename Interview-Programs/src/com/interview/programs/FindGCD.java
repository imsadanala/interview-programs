/**
 * 
 */
package com.interview.programs;

import java.util.Scanner;

/**
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings("resource")
public class FindGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the gcd digits");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.err.println(findGCD(n1, n2));
	}

	private static int findGCD(int n1, int n2) {
		int gcd = 0, min = findMin(n1, n2);
		for (int i = 1; i <= min; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;

	}

	private static int findMin(int n1, int n2) {
		return n1 < n2 ? n1 : n2;
	}

}

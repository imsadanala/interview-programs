package com.interview.programs;

/**
 * 
 * @author Suresh Sadanala
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {

		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < a.length; i++) {
			if (!(i % 3 == 0 || i % 2 == 0 || i % 5 == 0 || i % 7 == 0)) {
				System.out.println(i);
			}

		}
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = 3; j < (a.length / 2 + 1); j++) {
				if (i % j == 0) {
					continue;
				} else {
					System.out.println(i);
				}

			}
		}

	}

}

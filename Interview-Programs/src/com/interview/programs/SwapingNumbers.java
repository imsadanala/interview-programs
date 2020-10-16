package com.interview.programs;

import java.util.Scanner;

/**
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings({ "resource", "unused" })
public class SwapingNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter X and Y values");
		swap3(scanner.nextInt(), scanner.nextInt());
	}

	/**
	 * using 3rd variable
	 * @param x
	 * @param y
	 */
	private static void swap1(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.err.println(String.format("Post swaping using Approach1 X %d, Y %d", x, y));
	}

	/**
	 * without using temp variable
	 * @param x
	 * @param y
	 */
	private static void swap2(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.err.println(String.format("Post swaping using Approach2 X %d, Y %d", x, y));
	}

	/**
	 * without using temp variable
	 * @param x
	 * @param y
	 */
	private static void swap3(int x, int y) {
		y = x + y - (x = y);
		System.err.println(String.format("Post swaping using Approach3 X %d, Y %d", x, y));
	}

}

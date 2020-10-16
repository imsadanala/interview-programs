package com.interview.programs;

import java.util.Scanner;

/**
 * 
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings("resource")
public class Pallindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter a number");
		int orgNum= scanner.nextInt();
		int remainder, revNum = 0;
		int number = orgNum;
		while (orgNum > 0) {
			remainder = orgNum % 10;
			revNum = revNum * 10 + remainder;
			orgNum = orgNum / 10;
		}
		System.err.println(revNum == number ? String.format(" %d is pallindrom ", number)
				: String.format(" %d is not pallindrom ", number));

	}

}

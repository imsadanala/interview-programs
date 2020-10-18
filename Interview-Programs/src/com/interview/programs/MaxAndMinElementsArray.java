/**
 * 
 */
package com.interview.programs;

/**
 * @author Suresh Sadanala
 */
public class MaxAndMinElementsArray {

	public static void main(String[] args) {
		int[] array = { 8, 3, 7, 10, 5, 2, 8 };
		maxAndMin(array);
	}

	/**
	 * to filter the Max and Min elements of an array
	 * 
	 * @param array
	 */
	private static void maxAndMin(int[] array) {
		int minElement = array[0], maxElement = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxElement) {
				maxElement = array[i];
			} else if (array[i] < minElement) {
				minElement = array[i];
			}
		}
		System.err.println(String.format("Max elem is %d, Min ele is %s", maxElement, minElement));
	}

}

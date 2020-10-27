package com.interview.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Suresh Sadanala
 *
 */
@SuppressWarnings("unused")
public class DuplicateElementsArray {

	public static void main(String[] args) {
		Integer[] a = { 4, 7, 2, 1, 4, 9, 7, 2, 1 };
		System.err.println(Arrays.toString(getDuplEle(a)));
		System.err.println(Arrays.toString(getDupEleUsingHashSet(a)));
	}

	/**
	 * method will return the duplicate elements
	 * 
	 * @param a
	 * @return
	 */
	private static Integer[] getDuplEle(Integer[] a) {
		Integer[] dupEle = new Integer[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					dupEle[index] = a[i];
					index++;
					break;
				}
			}
		}
		return Arrays.stream(dupEle).filter(ele -> ele != null).toArray(Integer[]::new);
	}

	private static Integer[] getDupEleUsingHashSet(Integer[] arrayEle) {
		Integer[] dupEle = new Integer[arrayEle.length];
		Integer i = 0;
		Set<Integer> dupCheck = new HashSet<>();
		for (Integer ele : arrayEle) {
			if (!dupCheck.add(ele)) {
				dupEle[i] = ele;
				i++;
			}
		}
		return Arrays.stream(dupEle).filter(ele -> ele != null).toArray(Integer[]::new);
	}

}

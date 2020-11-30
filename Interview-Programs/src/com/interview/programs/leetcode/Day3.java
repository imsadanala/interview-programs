/**
 * 
 */
package com.interview.programs.leetcode;

/**
 * @author Suresh Sadanala
 *
 */
public class Day3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Day3().strStr("a", "a"));
	}

	/**
	 * RefLink : https://leetcode.com/problems/implement-strstr/
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public int strStr(String haystack, String needle) {

		if (needle == null || needle == "" || (needle != null && needle.length() <= 0)) {
			return 0;
		}
		return haystack.indexOf(needle) >= 0 ? haystack.indexOf(needle) : -1;
	}

}

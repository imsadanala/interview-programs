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
		int[] arr = new int[] { 1, 3, 5, 6 };
		System.out.println(new Day3().searchInsert(arr, 7));
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

	/**
	 * RefLink: https://leetcode.com/problems/search-insert-position/
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		int newIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target < nums[i]) {
				return newIndex = i;
			} else if (nums[i] == target) {
				return newIndex = i;
			} else if (target > nums[i] && i == nums.length - 1) {
				newIndex = i;
				newIndex++;
				return newIndex;
			}
		}
		return newIndex;
	}
}

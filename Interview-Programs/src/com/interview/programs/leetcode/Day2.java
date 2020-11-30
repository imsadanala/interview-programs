/**
 * 
 */
package com.interview.programs.leetcode;

/**
 * @author Suresh Sadanala
 *
 */
public class Day2 {

	public static void main(String[] args) {

	}

	/**
	 * RefLink: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[count] != nums[i]) {
				count++;
				nums[count] = nums[i];
			}
		}
		return count + 1;
	}

	/**
	 * RefLink: https://leetcode.com/problems/remove-element/
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}

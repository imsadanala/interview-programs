package com.interview.programs.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Suresh Sadanala
 *
 */
public class Day1 {

	public static void main(String[] args) {
		System.out.println(new Day1().isValid("()[]{}"));
	}

	/**
	 * refLink: https://leetcode.com/problems/two-sum/
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		int output[] = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			int j = i;
			for (j++; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					return output;
				}
			}
		}
		return output;
	}

	/**
	 * RefLink: https://leetcode.com/problems/reverse-integer/
	 * 
	 * @param x
	 * @return
	 */

	public static int reverse(int x) {

		if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
			return 0;
		}
		Long rev = 0L;
		while (x > 0) {
			int remainder = x % 10;
			rev = rev * 10 + remainder;
			System.out.println(rev);
			x = x / 10;
		}

		return rev.intValue();
	}

	/**
	 * RefLink: https://leetcode.com/problems/palindrome-number/
	 * 
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int org = x;
		int rev = 0;
		int remainder = 0;
		while (x > 0) {
			remainder = x % 10;
			rev = rev * 10 + remainder;
			x /= 10;
		}
		if (org == rev) {
			return true;
		}
		return false;
	}

	/**
	 * RefLink: https://leetcode.com/problems/roman-to-integer/
	 * 
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		Map<Character, Integer> romansMap = new HashMap<>();
		romansMap.put('I', 1);
		romansMap.put('V', 5);
		romansMap.put('X', 10);
		romansMap.put('L', 50);
		romansMap.put('C', 100);
		romansMap.put('D', 500);
		romansMap.put('M', 1000);
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && (romansMap.get(s.charAt(i)) > romansMap.get(s.charAt(i - 1)))) {
				result = result - 2 * (romansMap.get(s.charAt(i - 1)));
			}
			result = result + romansMap.get(s.charAt(i));
		}
		return result;
	}

	/**
	 * RefLink: https://leetcode.com/problems/longest-common-prefix/
	 * 
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}

		}
		return prefix;
	}

	/**
	 * RefLink: https://leetcode.com/problems/valid-parentheses/
	 * 
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> parenthesesStack = new Stack<>();

		for (Character param : s.toCharArray()) {
			boolean isValid = false;
			if (param == '(' || param == '[' || param == '{') {
				parenthesesStack.push(param);
				isValid = true;
			} else if (param == ')' && !parenthesesStack.isEmpty() && parenthesesStack.peek() == '(') {
				parenthesesStack.pop();
				isValid = true;
			} else if (param == ']' && !parenthesesStack.isEmpty() && parenthesesStack.peek() == '[') {
				parenthesesStack.pop();
				isValid = true;
			} else if (param == '}' && !parenthesesStack.isEmpty() && parenthesesStack.peek() == '{') {
				parenthesesStack.pop();
				isValid = true;
			}
			if (!isValid)
				return false;
		}
		return parenthesesStack.isEmpty();
	}

}

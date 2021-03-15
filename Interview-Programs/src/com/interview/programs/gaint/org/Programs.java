package com.interview.programs.gaint.org;

/*
 * 
 */
public class Programs {
	
	
	/**
	 * Consider 2 strings b and a. write a code snippet that determines whether we can obtain 2 identical strings
	 * by performing single edit b/a. More precisely, we can insert, delete or replace by single character in "b" or in "a", and "b" will become equal to "a"
	 *  Examples:
	 *  live, love  -> one edit as "o" can replace by "i" or vice versa
	 *  lve, live   -> one edit, insert in "i" in "lve" or remove "i" from "live"
	 *  loves, love -> one edit, insert s in "love" or remove s in "love"
	 *  live, leave -> more than one edit
	 *  lie, lines  -> more than one edit  
	 *  live, loves -> more than one edit
	 *  Ref: https://youtu.be/5FOWy_2tzck
	 *
	 */
	public static boolean oneEditAway(String a, String b) {

		if (Math.abs(a.length() - b.length()) > 1) {
			return false;
		}

		String shorterStr = a;
		String longerStr = b;
		if (Math.abs(a.length() - b.length()) != 0) {
			shorterStr = a.length() < b.length() ? a : b;
			longerStr = a.length() > b.length() ? a : b;
		}

		int sIndex = 0;
		int lIndex = 0;
		int mismatchCount = Math.abs(a.length() - b.length());

		while (sIndex < shorterStr.length() && lIndex < longerStr.length()) {
			if (shorterStr.charAt(sIndex) != longerStr.charAt(lIndex)) {
				mismatchCount++;
			}
			if (mismatchCount > 1) {
				return false;
			}

			if (shorterStr.length() == longerStr.length()) {
				sIndex++;
			} else {
				sIndex++;
			}

			lIndex++;
		}

		return true;
	}
	
}

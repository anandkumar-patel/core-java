package anand.tests.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubString {

	public static void main(String[] args) {
		String input1 = "abcabcbb";
		String input2 = "bbbbb";
		String input3 = "pwwkew";
		System.out.println(getSubStringLength(input3));

	}
	
	public static int getSubStringLength(String str) {
		int result = 0;
		int left = 0, right = 0;
		Set<Character> set = new HashSet<>();
		while (right < str.length()) {
			Character ch = str.charAt(right);
			if (set.add(ch)) {
				result = Math.max(result, right - left + 1);
				right++;
			} else {
				while (str.charAt(left) != ch) {
					set.remove(str.charAt(left));
					left++;
				}
				set.remove(ch);
				left++;
			}
		}
		return result;
	}

}

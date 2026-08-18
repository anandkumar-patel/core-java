package anand.java8.collection;

import java.util.Arrays;

public class StringSortDescendingByStringBuilder {
	static String sortAsc(String str) {
		// convert String to char array
		char[] arr = str.toCharArray();

		// sort char array in alphabetically / ascending order
		Arrays.sort(arr);

		// String join char array
		return String.valueOf(arr);
	}

	static String sortDesc(String str) {
		return new StringBuilder(sortAsc(str)).reverse().toString();
	}

	public static void main(String[] args) {
		String str = "backndop";
		System.out.println(sortDesc(str));
	}
}

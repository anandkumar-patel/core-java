package anand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) {
		String[] strings = {"anand", "kumar", "patel"};
		Object[] objects = strings;

		objects[1] = 1123;
		System.out.println(objects[0]);

	}
}

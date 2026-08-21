package anand;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) {
		int[][] nums = {{23, 13, 12, 14}, {2, 3, 4, 5}};

		Stream<int[]> stream1 = Arrays.stream(nums);

		Stream<IntStream> st2 = stream1.map(arr->Arrays.stream(arr));


	}
}

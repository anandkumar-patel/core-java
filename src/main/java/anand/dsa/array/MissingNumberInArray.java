package anand.dsa.array;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int[] input = { 1, 3, 4, 5 };
		int missing = missingNumber(input);
		System.out.println("Missing number is :" + missing);
	}

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int nXOR = 0;
		for (int i = 0; i <= n; i++) {
			nXOR ^= i;
		}

		int aXOR = 0;
		for (int i = 0; i < n; i++) {
			aXOR ^= nums[i];
		}

		return aXOR ^ nXOR;
	}
}

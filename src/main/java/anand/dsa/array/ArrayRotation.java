package anand.dsa.array;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		System.out.println("Original Array :" + Arrays.toString(arr));

		int[] newArr = rotateArray(arr, 3, arr.length);
		System.out.println("Shifted Array : " + Arrays.toString(newArr));

	}

	private static int[] rotateArray(int[] a, int d, int size) {
		int[] temparr = new int[d];
		for (int i = 0; i < size; i++) {
			if (i < d) {
				temparr[i] = a[i];
			} else {
				a[i - d] = a[i];
			}
		}
		return a;
	}

}

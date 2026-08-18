package anand.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));

		int low = 0;
		int high = x.length - 1;

		mergeSort(x, low, high);
		System.out.println(Arrays.toString(x));

	}

	public static void mergeSort(int[] arr, int left, int right) {
		int mid = (left + right) / 2;
		if (left < right) {
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, mid + 1, right);
		}
	}

	public static void merge(int[] arr, int left, int mid, int midPlus, int right) {

	}

}

package anand.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));

		int low = 0;
		int high = x.length - 1;

		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}

	public static void quickSort(int[] arr, int left, int right) {
		if (arr == null || arr.length == 0)
			return;
		if (left < right) {
			int pivot = setPivot(arr, left, right);
			// left sub array sorting
			quickSort(arr, left, pivot - 1);
			// right sub array sorting
			quickSort(arr, pivot + 1, right);
		}
	}

	public static int setPivot(int[] arr, int left, int right) {
		int pivotEl = left;
		int i = left + 1;
		int j = right;
		while (i < j) {
			while (arr[left] < arr[pivotEl] && i < right) {
				i++;
			}
			while (arr[right] > arr[pivotEl] && j > left) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		if (i > j) {

		}
		return j;
	}

}

/**
 * Quick sort is divide and concur based sorting technique.
 * 
 * 		*******STEPS********
 * 1- Take the first element of array as pivot element.
 * 2- Take one variable i at the start of array and j at the end of array.
 * 3- Iterate the element of array from i position until find an element greater than pivot, stop there
 * 		3A- Now iterate from j until found a element less than pivot.
 * 		3B- Check i is less than j, means they didn't cross each other
 * 				swap the element[i] with element[j]
 * 		else 
 * 				swap the pivot with element[j]
 * 
 * Where as if partitioning leads to almost equal subarrays, then the running time is the best, 
 * with time complexity as O(n*log n).
 * 		Worst Case Time Complexity [ Big-O ]: O(n2)
 * 		Best Case Time Complexity [Big-omega]: O(n*log n)
 * 		Average Time Complexity [Big-theta]: O(n*log n)
 * 		Space Complexity: O(n*log n)
 */

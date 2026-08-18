package anand.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr1 = { 9, 2, 4, 7, 3, 7, 10 };
		int[] arr2  = {3, 6, 1, 8, 4, 5};
		int[] arr = { 10, 14, 12, 10, 12, 16 };
		System.out.println(Arrays.toString(arr));
 
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			// Assume the minimum element is the first element of the unsorted part
			int minIndex = i;
			boolean swapped = false;
			for (int j = i + 1; j < n; j++) {
				// Find the minimum element in the remaining unsorted array
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
					swapped = true;
				}
			}

			// Swap only if a smaller element was found
			if (swapped) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
			System.out.println("After pass "+(i+1)+" : "+Arrays.toString(arr));
		}
	}
}
/**
 * Selection sort is conceptually the most simplest sorting algorithm. 
 * This algorithm will first find the smallest element in the array and 
 * swap it with the element in the first position, 
 * then it will find the second smallest element and swap it with the 
 * element in the second position, 
 * and it will keep on doing this until the entire array is sorted.
 * 
 * It is called selection sort because it repeatedly selects the next-smallest element and swaps it 
 * into the right place.
 * 
 * 
 * Hence for a given input size of n, following will be the time and space complexity for selection sort algorithm:
 * 		Worst Case Time Complexity [ Big-O ]: O(n2)
 * 		Best Case Time Complexity [Big-omega]: O(n2)
 * 		Average Time Complexity [Big-theta]: O(n2)
 * 		Space Complexity: O(1)
 */

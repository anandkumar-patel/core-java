package anand.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int[] arr1 = { 9, 2, 4, 7, 3, 7, 10 };
		int[] arr  = {3, 6, 1, 8, 4, 5};
		int[] arr3 = { 10, 14, 12, 10, 12, 16 };
		
		System.out.println(Arrays.toString(arr));

		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isSorted = true;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}

	// bubble sort using recursion
	public void bubbleSort(int arr[], int n) {
		// Base case
		if (n == 1)
			return;

		/*
		 * One pass of bubble sort. After this pass, the largest element is moved (or
		 * bubbled) to end
		 * 
		 */
		for (int i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1]) { // swap arr[i], arr[i+1]
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		// Largest element is fixed, recur for remaining array
		bubbleSort(arr, n - 1);
	}
}

/*
 * This sorting algorithm works on principle of largest element get popped up at
 * last position first, then second largest .... until smallest element reached.
 * As it's name suggest bigger bubble get out first from water.
 * 
 * Following are the Time and Space complexity for the Bubble Sort algorithm.
 * Worst Case Time Complexity [ Big-O ]: O(n2) 
 * Best Case Time Complexity [Big-omega]: O(n) 
 * Average Time Complexity [Big-theta]: O(n2) 
 * Space Complexity: O(1)
 * 
 * Complexity Analysis of Bubble Sort In Bubble Sort, n-1 comparisons will be
 * done in the 1st pass, n-2 in 2nd pass, n-3 in 3rd pass and so on.
 * 
 * So the total number of comparisons will be, = (n-1) + (n-2) + (n-3) + ..... +
 * 3 + 2 + 1 Sum = n(n-1)/2 i.e O(n2)
 */

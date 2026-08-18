package anand.dsa.sorting;

import java.util.Arrays;

public class InsertionShort {

	public static void main(String[] args) {

		int[] arr1 = { 9, 2, 4, 7, 3, 7, 10 };
		int[] arr = { 3, 6, 1, 8, 4, 5 };
		System.out.println(Arrays.toString(arr));

		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.println("After pass " + i + Arrays.toString(arr));
		}
	}

}

/**
 * Consider you have 10 cards out of a deck of cards in your hand. And they are
 * sorted, or arranged in the ascending order of their numbers. If I give you
 * another card, and ask you to insert the card in just the right position, so
 * that the cards in your hand are still sorted. What will you do?
 * 
 * 
 * Worst Case Time Complexity [ Big-O ]: O(n2) 
 * Best Case Time Complexity [Big-omega]: O(n) 
 * Average Time Complexity [Big-theta]: O(n2) 
 * Space Complexity: O(1)
 * 
 */

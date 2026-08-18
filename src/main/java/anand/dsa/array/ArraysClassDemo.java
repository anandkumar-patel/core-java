package anand.dsa.array;

import java.util.Arrays;

public class ArraysClassDemo {
	public static void main(String[] args) {
		int ar[] = { 14, 6, 1, 15, 3, 9, 7, 5, 11 };

		// To print the elements in one line
		System.out.println(Arrays.toString(ar));

		// To sort a specific range of array in ascending order.
		Arrays.sort(ar, 0, 4);
		System.out.println("Sorted array in range" + " of 0-4 =>\n" + Arrays.toString(ar));

		// To sort the complete array in ascending order.
		/**
		 * NOTE- Uses quick sort
		 * */
        Arrays.sort(ar);
        System.out.println("Completely sorted order =>\n"
                                  + Arrays.toString(ar));

		// binary search
		int index = Arrays.binarySearch(ar, 8);
		System.out.println("Position of 8 in sorted" + " arrays is => \n" + index);

		// Copy the whole array
		int[] copy = Arrays.copyOf(ar, ar.length);
		System.out.println("Copied array => \n" + Arrays.toString(copy));

		// Copy a specified range into a new array.
		/**
		 * NOTE - The initial index of the range (from) must lie between zero and original.length, inclusive.
		 * */
		int[] rcopy = Arrays.copyOfRange(ar, 9, 11);
		System.out.println("Copied subarray => \n" + Arrays.toString(rcopy));
	
		// To fill a range with a particular value
        Arrays.fill(ar, 0, 3, 0);
        System.out.println("Array filled with 0 "+
          "from 0 to 3 => \n" + Arrays.toString(ar));
 
        // To fill complete array with a particular value
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled"+
                  " with 10=>\n"+Arrays.toString(ar));
	}
}

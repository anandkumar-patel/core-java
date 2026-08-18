package anand.dsa.array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7];

		System.out.println("===================== Using System class =================================");
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));

		System.out.println("===================== Using Array class =================================");

		int[] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Source array = " + Arrays.toString(source));
		int[] dest1 = Arrays.copyOf(source, source.length);
		System.out.println("Copy all elements of array. Result array = " + Arrays.toString(dest1));

		int[] dest2 = Arrays.copyOf(source, 5);
		System.out.println("Copy first five elements of array. Result array = " + Arrays.toString(dest2));

		int[] dest3 = Arrays.copyOfRange(source, source.length - 3, source.length);
		System.out.println("Copy last three elements of array. Result array = " + Arrays.toString(dest3));

		System.out.println("===================== Using clone method =================================");
		int[] dest4 = source.clone();
		System.out.println("Copy all elements of array. Result array = " + Arrays.toString(dest4));
	}
}

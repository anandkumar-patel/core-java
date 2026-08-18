package anand.dsa.searching;

public class LinearSearching {
	public static void main(String[] args) {
		int[] data = { 11, 23, 45, 21, 34, 46, 42 };
		int searchedItem = 23;
		int result = linearSearch(data, searchedItem);
		if (result < 0) {
			System.out.println(searchedItem + " is not present in list");
		} else {
			System.out.println(searchedItem + " is present at index : " + result + " in the list");
		}

	}

	public static int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linearSearchByRecursion(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}
		return -1;
	}
}

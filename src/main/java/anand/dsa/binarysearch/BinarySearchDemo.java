package anand.dsa.binarysearch;

public class BinarySearchDemo {
	
	public static void main(String args[])
	{
		BinarySearchDemo ob = new BinarySearchDemo();
		int arr[] = {2,3,4,10,40,43};
		int length = arr.length;
		int find = 10;
		int result = ob.binarySearch(arr,0,length,find);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "+result);
	}
	
	// Returns index of x if it is present in array else return -1
	int binarySearch(int arr[], int position, int length, int x)
	{
		if (length>position)
		{
			int mid = position + (length - position)/2;

			// If the element is present at the middle itself
			if (arr[mid] == x)
			return mid;

			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > x)
			return binarySearch(arr, position, mid-1, x);

			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, mid+1, length, x);
		}
		
		// We reach here when element is not present in array
		return -1;
	}	
}


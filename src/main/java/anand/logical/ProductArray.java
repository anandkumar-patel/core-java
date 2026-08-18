package anand.logical;

/**
 * 
 * @author anandpatel
 *
 * Problem : Given an array arr[] of n integers, construct a Product Array prod[] (of same size) 
 * such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. Solve it
 */
public class ProductArray {
	public static void main(String[] args) {
		
	}
	
	public int[] getProductArray(int[] inputArr) {
		int len = inputArr.length;
		int sum = 0;
		int[] tempArr = new int[len];

		for (int i = 0; i < len; i++) {
			sum *= inputArr[i];
		}

		for (int i = 0; i < len; i++) {
			tempArr[i] = sum / inputArr[i];
		}
		return tempArr;
	}

}

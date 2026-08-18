package anand.dynamic;

import java.util.HashMap;
import java.util.Map;

public class LonelyInteger {

	public static void main(String[] args) {
		
	}

	public int lonelyinteger(int[] a) {
		Map<Integer, Integer> data = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			Integer count = data.get(a[i]);
		}
		return 0;
	}
	public int lonelyintegerBit(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for(int j=i+1;j<a.length;j++)
				System.out.println("");
		}
		return 0;
	}
}
/*  -------PROBLEM --------
 * You will be given an array of integers. All of the integers except one occur twice. 
 * That one is unique in the array.
 * Given an array of integers, find and print the unique element.
 * For example, a=[1,2,3,4,3,2,1] , the unique element is 4.
 * 
 */

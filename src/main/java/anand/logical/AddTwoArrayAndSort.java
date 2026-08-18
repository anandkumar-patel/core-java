package anand.logical;


import java.util.Arrays;

public class AddTwoArrayAndSort {
	public static void main(String[] args) {
		AddTwoArrayAndSort demo=new AddTwoArrayAndSort();
		int a[]={3,2,7,6,4,9};
		int b[]={1,4,6,5,8};
		int c[]=demo.concat(a, b);
		for (int i : c) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		Arrays.sort(c);
		for (int i : c) {
			System.out.print(i+" ");
		}
	}
	
	public int[] concat(int[] a, int[] b) {
		   int aLen = a.length;
		   int bLen = b.length;
		   int[] c= new int[aLen+bLen];
		   System.arraycopy(a, 0, c, 0, aLen);
		   System.arraycopy(b, 0, c, aLen, bLen);
		   return c;
		}
}

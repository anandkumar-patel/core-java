package anand.dsa.array;

public class SortArrayWithEle1ToN {

	public static void main(String[] args) {

		int[] out = sortTheArray(new int[] {5,3,1,4,2}); 
		for(int i=0;i<out.length;i++) {
			System.out.print(out[i] +" ");
		}
		
	}
	
	
	public static int[] sortTheArray(int[] in) {
		for (int i = 0; i < in.length; i++) {
			if (in[in[i] - 1] != in[i]) {
				int temp = in[in[i] - 1];
				in[in[i] - 1] = in[i];
				in[i] = temp;
			}
		}
		return in;
	}

}

/*
 
 When an array has all its elements in the range of 1 to N ( where N is the length of the array ) 
 we can use the indices to store the ordered state of the elements in the array. 
 This ordered-state can in-turn be used to solve a variety of problems which we’ll explore soon. 
 First, a very simple demonstration of this property. 
 
 1- Sort in Linear Time :

 
*/

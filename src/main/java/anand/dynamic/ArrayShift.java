package anand.dynamic;

public class ArrayShift {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		shiftBy(arr,2,6);
	}
	public static void shiftBy(int []arr,int shift,int arraySize){
		for(int i=0;i<arraySize;i++){
			arr[6-i-shift]=arr[i];
			arr[i]=arr[i+shift];
		}
	
	}

}

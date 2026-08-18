package anand.dsa.array;

public class IndexRangeSumArray {

	public static void main(String[] args) {

		int[] nums = { -2, 0, 3, -5, 2, -1 };
		int i=0;
		int j =3;
		int[] sumArr = sumArray(nums);
		int sum = sumRange(sumArr,i,j);
		System.out.println("Sum of array between indices"+i+", "+j+" is :"+sum);
	}

	private static int[] sumArray(int[] nums) {
		int[] rangeSum = new int[nums.length];
        
        if(nums.length>0){
            rangeSum[0] = nums[0]; 
            for(int i=1; i<nums.length; i++){
                rangeSum[i] = rangeSum[i-1] + nums[i];
            }
        }
        return  rangeSum;
    }
     
    public static int sumRange(int[] rangeSum,int i, int j) {
        if(i==0) return rangeSum[j];
        return rangeSum[j] - rangeSum[i-1];
    }

}
/*
Write a service which given an integer array, returns the sum of the elements 
between indices i and j (i ≤ j), inclusive. 
Example: nums = [-2, 0, 3, -5, 2, -1]
sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3

Also, the input set does not change during the calls to the sumRange(i,j).

*/

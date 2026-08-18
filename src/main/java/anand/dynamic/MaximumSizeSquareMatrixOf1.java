package anand.dynamic;

public class MaximumSizeSquareMatrixOf1 {

	public static void main(String[] args) {

		int arr[][] = { 
				{ 0, 1, 1, 0, 1 }, 
				{ 1, 1, 0, 1, 0 }, 
				{ 0, 1, 1, 1, 0 }, 
				{ 1, 1, 1, 1, 0 }, 
				{ 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0 } };
		printMaxSizeMatrixOf1(arr);
	}
	
	
	private static void printMaxSizeMatrixOf1(int[][] inputArr) {
		int row = inputArr.length;
		int column = inputArr[0].length;
		
		
		for(int i =1;i<row;i++) {
			for(int j =1;j<column;j++) {
				if(inputArr[i][j]==1)
					inputArr[i][j] =  Math.min(Math.min(inputArr[i][j-1], inputArr[i-1][j-1]),inputArr[i-1][j])+1;
			}
		}
		
		
		System.out.println("Original Array :");
		for(int i =0;i<row;i++) {
			for(int j =0;j<column;j++) {
				System.out.print(inputArr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("New Array :");
		for(int i =0;i<row;i++) {
			for(int j =0;j<column;j++) {
				System.out.print(inputArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

/**
 *  The Logic of the Solution is  for current position value 
 *  	tempArr[i][j]  = minimum of(one postion left, one postion top and one postion diagonal top) + 1;
 *  i.e tempArr[i][j]  = minimum of(inputArr[i-1][j] and inputArr[i][j-1] and inputArr[i-1][j-1]) +1;
 *  
 *  Now the Maximum value in tempArr will tell the new square matrix dimenssion and postiont from 
 *  the postion of max element at i,j is  tempArr[i-maxElm][j-maxElm] to tempArr[i][j]
 */

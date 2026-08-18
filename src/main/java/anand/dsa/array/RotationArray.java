package anand.dsa.array;

public class RotationArray {
	public static void main(String[] args) {

		RotationArray obj = new RotationArray();
		int inputArr[] = { 11, 12, 13, 14, 15, 16 };
		int rotatedBy = 3;
		int resultArr[] = obj.roatedArray(inputArr, rotatedBy);
		obj.printArray(resultArr);

	}

	public int[] roatedArray(int[] inArr, int rotatedBy) {
		int len = inArr.length;
		int[] tempArr = new int[len];
		for (int i = 0; i < len; i++) {
			if (i + rotatedBy < len) {
				tempArr[i] = inArr[i + rotatedBy];
			} else {
				tempArr[i] = inArr[(i + rotatedBy) - len];
			}
		}
		return tempArr;
	}

	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}

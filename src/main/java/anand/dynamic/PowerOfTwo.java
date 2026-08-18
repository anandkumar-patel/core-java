package anand.dynamic;

public class PowerOfTwo {

	public static void main(String[] args) {
		PowerOfTwo obj = new PowerOfTwo();
		int number = 2;
		System.out.println("Is " + number + " power of two :" + obj.isPowerOfTwo(number));

	}

	public boolean isPowerOfTwo(int number) {
		return (number > 0) && ((number & (number - 1)) == 0);
	}

	public boolean isPowerOfTwo1(int number) {
		if (number <= 0) {
			return false;
		}
		while (number > 1) {
			if (number % 2 != 0) {
				return false;
			}
			number = number / 2;
		}
		return true;
	}

	public boolean isPowerOfTwoRecursive(int number) {
		if (number <= 0) {
			return false;
		}
		while (number > 1) {
			if (number % 2 != 0) {
				return false;
			}
			number = number / 2;
		}
		return true;
	}

}

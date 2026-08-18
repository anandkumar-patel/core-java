package anand.mathematical;

public class DoubleToInt {

	public static void main(String[] args) {
		// double to int conversion using casting
		int value = (int) 6.14; // 6
		int score = (int) 6.99; // 6

		System.out.printf("double : %f, int : %d %n", 6.14, value);
		System.out.printf("double : %f, int : %d %n", 6.99, score);

		// double to int after rounding using Math.round()
		int a = (int) Math.round(3.14); // 3
		int b = (int) Math.round(3.99); // 4
		int c = (int) Math.round(3.5); // 4

		System.out.printf("double : %f, int : %d %n", 3.14, a);
		System.out.printf("double : %f, int : %d %n", 3.99, b);
		System.out.printf("double : %f, int : %d %n", 3.5, c);

		// Double to int using wrapper class
		Double d = 7.99; // 7
		int i = d.intValue();
		System.out.printf("Double : %f, int : %d %n", d, i);
	}

}

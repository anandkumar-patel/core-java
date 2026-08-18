package anand.mathematical;

import java.math.BigDecimal;

public class BigDecimalCompare {

	public static void main(String[] args) {
		// simpleFloatsComparison();
		//thresholdBasedFloatsComparison();
		bigDecimalComparison();
	}

	private static void simpleFloatsComparison() {
		// Method 1
		double f1 = .0;
		for (int i = 1; i <= 11; i++) {
			f1 += .1;
		}

		// Method 2
		double f2 = .1 * 11;

		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);

		if (f1 == f2)
			System.out.println("f1 and f2 are equal\n");
		else
			System.out.println("f1 and f2 are not equal\n");
	}

	private static void thresholdBasedFloatsComparison() {
		final double THRESHOLD = .0001;

		// Method 1
		double f1 = .0;
		for (int i = 1; i <= 11; i++) {
			f1 += .1;
		}

		// Method 2
		double f2 = .1 * 11;

		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);

		if (Math.abs(f1 - f2) < THRESHOLD)
			System.out.println("f1 and f2 are equal using threshold\n");
		else
			System.out.println("f1 and f2 are not equal using threshold\n");
	}

	private static void bigDecimalComparison() {
		// Method 1
		BigDecimal f1 = new BigDecimal("0.0");
		BigDecimal pointOne = new BigDecimal("0.1");
		for (int i = 1; i <= 11; i++) {
			f1 = f1.add(pointOne);
		}

		// Method 2
		BigDecimal f2 = new BigDecimal("0.1");
		BigDecimal eleven = new BigDecimal("11");
		f2 = f2.multiply(eleven);

		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);

		if (f1.compareTo(f2) == 0)
			System.out.println("f1 and f2 are equal using BigDecimal\n");
		else
			System.out.println("f1 and f2 are not equal using BigDecimal\n");
	}
	/*
	 * Never use the equals() method to compare BigDecimal instances. 
	 * That is because this equals function will compare the scale. If the scale is different, equals() will return false, 
	 * even if they are the same number mathematically.
	 */
	private static void testBdEquality() 
	{
	     BigDecimal a = new BigDecimal("2.00");
	     BigDecimal b = new BigDecimal("2.0");
	 
	     System.out.println(a.equals(b));           // false
	 
	     System.out.println(a.compareTo(b) == 0);   // true
	}
}

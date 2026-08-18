package anand.util.date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {

		Date now = new Date();

		DateFormat defaultDf = DateFormat.getDateInstance();
		// DateFormat defaultDf = DateFormat.getTimeInstance();
		// By above line you can get also the time instance
		DateFormat shortDf = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat mediumDf = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat longDf = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat fullDf = DateFormat.getDateInstance(DateFormat.FULL);

		System.out.println(" 1. " + defaultDf.format(now));
		System.out.println(" 2. " + shortDf.format(now));
		System.out.println(" 3. " + mediumDf.format(now));
		System.out.println(" 4. " + longDf.format(now));
		System.out.println(" 5. " + fullDf.format(now));
	}
}

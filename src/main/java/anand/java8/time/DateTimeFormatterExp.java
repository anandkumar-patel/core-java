package anand.java8.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExp {

	public static void main(String[] args) {
		LocalDate dt1 = LocalDate.now();
		System.out.println(dt1);
		
		LocalDate dt2 = LocalDate.parse("2021-01-28");
		System.out.println(dt2);
		
		DateTimeFormatter myFormatter1 = DateTimeFormatter.ofPattern("yyy/MM/dd");
		String formatedDateString = dt1.format(myFormatter1);
		System.out.println(formatedDateString);
		
		DateTimeFormatter myFormatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dt3 = LocalDate.parse("23-09-2021",myFormatter2);
		
		System.out.println(dt3);
		/*
		 * y - year
		 * M - month of year
		 * d - day of month
		 * H - hour of day(0-23)
		 * h - hour of am/pm (1-12)
		 * m - minute of hour
		 * s - second of minute
		 * S - fraction of second
		 * a - am/pm marker
		 * E - day of week
		 * D - day of year
		 * F - day of week in month
		 * w - week of year
		 * W - week of month
		 * k - hour of day (1-24)
		 * K - hour of am/pm(0-11)
		 * z - time zone name
		 * Z - time zone offset
		 */
	}

}

package anand.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExp {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		int dayOfMonth = now.getDayOfMonth();
		Month month = now.getMonth();
		int monthValue = now.getMonthValue();
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		
		int dayOfYear = now.getDayOfYear();
		int year = now.getYear();
		
		LocalDate yesterday = now.minusDays(1);
		LocalDate backDate = now.minusMonths(100);
		System.out.println(now);
		System.out.println(yesterday);
		System.out.println(backDate);
		
		if(now.isAfter(yesterday)) {
			System.out.println("now is after the yesterday");
		} else {
			System.out.println("false");
		}
		
		
		LocalDate customDate = LocalDate.of(1990, 11, 22);
		
	}

}

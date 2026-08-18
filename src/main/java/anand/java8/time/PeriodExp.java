package anand.java8.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExp {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate then = LocalDate.of(2012, 10, 22);
		Period p1 = Period.between(now, then);
		System.out.println(p1);
	}

}

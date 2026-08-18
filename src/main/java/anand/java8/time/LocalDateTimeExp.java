package anand.java8.time;

import java.time.LocalDateTime;

public class LocalDateTimeExp {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime yesterday = now.minusDays(1);
		if(now.isAfter(yesterday)) {
			System.out.println("now is after yesterday");
		} else {
			System.out.println("now is before yesterday");
		}
		
		
		LocalDateTime custom = LocalDateTime.of(1986, 06, 25, 23, 34);
		System.out.println(custom);
		
		LocalDateTime parsed = LocalDateTime.parse("1985-01-08T13:34");
		System.out.println(parsed);
		
		
	}

}

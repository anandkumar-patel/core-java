package anand.java8.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

// It is used for small time unit like millisecond, second, minute, hours.
public class DurationExp {

	public static void main(String[] args) {
		Instant start = Instant.now();
		for(int i =0;i<10000;i++) {
			int j =212;
		}
		
		Instant end = Instant.now();
		Duration d1 = Duration.between(start, end);
		System.out.println(d1);
		
		Duration d2 = Duration.ofMinutes(3);
		System.out.println(d2);
		
		LocalDateTime date1 = LocalDateTime.of(2012, 10, 12,11,12,34);
		LocalDateTime date2 = LocalDateTime.now();
		
		Duration d3 = Duration.between(date1, date2);
		System.out.println(d3);
		
	}

}

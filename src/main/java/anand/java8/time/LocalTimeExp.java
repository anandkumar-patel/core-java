package anand.java8.time;

import java.time.LocalTime;

public class LocalTimeExp {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		now.getHour();
		
		LocalTime beforeOneHour= now.minusHours(1);
		System.out.println(beforeOneHour);
		
		LocalTime customTime = LocalTime.of(13,25 , 30, 500);
		System.out.println(customTime);
		
		if(now.isBefore(beforeOneHour)) {
			System.out.println("now is before");
		} else {
			System.out.println("now is after");
		}
		
		LocalTime parsedTime = LocalTime.parse("15:30:45");
		System.out.println(parsedTime);
		
		
	}

}

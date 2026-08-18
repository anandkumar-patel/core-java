package anand.java8.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExp {

	public static void main(String[] args) {
		ZonedDateTime india = ZonedDateTime.now();
		System.out.println(india);
		
		ZonedDateTime newyork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyork);
		
		
//		Set<String> zones = ZoneId.getAvailableZoneIds();
//		System.out.println(zones);
		
		ZonedDateTime custom = ZonedDateTime.of(2020, 11, 22, 11, 34, 34, 4500, ZoneId.of("America/New_York"));
		System.out.println(custom);
		
		String zoneDateTimeString = "2018-07-30T03:43:57.912369032-04:00[America/New_York]";
		
		ZonedDateTime parsed = ZonedDateTime.parse(zoneDateTimeString);
		System.out.println(parsed);
	}

}

package anand.java8.time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantExp {

	public static void main(String[] args) {

		long currentMillis = System.currentTimeMillis();
		System.out.println(currentMillis);
		
		Instant india = Instant.now();
		System.out.println(india);
		
		long epochSec = india.getEpochSecond();
		System.out.println(epochSec);
		
		ZonedDateTime us = india.atZone(ZoneId.of("America/New_York"));
		System.out.println(us);
		
		Instant custom = Instant.ofEpochSecond(45694949493L);	
		System.out.println(custom);
		}
}

package anand.enumeration;

import java.util.EnumMap;

public class EnumMapExample {
	public static void main(String[] args) {
		// Create an EnumMap that contains all constants of the Car enum.
		EnumMap<Car, Integer> cars = new EnumMap<Car, Integer>(Car.class);

		// Put some values in the EnumMap.
		cars.put(Car.BMW, Car.BMW.getPrice());
		cars.put(Car.AUDI, Car.AUDI.getPrice());
		cars.put(Car.MERCEDES, Car.MERCEDES.getPrice());

		// Print the values of an EnumMap.
		for (Car c : cars.keySet())
			System.out.println(c.name());

		System.out.println(cars.size());

		// Remove a Day object.
		cars.remove(Car.BMW);
		System.out.println("After removing Car.BMW, size: " + cars.size());

		// Insert a Day object.
		cars.put(Car.valueOf("BMW"), Car.BMW.getPrice());
		System.out.println("Size is now: " + cars.size());
	}
}

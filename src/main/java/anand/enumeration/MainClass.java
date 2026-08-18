package anand.enumeration;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("FRIDAY".compareTo(Day.FRIDAY.name()) + "\n");

		// Printing all constants of an enum.
		for (Day day : Day.values())
			System.out.println(day.name());

		System.out.println();

		// The following statements are illegal.
		// Day d = new Day();
		// Day.FRIDAY = Day.valueOf("New Value");

		Car c = Car.AUDI;
		System.out.println(c.name() + ": " + c.getPrice());

		Car c1 = Car.valueOf("MERCEDES");
		System.out.println(c1.toString());

		// The following statement throws an java.lang.IllegalArgumentException.
		// Car c2 = Car.valueOf("Bmw");
		
		/**
		 * Look closly how we change the constant's field value.
		 */
		Day d1 = Day.MONDAY;
		d1.setDayOfWeek(31);
		d1.setMood("I am Happy");
		System.out.println(d1.getDayOfWeek() +" "+d1.getMood());
		
		Day d2 = Day.MONDAY;
		System.out.println(d2.getDayOfWeek() +" "+d2.getMood());
	}
}

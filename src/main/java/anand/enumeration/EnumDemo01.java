package anand.enumeration;

public class EnumDemo01 {
	enum Season {
		WINTER(5, "Five"), SPRING(10, "Ten"), SUMMER(15, "Fifteen"), FALL(20, "Twenty");

		private int value;
		private String data;

		private Season(int value, String data) {
			this.value = value;
			this.data = data;
		}

	}

	enum Day {
		MONDAY("Today is Monday"), TUESDAY("Today is Tuesday"), WEDNESDAY("Today is Wednesday"), THURSDAY(
				"Today is Thursday"), FRIDAY(
						"Today is Friday"), SATURDAY("Today is Saturday"), SUNDAY("Today is Sunday");

		private final String dayInfo;

		Day(String dayInfo) {
			this.dayInfo = dayInfo;
		}

		public String getDayInfo() {
			return this.dayInfo;
		}
	}

	public static void main(String args[]) {
		for (Season s : Season.values())
			System.out.println(s + " " + s.value + " " + s.data);
		System.out.println(Season.WINTER);

		for (Day day : Day.values()) {
			System.out.println(day);
			System.out.println(day.getDayInfo());
		}

	}
}

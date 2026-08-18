package anand.enumeration;

public enum Day {
	SUNDAY(1, "Weekends are best."), MONDAY(2, "Mondays are bad."), TUESDAY(3, "Midweek days are so-so."), WEDNESDAY(4,
			"Midweek days are so-so."), THURSDAY(5,
					"Midweek days are so-so."), FRIDAY(6, "Fridays are better."), SATURDAY(7, "Weekends are best.");

	private int dayOfWeek;
	private String mood;

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getMood() {
		return mood;
	}

	void setMood(String mood) {
		this.mood = mood;
	}

	private Day(int dayOfWeek, String mood) {
		this.dayOfWeek = dayOfWeek;
		this.mood = mood;
	}

}

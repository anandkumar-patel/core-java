package anand.enumeration;

public enum TrafficSignal {
	// This will call enum constructor with one
	// String argument
	RED("STOP", 1), GREEN("GO", 3), ORANGE("SLOW DOWN", 4);

	// declaring private variable for getting values
	private String action;
	private int time;

	// getter method
	public String getAction() {
		return this.action;
	}

	public int getTime() {
		return this.time;
	}

	// enum constructor - cannot be public or protected
	private TrafficSignal(String action, int time) {
		this.action = action;
		this.time = time;
	}
}

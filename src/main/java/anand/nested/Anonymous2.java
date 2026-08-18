package anand.nested;

interface Hello {
	void show();
}

public class Anonymous2 {

	// An anonymous class that implements Hello interface
	static Hello h = new Hello() {
		public void show() {
			System.out.println("i am in anonymous class");
		}
	};

	public static void main(String[] args) {
		h.show();
	}
}

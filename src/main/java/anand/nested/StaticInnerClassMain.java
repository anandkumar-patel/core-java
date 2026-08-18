package anand.nested;

public class StaticInnerClassMain {
	// static variable
	private static int staticVar = 1;

	// member variable
	private int memberVar;

	public StaticInnerClassMain() {
		this.memberVar = 11;
	}

	public static class StaticInnerClass {
		// static variable
		private static int staticVarIn = 1;

		// member variable
		private int memberVarIn;

		StaticInnerClass() {
			this.memberVarIn = 12;
		}

		public void display() {
			System.out.println("In Static nested class instance display() method");
			System.out.println("Static variable of outer class " + staticVar);
			// System.out.println("member variable of outer class " + memberVar);
			System.out.println("member variable of inner class " + memberVarIn);
			System.out.println("Out Static nested class instance display() method");

		}
	}

	public void display() {
		System.out.println("Outer class instance display() method");
	}

	public static void main(String[] args) {
		StaticInnerClassMain main = new StaticInnerClassMain();
		main.display();

		StaticInnerClassMain.StaticInnerClass staticNested = new StaticInnerClassMain.StaticInnerClass();
		staticNested.display();
	}
}

package anand.nested;

public class MemberInnerClassMain {
	// static variable
	private static int staticVar = 1;

	// member variable
	private int memberVar;

	public MemberInnerClassMain() {
		this.memberVar = 11;
	}

	public void display() {
		System.out.println("In Outer class instance display() method");
		System.out.println("Out Outer class instance display() method");
	}

	public class MemberInnerClass {
		// static variable
		// private static int staticVar =1; // WE CAN'T CREATE STATIC VAR IN MEMBER
		// INNER CLASS.

		// member variable
		private int memberVarIn;

		public MemberInnerClass() {
			this.memberVarIn = 12;
		}

		public void display() {
			System.out.println("In Non-Static nested class instance display() method");
			System.out.println("Static variable of outer class " + staticVar);
			System.out.println("member variable of outer class " + memberVar);
			System.out.println("member variable of inner class " + memberVarIn);
			System.out.println("Out Non-Static nested class instance display() method");
		}
	}

	public static void main(String[] args) {
		MemberInnerClassMain main = new MemberInnerClassMain();
		main.display();
		// way-1 to create member inner class instance
		MemberInnerClassMain.MemberInnerClass staticNested1 = main.new MemberInnerClass();
		// way-2 to create member inner class instance
		// MemberInnerClassMain.MemberInnerClass staticNested2 = new
		// MemberInnerClassMain().new MemberInnerClass();
		staticNested1.display();

	}
}

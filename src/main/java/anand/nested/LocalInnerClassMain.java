package anand.nested;

public class LocalInnerClassMain {
	// static variable
	private static int staticVar = 1;

	// member variable
	private int memberVar;

	public LocalInnerClassMain() {
		this.memberVar = 11;
	}

	public void display() {
		System.out.println("In Outer class instance display() method");
		int localVar1 = 13;
		final int finalLocal = 14;
		
		class LocalInner {
			public void localDisplay() {
				System.out.println("In local nested class instance method localDisplay()");
				System.out.println(staticVar);
				System.out.println(memberVar);
				System.out.println(localVar1);
				System.out.println(finalLocal);
				System.out.println("Out local nested class instance method localDisplay()");
			}
		}
		
		LocalInner obj = new LocalInner();
		obj.localDisplay();
		System.out.println("Out Outer class instance display() method");
	}

	public static void main(String[] args) {

		LocalInnerClassMain obj = new LocalInnerClassMain();
		obj.display();

	}
}

package anand.nested.innerInterface;

class Outer1 {
	// nested interface is public by default and need not be static
	interface Inner1 {
		// nested interface can be any access specifier and must be static interface
		// method
		public abstract void display();
	}
}

public class Test implements Outer1.Inner1 {
	@Override
	public void display() {
		System.out.println("Hello 1");
	}

	public static void main(String args[]) {
		Test t1 = new Test();
		t1.display();
	}
}

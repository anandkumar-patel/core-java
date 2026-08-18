package anand.nested.innerInterface;

class Outer {
	public void show() {
		System.out.println("Hello 2");
	}

	interface Inner1 // nested interface (inside class) is public by default and
						// need not be static
	{ // nested interface (inside interface) is public and must be static
		public abstract void display(); // interface method
	}
}

public class TestA extends Outer implements Outer.Inner1 {
	public void display() {
		System.out.println("Hello 1");
	}

	public static void main(String args[]) {
		TestA t1 = new TestA();
		t1.display();
		t1.show();
	}
}

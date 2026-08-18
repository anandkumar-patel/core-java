package anand.staticjava;

class M {
	static {
		System.out.println('A');
	}

	{
		System.out.println('B');
	}

	public M() {
		System.out.println('C');
	}

	public void print() {
		System.out.println("Hello in class M print() method");
	}
}

class N extends M {
	static {
		System.out.println('D');
	}

	{
		System.out.println('E');
	}

	public N() {
		System.out.println('F');
	}

	public void print() {
		System.out.println("Hello in class N print() method");
	}
}

public class StaticInitialization {
	public static void main(String[] args) {
		N n = new N();
		n.print();

		M m = new N();
		m.print();
	}
}

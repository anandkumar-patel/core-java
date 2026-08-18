package anand.inherit;

class Base {
	static {
		System.out.println("Base class static block");
	}
	{
		System.out.println("Base class instance block");
	}
	public Base() {
		System.out.println("Base class default Constructor");
	}

	public Base(String value) {
		System.out.println("Base class param Constructor " + value);
	}
}

class DerivedClass1 extends Base {
	static {
		System.out.println("Derived class static block");
	}
	{
		System.out.println("Derived class instance block");
	}
	public DerivedClass1() {
		System.out.println("Derived class default constructor");
	}

	public DerivedClass1(String parama) {
		System.out.println("Derived class param constructor " + parama);
	}
}

public class CallHirerchy {

	public static void main(String[] args) {
		System.out.println("****** case-1 **********");
		new DerivedClass1(); // base-default, derived default
		System.out.println("****** case-2 **********");
		new DerivedClass1("Hiiiiii");//base-default, derived parameterized
	}

}

/*
Execution order :
 	static block of parent-> static block of child --> instance block of parent 
 	--> constructor of parent --> instance block of child --> constructor of child

NOTE- Instance blocks(stance initializer block) are particularly useful when you 
	want to perform some initialization that is common to all constructors of a class. 
	Instead of duplicating the initialization code in each constructors.
*/

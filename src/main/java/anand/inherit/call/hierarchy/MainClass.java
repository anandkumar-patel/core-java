package anand.inherit.call.hierarchy;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("****** case-1 **********");
		new DerivedClass(); // base-default, derived default
		System.out.println("****** case-2 **********");
		new DerivedClass("Hiiiiii");//base-default, derived parameterized
	}

}

/*
Execution order :
 	static block of parent-> static block of child --> instance block of parent 
 	--> constructor of parent --> instance block of child --> constructor of child

NOTE-Instance blocks(stance initializer block) are particularly useful when you
	want to perform some initialization that is common to all constructors of a class. 
	Instead of duplicating the initialization code in each constructor.
*/

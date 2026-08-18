package anand.inherit;

class BaseClass {
	
	public void func() {
		System.out.println("In Base Class func method !!");
	};

	public void func1() {
		System.out.println("In Base Class func1 method !!");
	};
}

class DerivedClass extends BaseClass {
	@Override
	public void func() {
		System.out.println("In Derived Class func method");
	}

	public void func2() { // How to access this by Base class reference
		System.out.println("In Derived Class func2 method");
	}
}

public class InheritDemo {

	public static void main(String[] args) {

		System.out.println("CASE-1 base reference and base object");
		BaseClass base1 = new BaseClass();
		base1.func();
		base1.func1();
		// base1.func2();

		System.out.println("CASE-2 base reference and derived object");
		BaseClass base2 = new DerivedClass();
		base2.func();
		base2.func1();
		// base2.func2(); // <--- Can I access this ??? This is the issue...

		System.out.println("CASE-3 derived reference and derived object");
		DerivedClass derived1 = new DerivedClass();
		derived1.func();
		derived1.func1();
		derived1.func2();

		/*System.out.println("CASE-4 derived reference and base object");
		DerivedClass derived2 =  new BaseClass();
		derived2.func();
		derived2.func1();
		derived2.func2(); 
		*/
	}
}


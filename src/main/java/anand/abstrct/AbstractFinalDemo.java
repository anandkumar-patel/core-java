package anand.abstrct;

abstract class BaseClass {
	// this method can't be overridden
	public final void finalMethod() {
		System.out.println("Final method of abstract class");
	}
}

public class AbstractFinalDemo extends BaseClass {

	/*
	  public void finalMethod() {
	  System.out.println("same name as Final method in Base class"); }
	 */
	public static void main(String[] args) {
		BaseClass obj = new AbstractFinalDemo();
		obj.finalMethod();
	}
}
/*
  1. Is it possible to create abstract and final class in Java? --> NO 
  2. Is it possible to have an abstract method in a final class? --> NO 
  3. Is it possible to inherit from multiple abstract classes in Java? --> NO
 */

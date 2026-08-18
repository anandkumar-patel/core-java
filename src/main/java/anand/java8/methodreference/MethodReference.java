package anand.java8.methodreference;
public class MethodReference {

	public static void main(String[] args) {

		// Static Method Reference
		Calculator cRef = CalC::addSomething;
		cRef.add(11, 12);

		// Instance Method Reference
		CalC calObj = new CalC();
		Calculator cRef1 = calObj::letsAdd;
		cRef1.add(14, 15);

		// reference to constructor
		Messenger msgRef =Message::new;
		msgRef.displayMsg("Anand Patel");

	}

}
/*
How It Works with the Calculator Interface ?

The Calculator interface requires an implementation of the method add(int a, int b). 
When you use a method reference, Java matches the signature of the method reference 
with the abstract method in the functional interface. If they match, the method 
reference can be used as an implementation of the interface method.

Same for constructor reference if, Java matches the signature of the constructor 
with the abstract method in the functional interface. If they match, the constructor 
reference can be used as an implementation of the interface method.

*/

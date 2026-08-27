package anand.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics01 {

	public static void printElements01(List listOfObjects) {
		System.out.println("printElements01() method called...");
		listOfObjects.add("abc"); // OK
		listOfObjects.add(101); // OK
		
		System.out.println(listOfObjects);
	}
	
	public static void printElements02(List<Object> listOfObjects) {
		System.out.println("printElements02() method called...");
		listOfObjects.add("abc"); // OK
		listOfObjects.add(101); // OK

		System.out.println(listOfObjects);
	}
	
	public static void printElements03(List<?> listOfUnknownType) {
		System.out.println("printElements03() method called...");
		//listOfUnknownType.add("abc"); // compile time error

		System.out.println(listOfUnknownType);
	}	
}
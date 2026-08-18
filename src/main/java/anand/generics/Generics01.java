package anand.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics01 {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("anand");
		stringList.add("patel");
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(12);
		integerList.add(14);
		
		List list = new ArrayList();
		list.add("ok");
		list.add("tata");
		
		printElements01(stringList); // OK
		printElements01(integerList); // OK
		printElements01(list); // OK


		//printElements02(stringList); //NOT OK compile time error
		//printElements02(integerList); //NOT OK compile time error
		printElements02(list); // OK
		
		
		printElements03(stringList); // OK
		printElements03(integerList); // OK
		printElements03(list); // OK

		
	}

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
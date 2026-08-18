package anand.generics;

import java.util.Arrays;
import java.util.List;

public class Generics04Method {

	public <T> void genericMethod(T data) {
		System.out.println("Generic method started......");
		System.out.println("Data type :"+data.getClass());
	}
	
	public <T extends Number> void genericMethodUpperBounded01(T data) {
		System.out.println("Generic method (bounded type) started......");
		System.out.println("Data type :"+data.getClass());
	}
	
	public void genericMethodUpperBounded02(List<? extends Number> list) {
	    for (Number number : list) {
	        System.out.println(number);
	    }
	}
	
	public <U> void genericMethodUpperBounded03(List<U> list) {
	    for (U number : list) {
	        System.out.println(number);
	    }
	}
	
	public void genericMethodLowerBounded01(List<? super Integer> list, Integer element) {
		 list.add(element);
	}
	
	public static void main(String[] args) {
		// simple generic method
		System.out.println("*** simple generic method ***");
		Generics04Method obj = new Generics04Method();
		obj.genericMethod(13);
		obj.genericMethod("String data");
		
		
		// generic method with upper-bounded data type
		System.out.println("*** generic method with upper-bounded type ***");
		obj.genericMethodUpperBounded01(13);
		obj.genericMethodUpperBounded01(13.5);
		//obj.genericMethodUpperBounded01("String data");
		
		List<Integer> intList = Arrays.asList(11,12,13);
		List<Float> doubleList = Arrays.asList(11.12f,12.13f,13.12f);
		List<String> stringList = Arrays.asList("anand","kumar","patel");
		obj.genericMethodUpperBounded02(intList);
		obj.genericMethodUpperBounded02(doubleList);
		//obj.genericMethodUpperBounded02(stringList);
		
		System.out.println("*** generic method with lower-bounded type ***");
		obj.genericMethodLowerBounded01(intList, 10);
		System.out.println(intList);
		
	}
}

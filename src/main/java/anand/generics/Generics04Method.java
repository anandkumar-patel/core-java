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

}

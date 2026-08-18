package anand.java8.functionalinterface.generics;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArgumentsProcessor<Integer> intProcessObj = (i1, i2)-> i1*i2;
		System.out.println(intProcessObj.process(12, 13));
		
		ArgumentsProcessor<Double> floatProcessObj = (i1, i2)-> i1*i2;
		System.out.println(floatProcessObj.process(12.5, 13.4));
		
		//ArgumentsProcessor<String> stringProcessObj = (i1, i2)-> i1*i2;
	}

}

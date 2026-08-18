package anand.generics;

import anand.generics.data.GrandParent;
import anand.generics.data.GreatGrandParent;
import anand.generics.data.Parent;

public class Generics03ClassUpperBounded<T extends Number> {
	private T data;

	public Generics03ClassUpperBounded(T data) {
		this.data = data;
	}
	
	public void printMethod() {
		System.out.println("Data type : "+ data.getClass());
	}
	
	public T getData() {
		return data;
	}
	
	public static void main(String[] args) {
		System.out.println("*** generic class with upper-bounded data type ***");
		Generics03ClassUpperBounded<Integer> intDataObj = new Generics03ClassUpperBounded<>(15);
		intDataObj.printMethod();
		int data = intDataObj.getData();
		System.out.println("Data is :"+data);

		Generics03ClassUpperBounded<Double> doubleObj = new Generics03ClassUpperBounded<>(234.56);
		doubleObj.printMethod();
		
		Generics03ClassUpperBounded obj = new Generics03ClassUpperBounded(15);
		obj.printMethod();
		
		//Generics03ClassUpperBounded<String> strinDataObj = new Generics03ClassUpperBounded<String>("Hello");
		
		
		G03ClassUpperBound<Parent> parent = new G03ClassUpperBound<>(new Parent());
		String p1 = parent.getData().getGreatGrandParent();
		System.out.println(p1);
		
//		G03ClassUpperBound<GreatGrandParent> parent = new G03ClassUpperBound<>(new GreatGrandParent());
//		String p2 = parent.getData().getGreatGrandParent();
//		System.out.println(p2);
		
	}
}

class G03ClassUpperBound<T extends GrandParent> {
	private T data;
	
	public G03ClassUpperBound(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
}
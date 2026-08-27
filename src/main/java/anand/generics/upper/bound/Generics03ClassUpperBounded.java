package anand.generics.upper.bound;

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

}
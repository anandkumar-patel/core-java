package anand.generics;

public class Generics03Class<T> {
	private T data;
	private String dataType;
	public Generics03Class(T data,String dataType) {
		this.data = data;
		this.dataType = dataType;
	}
	
	public void printMethod() {
		System.out.println("Data is: " + data + " and type is :" + dataType);
	}
	
	public <U> void OwnTypeMethod(U input) {
		System.out.println("input type is : " + input.getClass());
	}
}

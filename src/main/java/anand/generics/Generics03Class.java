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
	
	public static void main(String[] args) {
		System.out.println("*** simple generic class ***");
		Generics03Class<String> stringDataObj = new Generics03Class<>("Hello", "string");
		stringDataObj.printMethod();
		stringDataObj.OwnTypeMethod(11);

		Generics03Class<Integer> integerDataObj = new Generics03Class<>(15, "integer");
		integerDataObj.printMethod();
		integerDataObj.OwnTypeMethod("anand");
	}
}

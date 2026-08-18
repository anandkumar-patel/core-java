package anand.java9;

public class AnonymousInnerClassExp {

	public static void main(String[] args) {
		var data = "Hello";

		AbstarctWithDiamond<Integer> obj = new AbstarctWithDiamond<Integer>() {

			@Override
			public void show(Integer t) {
				System.out.println("Inter Value is :" + t);
			}
			
		};
		
		
		obj.show(11);
	}

}

abstract class AbstarctWithDiamond<T> {
	abstract public void show(T t);
}
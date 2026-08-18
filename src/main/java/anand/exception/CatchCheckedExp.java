package anand.exception;

public class CatchCheckedExp {
	public static void main(String[] args) {
		try {
			System.out.println("I am in try block");
		}
//		catch (FileNotFoundException a) { // will not compile
//		}
		catch (NullPointerException a) { // will compile
		}
	}

}
/*
If a method not throwing a checked exception we can't catch it. ex-FileNotFoundException

But for unchecked exception its valid. ex- NullPointerException

*/

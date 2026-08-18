package anand.exception;

public class StaticBlockExceptionHandling {

	static {
		try {
			throw new NullPointerException("null pointer exception occured...");
		} catch(NullPointerException ne) {
			ne.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

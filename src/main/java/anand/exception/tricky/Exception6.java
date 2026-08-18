package anand.exception.tricky;

public class Exception6 {
	public static void main(String[] args) throws NullPointerException {
		try {
			throw new NullPointerException("My Exception");
		} catch (Exception ex) {
			throw ex;
		}
	}
}
package anand.exception.tricky;

public class Exception1 {

	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.toLowerCase());
			
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println(2);
		}
	}
}

// catch (NullPointerException | NumberFormatException | Exception e) {
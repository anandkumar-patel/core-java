package anand.exception;

public class ExceptionHandlingTwo {
	public static void main(String[] args) {
		String[] s = { "abc", "123", null, "xyz" }; // String array containing
													// one null object

		for (int i = 0; i < 6; i++) {
			try {
				int a = s[i].length() + Integer.parseInt(s[i]);

				// This statement may throw NumberFormatException,
				// NullPointerException and ArrayIndexOutOfBoundsException
			}

			catch (NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
				System.out.println(
						"Now, this block handles NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException");
			}
		}
	}
}

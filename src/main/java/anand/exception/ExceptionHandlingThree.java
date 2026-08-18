package anand.exception;

public class ExceptionHandlingThree {
	public static void main(String[] args) {
		// String array containing one null object
		String[] s = { "abc", "123", null, "xyz" };

		for (int i = 0; i < s.length; i++) {
			// First Level try-catch block
			try {
				// This statement may throw NullPointerException
				int a = s[i].length();

				// second level try-catch block
				try {
					// This statement may throw ArrayIndexOutOfBoundsException
					System.out.println(s[i + 1]);

					// third level try-catch block
					try {
						// This statement may throw NumberFormatException
						a = Integer.parseInt(s[i]);
					} catch (NullPointerException e) {
						System.out.println("NumberFormatException will not be caught here");
					}
				} catch (NumberFormatException ex) {
					System.out.println("NumberFormatException will be caught here");
				}
			} catch (Exception ex) {
				System.out.println("This block catches all types of exceptions");
			}
		}
	}
}

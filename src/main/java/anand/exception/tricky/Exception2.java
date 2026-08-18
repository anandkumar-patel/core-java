package anand.exception.tricky;

public class Exception2 {
	public static void main(String[] args) {
		try {
			main(args);
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println(1);
		} catch (Exception | Error e) {
			e.printStackTrace();
			System.out.println(2);
		}
	}
}
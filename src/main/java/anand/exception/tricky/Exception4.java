package anand.exception.tricky;

public class Exception4 {
	public static void main(String[] args) {
		System.out.println(anyMethod());
	}

	static int anyMethod() {
		int i = 1;
		try {
			i = i / 0;
			return i;
		} catch (Exception e) {
			i = i + 1;
			return i;
		} finally {
			i = i + 2;
			System.out.println(i);
		}
	}
}
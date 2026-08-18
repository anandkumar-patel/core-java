package anand.interview;

public class Interview002 {
	static int x = 1111;
	static {
		x = 11;
	}
	{
		x = 19;
	}

	public static void main(String args[]) {
		System.out.println(x);
		
		Interview002 obj = new Interview002();
		System.out.println(x);
	}
}
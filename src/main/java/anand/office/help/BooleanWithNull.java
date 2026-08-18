package anand.office.help;

public class BooleanWithNull {
	public static String check(){
		return null;
	}
	public static void main(String[] args) {
		Boolean data = new Boolean(check());
		System.out.println("Data is :"+data);
	}

}

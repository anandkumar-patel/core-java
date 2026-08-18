package anand.logical;

//  add to string from each string take one one character
public class StringConcanate {
	public static void main(String[] args) {
		StringConcanate demo = new StringConcanate();
		System.out.println(demo.add("anand", "patel"));

	}

	public String add(String arg1, String arg2) {
		char[] arr = new char[10];
		for (int i = 0, j = 0; i < arg1.length(); i++, j++) {

			arr[j] = arg1.charAt(i);
			j++;
			arr[j] = arg2.charAt(i);
		}
		return new String(arr);
	}
}

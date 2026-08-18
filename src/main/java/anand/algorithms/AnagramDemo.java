package anand.algorithms;


import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		String one = "abc";
		String two = "bca";

		String three = "abc";
		String four = "bcb";

		AnagramDemo obj = new AnagramDemo();
		System.out.println(obj.isAnagram2(one, two));
		System.out.println(obj.isAnagram2(three, four));

	}

	public Boolean isAnagram(String one, String two) {
		if (null == one || null == two || one.length() != two.length()) {
			return false;
		} else {
			char[] oneArr = one.toCharArray();
			char[] twoArr = two.toCharArray();
			
			Arrays.sort(oneArr);
			Arrays.sort(twoArr);
			
			return Arrays.equals(oneArr, twoArr);
		}
	}

	public Boolean isAnagram2(String one, String two) {
		if(null==one || null ==two || one.length() != two.length()) {
			return false;
		}
		return (one+one).contains(two);
	}
}

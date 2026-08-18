package anand.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Interview001 {
	public static void main(String args[]) {
		System.out.println("***** 001 *****");
		// point to note that commented line also processed by compiler
		// \u000d System.out.println("hello ... check me from where I am coming...");

		System.out.println("***** 002 *****");
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));

		System.out.println("***** 003 *****");
		char[] ca = { 0x4e, '\u004e', 78 }; // all element is
		System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));

		System.out.println("***** 004 *****");
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 10; i++) {
			shortSet.add(i);
			boolean removed = shortSet.remove(i - 1);
			//boolean removed = shortSet.remove((short) (i - 1));
			System.out.println(removed);
		}
		System.out.println(shortSet.size());
		
		System.out.println("***** 005 *****");
		String st5 = "Hello";
		System.out.println("String {" + st5 + "} contains vowels :" + st5.toLowerCase().matches(".*[aeiou].*"));
	
		String[] circus = { "Monkey", "Elephant" };
		// returns fixed size list backed by specified array
		List<String> zoo = Arrays.asList(circus);
		//zoo.add("Lion");
		zoo.set(0, "Tiger");
		System.out.println("zoo size: " + zoo.size());
	}
}
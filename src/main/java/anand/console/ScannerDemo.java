package anand.console;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		scannerAllDemo();

	}

	public static void scannerAllDemo() {
		/*
		 * Input format : a b c d e f g
		 */
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.nextLine();

		String de = sc.nextLine();
		String f = sc.next();
		String empty = sc.nextLine();
		String g = sc.nextLine();

		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
		System.out.println("de =" + de);
		System.out.println("f =" + f);
		System.out.println("empty =" + empty);
		System.out.println("g =" + g);

	}

	public static void scannerDemo() {
		Scanner scanner = new Scanner(System.in);

		String input = "";
		while (!"quit".equalsIgnoreCase(input)) {

			System.out.print("Enter something (quit to quite): ");

			input = scanner.nextLine();
			System.out.println("input : " + input);
		}

		System.out.println("bye bye!");
	}
}

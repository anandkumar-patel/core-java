package anand.console;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {

		Console console = System.console();

		String input = "";
		while (!"quit".equalsIgnoreCase(input)) {

			System.out.print("Enter something (quit to quite): ");

			input = console.readLine();
			System.out.println("input : " + input);
		}

		System.out.println("bye bye!");
	}

}

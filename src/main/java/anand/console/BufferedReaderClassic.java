package anand.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReaderClassic {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));

			String input = "";
			while (!"quit".equalsIgnoreCase(input)) {

				System.out.print("Enter something (quit to quite): ");

				input = br.readLine();
				System.out.println("input : " + input);
			}

			System.out.println("bye bye!");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

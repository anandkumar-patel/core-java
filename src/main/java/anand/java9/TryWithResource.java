package anand.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws FileNotFoundException {

		// before java7
		FileOutputStream fos1 = new FileOutputStream("Resource.txt");
		try {
			fos1.write("First Line".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// after java7
		// No need to close the resources explicitly.
		// Resources are implicitly closed.
		FileOutputStream fos2 = new FileOutputStream("Resource.txt");
		// OR try(FileOutputStream fos2 = new FileOutputStream("Resource.txt"))
		try (FileOutputStream localFos = fos2) {
			fos2.write("First Line".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// after java9
		FileOutputStream fos3 = new FileOutputStream("Resource.txt");
		try (fos3) // No need to declare resources locally
		{
			fos3.write("First Line".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

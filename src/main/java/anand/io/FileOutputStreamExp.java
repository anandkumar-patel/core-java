package anand.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamExp {

	public static void main(String args[]) {
		String data = "This is a line of text inside the file.";

		try {
			OutputStream out = new FileOutputStream("/home/surya/uploaded/output.txt");
			// optional parameter append = true for append mode
			//OutputStream out = new FileOutputStream("/home/surya/uploaded/output.txt",true);

			// Converts the string into bytes
			byte[] dataBytes = data.getBytes();

			// Writes data to the output stream
			out.write(dataBytes);
			System.out.println("Data is written to the file.");

			// Closes the output stream
			out.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
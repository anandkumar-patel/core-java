package anand.java8.lambda.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LambdaOutputStreamExample {
	public static void main(String[] args) {

		// Create a lambda expression that writes "Hello, World!" to the OutputStream
		OutputStreamWriter writer = outputStream -> {
			String data = "Hello, World!";
			outputStream.write(data.getBytes());
		};

		try {
			// append mode
			OutputStream outputStreamObj = new FileOutputStream("/home/surya/uploaded/output1.txt", true);
			// Use the lambda to write to the FileOutputStream - check the file
			writer.writeTo(outputStreamObj);
			outputStreamObj.flush();
			outputStreamObj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
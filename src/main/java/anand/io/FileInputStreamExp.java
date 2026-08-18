package anand.io;

import java.io.FileInputStream;
import java.io.InputStream;

class FileInputStreamExp {
	public static void main(String args[]) {
		FileInputStreamExp obj = new FileInputStreamExp();
		
		byte[] array = new byte[100];
		obj.readToArray(array);
		// Convert byte array into string
		String fileData = new String(array);
		System.out.println("Data read from the file: ");
		System.out.println(fileData);
		
	}
	
	public void read() {
		try {
			InputStream input = new FileInputStream("/home/surya/uploaded/input.txt");
			System.out.println("Available bytes in the file: " + input.available());
			
			// Read byte from the input stream and stores in array
			System.out.println("Data read from the file: ");
			while(input.read() !=-1) {
				
			}
			// Close the input stream
			input.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}
	
	public void readToArray(byte[] array) {
		System.out.println("*** in the read(byte[] array) method ***");
		try {
			InputStream input = new FileInputStream("/home/surya/uploaded/input.txt");
			System.out.println("Available bytes in the file: " + input.available());
		
			int byteRead = input.read(array);
			System.out.println("total number of bytes read into the buffer : "+byteRead);
			input.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}
}
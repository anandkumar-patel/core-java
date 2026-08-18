package anand.serialization;

import java.io.*;

public class SerializableMain {
	public static void main(String[] args) throws Exception {
		Student std = new Student(10, "Ananya", 'A');
		FileOutputStream fos = new FileOutputStream("serialization-file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std);
		oos.flush();
		oos.close();
	}
}
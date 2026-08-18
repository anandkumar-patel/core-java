package anand.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeExternalizableMain {

	public static void main(String[] args) throws Exception {
		Student obj1;
		FileInputStream fis = new FileInputStream("externalized-file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		obj1 = (Student) ois.readObject();
		ois.close();
		System.out.println(obj1);
	}

}

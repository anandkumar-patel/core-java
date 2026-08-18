package anand.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ExternalizableMain{

    public static void main(String[] args) throws Exception {
    	
    Teacher teacher = new Teacher(11,"ramesh",'C');
    FileOutputStream fos = new FileOutputStream("externalized-file.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(teacher);
	oos.flush();
	oos.close();
    	
    }
}

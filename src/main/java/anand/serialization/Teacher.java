package anand.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Teacher implements Externalizable {
	private int age;
	private String name;
	private char grade;

	public Teacher() {
		
	}
	
	public Teacher(int age, String name, char grade) {
		super();
		this.age = age;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Teacher [age=" + age + ", name=" + name + ", grade=" + grade + "]";
	}
	
	

}

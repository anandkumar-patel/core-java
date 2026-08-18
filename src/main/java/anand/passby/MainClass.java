package anand.passby;

public class MainClass {
	public static void main(String[] args) {
		MainClass obj = new MainClass();
		PassByObject f = new PassByObject("original object attribute");
		obj.changeReference(f); // It won't change the reference!
		System.out.println(f);
		obj.modifyReference(f); // It will change the object that the reference variable "f" refers to!
		System.out.println(f);
	}

	public void changeReference(PassByObject a) {
		PassByObject b = new PassByObject("new object attribute");
		a = b;
	}

	public void modifyReference(PassByObject c) {
		c.setAttribute("original object attribute changed here");
	}
}


class PassByObject {

	private String attribute;

	public PassByObject(String a) {
		this.attribute = a;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public String toString() {
		return "PassByObject [attribute=" + attribute + "]";
	}
	
}

package anand.nested;

class NestedInner {
	private static String staticVar = "static variable of enclosing class..";
	private String memberVar;
	
	NestedInner(String var) {
		this.memberVar = var;
	}
	
	
	// Simple nested inner class
	class Inner {
		public void show() {
			System.out.println("*** In a nested class show() method ***");
			System.out.println(staticVar);
			System.out.println(memberVar);
		}
	}
	
	public void show() {
		System.out.println("*** In a enclosing class show() method ***");
		System.out.println(staticVar);
		System.out.println(memberVar);
	}
}

public class N01MemberInnerDemo {
	public static void main(String[] args) {
		String input = "member variable of enclosing class";
		NestedInner enclosingObj = new NestedInner(input);
		NestedInner.Inner in = enclosingObj.new Inner();
		in.show();
		enclosingObj.show();
		
		
		// best way
		//NestedInner.Inner in = new NestedInner(input).new Inner();
		//in.show();
	}
}

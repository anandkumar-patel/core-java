package anand.concepts;
public class UnreachableCodeDemo {
	
	public static void main(String[] args) {
		UnreachableCodeDemo obj= new UnreachableCodeDemo();
		obj.unreachable2();
	}

    public void unreachable1() {
        System.out.println("how to do");
        return;
       // System.out.println("in java");
    }

    public void unreachable2() {
        System.out.println("how to do");
        if (true) {
            return;
        }
        System.out.println("in java");
    }

    public void unreachable3() {
        System.out.println("how to do");
        while (true) {
            return;
        }
        //System.out.println("in java");
    }
}

/**
 * First remove comment to check it.
 * 
 * In Java, "unreachable code" refers to code that cannot be executed 
 * because it comes after a return statement, throw statement, or an 
 * endless loop. The compiler will give an "unreachable code" error in 
 * such cases. On the other hand, "dead code" refers to code that is 
 * never executed, usually because it is placed after a return statement 
 * or an exception-throwing statement. The compiler will give a "dead code"
 * warning for such code.
 */

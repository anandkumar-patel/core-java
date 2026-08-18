package anand.unreachable;

public class IdentifyProblemsInCode {

    public void howToDoInJava_method1() {
        System.out.println("how to do");
        return;
       // System.out.println("in java");	// unreachable code 
    }

    public void howToDoInJava_method2() {
        System.out.println("how to do");
        if (true) {
            return;
        }
        System.out.println("in java");   //dead code - only for eclipse not for javac.
    }

    public void howToDoInJava_method3() {
        System.out.println("how to do");
        while (true) {
            return;
        }
        //System.out.println("in java");	// unreachable code
    }
}
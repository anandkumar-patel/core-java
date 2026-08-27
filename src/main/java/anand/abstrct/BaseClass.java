package anand.abstrct;

public abstract class BaseClass {
    // this method can't be overridden
    public final void finalMethod() {
        System.out.println("Final method of abstract class");
    }
}
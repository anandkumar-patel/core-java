package anand.inherit.call.hierarchy;

public class Base {
    static {
        System.out.println("Base class static block");
    }
    {
        System.out.println("Base class instance block");
    }
    public Base() {
        System.out.println("Base class default Constructor");
    }

    public Base(String value) {
        System.out.println("Base class param Constructor " + value);
    }
}
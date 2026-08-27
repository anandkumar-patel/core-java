package anand.inherit.call.hierarchy;

public class DerivedClass extends Base {
    static {
        System.out.println("Derived class static block");
    }
    {
        System.out.println("Derived class instance block");
    }
    public DerivedClass() {
        System.out.println("Derived class default constructor");
    }

    public DerivedClass(String param) {
        System.out.println("Derived class param constructor " + param);
    }
}
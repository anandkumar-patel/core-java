package anand.inherit.references;

public class DerivedClass extends BaseClass {
    @Override
    public void func() {
        System.out.println("In Derived Class func method");
    }

    public void func2() { // How to access this by Base class reference
        System.out.println("In Derived Class func2 method");
    }
}
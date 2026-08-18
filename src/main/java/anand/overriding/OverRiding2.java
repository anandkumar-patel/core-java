package anand.overriding;

class Base2 {
    public static void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived2 extends Base2 {
    public static void show() {
       System.out.println("Derived::show() called");
    }
}
  
public class OverRiding2 {
    public static void main(String[] args) {
        Base2 b = new Derived2();
        //Derived2 b = new Derived2();
        b.show();
    }
}
/*
Explanation: 
Like C++, when a function is static, runtime polymorphism 
doesn't happen.
 */

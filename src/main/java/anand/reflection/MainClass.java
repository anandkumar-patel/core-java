package anand.reflection;

import java.lang.reflect.Constructor;

public class MainClass {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        Class cls = obj.getClass();
        //1- To get constructor with 2 args
        System.out.println("--------1- To get constructor with 2 agrs");
        Constructor[] constructor= cls.getConstructors();
        for(Constructor c : constructor) {
        	
        }
        


    }
}

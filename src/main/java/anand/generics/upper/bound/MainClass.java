package anand.generics.upper.bound;

import anand.generics.data.GrandParent;
import anand.generics.data.Parent;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("*** generic class with upper-bounded data type ***");

        Generics03ClassUpperBounded<Integer> intDataObj = new Generics03ClassUpperBounded<>(15);
        intDataObj.printMethod();
        int data = intDataObj.getData();
        System.out.println("Data is :"+data);

        Generics03ClassUpperBounded<Double> doubleObj = new Generics03ClassUpperBounded<>(234.56);
        doubleObj.printMethod();

        // not recommended
        Generics03ClassUpperBounded obj = new Generics03ClassUpperBounded(15);
        obj.printMethod();

        // will not work
        //Generics03ClassUpperBounded<String> strinDataObj = new Generics03ClassUpperBounded<>("Hello");


        G03ClassUpperBound<Parent> parent = new G03ClassUpperBound<>(new Parent());
        String p1 = parent.getData().getGreatGrandParent();
        System.out.println(p1);

        G03ClassUpperBound<GrandParent> grandParent = new G03ClassUpperBound<>(new GrandParent());
        String p2 = grandParent.getData().getGreatGrandParent();
        System.out.println(p2);

		//G03ClassUpperBound<GreatGrandParent> parent = new G03ClassUpperBound<>(new GreatGrandParent());

    }
}

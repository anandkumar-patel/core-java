package anand.generics.lower.bound;

import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        Generics03ClassLowerBounded<Number> obj1 = new Generics03ClassLowerBounded<>();


        List<Number> intList = Arrays.asList(11,12,13);
        List<String> stringList = Arrays.asList("anand","kumar","patel");

        obj1.addNumbers(intList, 10); // Adding Integer to List<Number>

        System.out.println(intList);

        List<Number> doubleList = Arrays.asList(11.12f,12.13f,13.12f);
        obj1.addNumbers(doubleList, 20.12f);

        System.out.println(doubleList);
    }
}

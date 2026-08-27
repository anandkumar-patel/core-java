package anand.generics;

import java.util.Arrays;
import java.util.List;

public class Generics04MethodMainClass {
    public static void main(String[] args) {
        // simple generic method
        System.out.println("*** simple generic method ***");
        Generics04Method obj = new Generics04Method();
        obj.genericMethod(13);
        obj.genericMethod("String data");


        // generic method with upper-bounded data type
        System.out.println("*** generic method with upper-bounded type ***");
        obj.genericMethodUpperBounded01(13);
        obj.genericMethodUpperBounded01(13.5);
        //obj.genericMethodUpperBounded01("String data");

        List<Integer> intList = Arrays.asList(11,12,13);
        List<Float> doubleList = Arrays.asList(11.12f,12.13f,13.12f);
        List<String> stringList = Arrays.asList("anand","kumar","patel");
        obj.genericMethodUpperBounded02(intList);
        obj.genericMethodUpperBounded02(doubleList);
        //obj.genericMethodUpperBounded02(stringList);

        System.out.println("*** generic method with lower-bounded type ***");
        obj.genericMethodLowerBounded01(intList, 10);
        System.out.println(intList);

    }
}

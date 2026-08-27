package anand.generics;

public class Generics03ClassMainClass {

    public static void main(String[] args) {
        System.out.println("*** simple generic class ***");
        Generics03Class<String> stringDataObj = new Generics03Class<>("Hello", "string");
        stringDataObj.printMethod();
        stringDataObj.OwnTypeMethod(11);

        Generics03Class<Integer> integerDataObj = new Generics03Class<>(15, "integer");
        integerDataObj.printMethod();
        integerDataObj.OwnTypeMethod("anand");
    }
}

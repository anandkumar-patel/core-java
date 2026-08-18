package anand.string;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello Mahima";
        String str2 = "Hello Mahima";
        String str3 = new String(str1);
        String str4 = new String("Hello Mahima");

        System.out.println("String 1 hashcode :"+ str1.hashCode());
        System.out.println("String 2 hashcode :"+ str2.hashCode());
        System.out.println("String 3 hashcode :"+ str3.hashCode());
        System.out.println("String 4 hashcode :"+ str4.hashCode());

        System.out.println("str1 == str2 "+ str1==str2);
        System.out.println("str1 == str3 "+str1 == str3);
        System.out.println("str1 == str4 "+str1 == str4);
        System.out.println("str2 == str3 "+str2 == str3);

    }
}

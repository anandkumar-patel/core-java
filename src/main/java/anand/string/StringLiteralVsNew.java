package anand.string;

import java.util.HashMap;
import java.util.Map;

public class StringLiteralVsNew {

public static void main(String[] args) {String str1 = new String("someString");
Map data = new HashMap();
System.out.println(data.put(1, "ONE"));
System.out.println(data.put(1, "ONE"));

}

}
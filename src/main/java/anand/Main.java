package anand;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    String input = "backword";
    String result = ascendingOrderChars(input);
        System.out.println("Original string is  : "+ input);
        System.out.println("The final string is : "+result);
    }

    private static String ascendingOrderChars(String input) {
        String[] stringArr = input.split(" ");
        for (String node : stringArr) {
            char[] arr = input.toCharArray();
            Arrays.sort(arr);
        }

        return null;
    }
}
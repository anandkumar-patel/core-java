package anand.string;

import java.util.*;
import java.util.Map.Entry;
//find first non repeating character in String
public class FirstNonRepeatingCharacter {
 public static void main(String[] args) {
	 
	 // First way
  System.out.println("First non repeated character for String analogy is : "
		  + method1("analogy"));
  System.out.println("First non repeated character for String easiest is : "
      + method1("easiest"));
  
  //Second way
  System.out.println("First non repeated character for String analogy is : "
		  + method2("analogy"));
  System.out.println("First non repeated character for String easiest is : "
      + method2("easiest"));
 
 }

 public static Character method1(String str) {
  Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
  for (int i = 0; i < str.length() - 1; i++) {
   Character c = str.charAt(i);
   if (!countCharacters.containsKey(c)) {
    countCharacters.put(c, 1);
   } else {
    countCharacters.put(c, countCharacters.get(c) + 1);
   }
  }
  // As LinkedHashMap maintains insertion order, first character with
  // count 1 should return first non repeated character
  for (Entry<Character, Integer> e : countCharacters.entrySet()) {
   if (e.getValue() == 1)
    return e.getKey();

  }
  return null;

 }
 public static Character method2(String str)
 {     char charaaray[]=str.toCharArray();
       for (int i=0; i<str.length();i++)
      {
          if (str.lastIndexOf(charaaray[i]) == str.indexOf(charaaray[i]))
               return charaaray[i];
      }
  return null;
 }
}


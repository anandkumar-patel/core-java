package anand.dynamic;

import java.util.HashMap;
import java.util.Map;

public class SherlockStringDemo {

	public static void main(String[] args) {
		SherlockStringDemo obj = new SherlockStringDemo();
		String input = "aaaabbgbbccc";
		boolean isValid = obj.isValid(input);
		System.out.println(" is valid ? "+ isValid);
	}
	static boolean isValid(String s) {
		Map <Character,Integer>data = new HashMap<>();
		for(int i =0; i<s.length() ; i++){
			Integer count = data.get(s.charAt(i));
			if(null != count){
				data.put(s.charAt(i), count+1);
			}
			else
				data.put(s.charAt(i), 1);
		}
		System.out.println(data.toString());
		int minOccr =0;
		int maxoccr =0;
		for (Map.Entry<Character, Integer> entry : data.entrySet()){
			int count = entry.getValue();
			if(minOccr ==0 && maxoccr ==0){
				minOccr =count;
				maxoccr = count;
			}
			else if(count <minOccr)
				minOccr =count;
			else if (count>maxoccr) {
				maxoccr =count;
			}
				
		}
		if(maxoccr-minOccr>1)
			return false;
		return true;
	}
}

/*  -------PROBLEM --------
 * Sherlock considers a string to be valid if all characters of the string appear the same number 
 * of times. It is also valid if he can remove just 1 character at 1 index in the string, and the 
 * remaining characters will occur the same number of times. 
 * Given a string s, determine if it is valid.
 * 
 * For example, if s ="abc", it is a valid string because frequencies are {a:1, b:1, c:1} . 
 * So is s="abcc"  because we can remove one 'c' and have 1 of each character in the remaining 
 * string. If s= "abccc" however, the string is not valid as we can only remove 1 occurrence of c. 
 * That would leave character frequencies of {a:1, b:1, c:2}.
 */

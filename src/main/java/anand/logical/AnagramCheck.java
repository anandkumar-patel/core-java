package anand.logical;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

	public static void main(String[] args) {
		System.out.println(checkAnagram("danger", "gerdna"));
	}

	public static boolean checkAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		Map<Character, Integer> str1Map = new HashMap<>();
		Map<Character, Integer> str2Map = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			Character key1 = str1.charAt(i);
			Character key2 = str2.charAt(i);
			if (str1Map.containsKey(key1)) {
				str1Map.put(key1, str1Map.get(key1) + 1);
			} else {
				str1Map.put(key1, 1);
			}

			if (str2Map.containsKey(key2)) {
				str2Map.put(key2, str1Map.get(key2) + 1);
			} else {
				str2Map.put(key2, 1);
			}
		}

		for (Character key : str1Map.keySet()) {
			if (!str2Map.containsKey(key) || str1Map.get(key).equals(str2Map.get(key))) {
				return false;
			}
		}

		return true;
	}

}

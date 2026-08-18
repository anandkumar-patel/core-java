package anand.util.map.hashing;

import java.util.HashMap;
import java.util.Map;

//custom Key class to override hashCode()
//and equals() method
class Key {
	String key;

	Key(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		System.out.println("Key class hasCode fun");
		return (int) key.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {
		return key.equals((String) obj);
	}
}

public class MainClass {
	public static void main(String[] args) {
		Map<Key,Integer> map = new HashMap<>();
		map.put(new Key("sachin"), 30);
		map.put(new Key("vaibhav"), 40);
		System.out.println("map add complete :");
		//System.out.println("Map is "+map);

	}

}
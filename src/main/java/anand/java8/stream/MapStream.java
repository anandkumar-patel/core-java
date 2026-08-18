package anand.java8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(11, "linode.com");
		map.put(21, "heroku.com");
		map.put(13, "anandkumar.com");
		map.put(48, "suryapatel.com");

		Set<Integer> set = map.keySet().stream()
				.filter(key -> key > 13).collect(Collectors.toSet());
		System.out.println(set);

		List<String> values = map.values().stream()
				.filter(value -> value.length() > 10).collect(Collectors.toList());
		System.out.println(values);
		
		// Filtering Entries
		Map<Integer,String> filteredMap = map.entrySet().stream()
				.filter(entry-> entry.getKey()>13).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(filteredMap);
		
		// Transforming Values
		Map<Integer,String> filteredMap1 = map.entrySet().stream()
				.filter(entry-> entry.getKey()>13).collect(Collectors.toMap(en-> en.getKey(),en-> en.getValue().toUpperCase()));
		System.out.println(filteredMap1);
		
		// Mapping to Another Type
		List<Pair> objects = map.entrySet().stream().map(entry-> new Pair(entry.getKey(), entry.getValue())).collect(Collectors.toList());
		System.out.println(objects);
	}
}
class Pair {
	int key;
	String value;
	Pair(int key, String value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	
}

package anand.util.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> priceMap = new HashMap<>();
		priceMap.put("TV", 500);
		priceMap.put("Phone", 200);
		priceMap.put("Car", 20000);
		priceMap.put("Bike", 6000);
		priceMap.put("Furniture", 700);
		System.out.println("price map: " + priceMap);
		
		Set<String> keys = priceMap.keySet();
		System.out.println("keys of Map : " + keys);

		Collection<Integer> values = priceMap.values();
		System.out.println("values from Map :" + values);

		Set<Entry<String, Integer>> entries = priceMap.entrySet();
		System.out.println("entries from Map :" + entries);
		
		
		System.out.println("===============================");
		Map<String,List<Integer>> data = new HashMap<>();
		data.put("data", new ArrayList<Integer>(values));
		System.out.println((List<Integer>)data.get("data"));
		
		System.out.println("===============================");
		for(Entry entry : priceMap.entrySet()) {
			System.out.println("entry key : "+entry.getKey()+ " and entry value : "+entry.getValue());
		}
		
	}
}


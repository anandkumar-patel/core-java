package anand.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstanceOfCheck {

	public static void main(String[] args) {
		Map<String, Object> data = new HashMap<>();
		data.put("string-data", "String Data Here");

		List<String> arryData = new ArrayList<>();
		arryData.add("value1");
		arryData.add("value2");
		arryData.add("value3");

		data.put("array-data", arryData);
		if(data.get("string-data") instanceof String) {
			System.out.println("Data is String");
		}
		if(data.get("array-data") instanceof List) {
			System.out.println("Data is String []");
		}
	}

}

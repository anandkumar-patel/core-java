package anand.util.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapSize {

	public static void main(String[] args) {
		// Create a HashMap and populate it with elements
		HashMap<String, String> hashMap = new HashMap<String, String>();
	    hashMap.put("key_1","value_1");
	    hashMap.put(null, "2");
	    hashMap.put("key_2","value_2");
	    hashMap.put(null, "3");
	    hashMap.put("key_3","value_3");
	    hashMap.put(null, "1");
	    hashMap.put("key_1","value_1_changed");
	   // int size() operation returns the number of key value pairs stored in HashMap    
	    System.out.println("Size of HashMap : " + hashMap.size());

	    Collection<String> cValues = hashMap.values();
	    Iterator<String> it = cValues.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	  
	    
	}

}

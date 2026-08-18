package anand.java8.collection;

import java.util.*;

public class HashMapExample {
    public static void main(String args[]) {

		Map<Integer, String> map = new HashMap<>();
	    map.put(9, "linode.com");
	    map.put(3, "heroku.com");
	    map.put(5, "anand.com");
	    map.put(1, "patel.com");
	    
	    System.out.println(map);
	    
        // iterate
	    System.out.println("entryset :");
        map.entrySet().forEach(ele->System.out.print(ele.getKey() +" : "+ele.getValue()+", "));
       
        System.out.println("\nkeyset :");
        map.keySet().forEach(System.out::print);
        
        System.out.println("\nvalues :");
        map.values().forEach(System.out::print);

        // sort
        System.out.println("\nsorted :");
        SortedMap<Integer,String> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

        // query
        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("patel.com"));
        System.out.println(map.size()); 

        // update value
        map.replace(3, "anand.in");
        System.out.println(map); // 

        // remove entries
        map.remove(9);
        System.out.println(map); 
        map.clear();
        System.out.println(map);    
    }
}

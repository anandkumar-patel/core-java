package anand.util.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

    public static void main(String args[]) {
    	Map<String,Integer> income = new HashMap<>();
    	income.put("anand", 19878);
    	income.put("kumar", 20675);
    	income.put("patel", 18796);
    	income.put("uday", 29876);
    	income.put("raj", 17685);
    	income.put("ananya", 20349);

        // looping through map using foreach loop
        Set<Entry<String, Integer>> entrySet = income.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
        	String name = entry.getKey();
            Integer money = entry.getValue();
           System.out.print("Name : "+name+ ", salary : "+money);
        }

        // looping through map using Iterator
        Iterator<String> itr = income.keySet().iterator();
        while (itr.hasNext()) {
        	String name = itr.next();
            Integer money = income.get(name);
            System.out.print("Name : "+name+ ", salary : "+money);
        
        }

        // looping through values using for loop
        Collection<Integer> salaries = income.values();
        for (Integer money : salaries) {
            System.out.println(money);
        }

    }
}

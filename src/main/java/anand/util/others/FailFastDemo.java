package anand.util.others;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo {
	
	public static void main(String[] args) {
		
		
		List<String> cities = new ArrayList<>();
		cities.add("Jaunpur");
		cities.add("Maharajganj");
		cities.add("Kanpur");
		cities.add("Varanashi");
		
		Iterator<String> it = cities.listIterator();
		while(it.hasNext()) {
			String city = it.next();
			it.remove();
			System.out.println(city);
			
		}
		
		Iterator<String> it1 = cities.listIterator();
		System.out.println(it1.hasNext());
		while(it1.hasNext()) {
			System.out.println("data is there");
		}
		
	}

}

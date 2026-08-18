package anand.util.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author anandpatel
 *
 */
public class HashSetDemo {

	public static void main(String[] args) {
		
		System.out.println("HashSet of Integer type :");
		Set<Integer> intSet = new HashSet<>();
		intSet.add(21);
		intSet.add(41);
		intSet.add(11);
		intSet.add(45);
		intSet.add(13);
		intSet.add(19);
		
		//looping hashset
		System.out.println("Printing intSet ");
		Iterator<Integer> intIter = intSet.iterator();
		while(intIter.hasNext()) {
			System.out.println(intIter.next());
		}
		
		System.out.println("HashSet of string type :");
		Set<String> stringSet = new HashSet<>();
		stringSet.add("Rama");
		stringSet.add("Ganesh");
		stringSet.add("shooru");
		stringSet.add("davil");
		stringSet.add("practo");
		stringSet.add("donkey");
		
		//looping hashset
		System.out.println("Printing stringSet ");
		Iterator<String> stringIter = stringSet.iterator();
		while(stringIter.hasNext()) {
			System.out.println(stringIter.next());
		}
		
		
		System.out.println("HashSet of custom object type {countrySet}:");
		Set<Country> countrySet = new HashSet<>();
		countrySet.add(new Country(21, "India", 135000000L));
		countrySet.add(new Country(31, "shri Lanka", 350000L));
		countrySet.add(new Country(23, "Myanmar", 5000000L));
		countrySet.add(new Country(11, "Bangladesh", 70000L));
		countrySet.add(new Country(17, "bhutan", 9000L));
		countrySet.add(new Country(51, "Tibbat", 234500L));
		
		//looping hashset
		System.out.println("Printing countrySet ");
		Iterator<Country> countryIter = countrySet.iterator();
		while(countryIter.hasNext()) {
			System.out.println(countryIter.next().toString());
		}	
		
		
	}
}


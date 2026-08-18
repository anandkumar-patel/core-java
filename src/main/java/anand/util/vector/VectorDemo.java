package anand.util.vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
/**
 * Vector is same as Arraylist , just difference is it's synchronized and size increase by 100%.
 * @author anandpatel
 *
 *initial size :10
 *synchronized : yes
 *size increase by 100%
 */
public class VectorDemo {

	public static void main(String[] args) {
		
		System.out.println("Vector of Integer type :");
		Vector<Integer> intVector = new Vector<>();
		intVector.add(21);
		intVector.add(41);
		intVector.add(11);
		intVector.add(45);
		intVector.add(13);
		intVector.add(19);
		
		//looping vector
		System.out.println("Printing intVector ");
		Iterator<Integer> intIter = intVector.iterator();
		while(intIter.hasNext()) {
			System.out.println(intIter.next());
		}
		
		//sorting the vector
		Collections.sort(intVector);
		System.out.println("Printing intVector after sorting");
		Iterator<Integer> intIter1 = intVector.listIterator();
		while(intIter1.hasNext()) {
			System.out.println(intIter1.next());
		}
		
		System.out.println("Vector of string type :");
		Vector<String> stringVector = new Vector<>();
		stringVector.add("Rama");
		stringVector.add("Ganesh");
		stringVector.add("shooru");
		stringVector.add("davil");
		stringVector.add("practo");
		stringVector.add("donkey");
		
		//looping vector
		System.out.println("Printing stringVector ");
		Iterator<String> stringIter = stringVector.listIterator();
		while(stringIter.hasNext()) {
			System.out.println(stringIter.next());
		}
		
		//sorting the vector
		Collections.sort(stringVector);
		System.out.println("Printing stringVector after sorting");
		Iterator<String> stringIter1 = stringVector.iterator();
		while(stringIter1.hasNext()) {
			System.out.println(stringIter1.next());
		}
		
		System.out.println("Vector of custom object type {countryVector}:");
		Vector<Country> countryVector = new Vector<>();
		countryVector.add(new Country(21, "India", 135000000L));
		countryVector.add(new Country(31, "shri Lanka", 350000L));
		countryVector.add(new Country(23, "Myanmar", 5000000L));
		countryVector.add(new Country(11, "Bangladesh", 70000L));
		countryVector.add(new Country(17, "bhutan", 9000L));
		countryVector.add(new Country(51, "Tibbat", 234500L));
		
		//looping vector
		System.out.println("Printing countryVector ");
		Iterator<Country> countryIter = countryVector.listIterator();
		while(countryIter.hasNext()) {
			System.out.println(countryIter.next().toString());
		}
		
		//sorting the vector 
		Collections.sort(countryVector);
		System.out.println("Printing countryVector after sorting by default sort order by Comparable{id}");
		Iterator<Country> countryIter1 = countryVector.listIterator();
		while(countryIter1.hasNext()) {
			System.out.println(countryIter1.next().toString());
		}
		
		Collections.sort(countryVector, new CountryPopulationComparator());
		System.out.println("Printing countryVector after sorting by country popution using Comparator ");
		Iterator<Country> countryIter2 = countryVector.listIterator();
		while (countryIter2.hasNext()) {
			System.out.println(countryIter2.next().toString());
		}
		
		Collections.sort(countryVector, new CountryNameComparator());
		System.out.println("Printing countryVector after sorting by country name using Comparator ");
		Iterator<Country> countryIter3 = countryVector.listIterator();
		while (countryIter3.hasNext()) {
			System.out.println(countryIter3.next().toString());
		}
		
		
	}
}

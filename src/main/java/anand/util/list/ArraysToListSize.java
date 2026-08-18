package anand.util.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToListSize {
	public static void main(String args[]) {
		List<String> circus1 = new ArrayList<String>();
		circus1.add("Monkey");
		circus1.add("Elephant");

		List<String> zoo1 = new ArrayList<String>(circus1);
		zoo1.add("Lion");
		System.out.println("zoo1 size: " + zoo1.size());

		String[] circus2 = { "Monkey", "Elephant" };

		List<String> zoo2 = Arrays.asList(circus2);
		//zoo2.add("Tiger");
		zoo2.set(0, "Tiger");
		System.out.println("zoo2 size: " + zoo2.size());
		
		System.out.println("zoo2 data :"+zoo2.toString());
		
		
		System.out.println("circus2 data :");
		for(int i=0;i<circus2.length;i++) {
			System.out.print(circus2[i]+", ");
		}
	}

	/*
		1- The method asList() of Arrays returns a fixed size List instance. 
		This instance serves as a bridge for an array to a collection. 
		2- We cannot add a new element or remove an element from the 
		returned instance. 
		3- We can set the value of an already existing element using its index. 
		4- Any change we do will be propagated to the array source.
	*/
}

package anand.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author anandpatel
 */

public class IterateThroughList {

	public static void main(String[] argv) {

		List<Demo> demoList = new ArrayList<>();
		demoList.add(new Demo(11, "Anand", "Jnp"));
		demoList.add(new Demo(12, "Ananya", "Blr"));
		demoList.add(new Demo(13, "Urmila", "Ald"));
		demoList.add(new Demo(14, "Uday", "Pbh"));

		// iterate via "iterator loop"
		System.out.println("\n==> Iterator Example...");
		Iterator<Demo> iterator = demoList.iterator();
		while (iterator.hasNext()) {
			Demo obj = iterator.next();
			System.out.println(obj.getName());
		}

		System.out.println("=====================================");

		// create list
		List<String> crunchifyList = new ArrayList<String>();

		// add 4 different values to list
		crunchifyList.add("eBay");
		crunchifyList.add("Paypal");
		crunchifyList.add("Google");
		crunchifyList.add("Yahoo");

		// iterate via "for loop"
		System.out.println("==> For Loop Example.");
		for (int i = 0; i < crunchifyList.size(); i++) {
			System.out.println(crunchifyList.get(i));
		}

		// iterate via "New way to loop"
		System.out.println("\n==> Advance For Loop Example..");
		for (String temp : crunchifyList) {
			System.out.println(temp);
		}

		// iterate via "iterator loop"
		System.out.println("\n==> Iterator Example...");
		Iterator<String> crunchifyIterator = crunchifyList.iterator();
		while (crunchifyIterator.hasNext()) {
			System.out.println(crunchifyIterator.next());
		}

		// iterate via "while loop"
		System.out.println("\n==> While Loop Example....");
		int i = 0;
		while (i < crunchifyList.size()) {
			System.out.println(crunchifyList.get(i));
			i++;
		}
	}

}

class Demo {
	private Integer id;
	private String name;
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Demo(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}

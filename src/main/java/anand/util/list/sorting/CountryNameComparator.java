package anand.util.list.sorting;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country> {

	@Override
	public int compare(Country c1, Country c2) {
		return c1.getCname().compareTo(c2.getCname());
	}

}

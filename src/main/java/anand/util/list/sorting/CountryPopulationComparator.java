package anand.util.list.sorting;

import java.util.Comparator;

public class CountryPopulationComparator implements Comparator<Country> {

	@Override
	public int compare(Country c1, Country c2) {
		if (c1.getPopulation() == c2.getPopulation()) {
			return 0;
		} else if (c1.getPopulation() > c2.getPopulation()) {
			return 1;
		} else {
			return -1;
		}
	}

}

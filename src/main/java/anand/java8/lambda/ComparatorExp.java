package anand.java8.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExp {

	public static void main(String[] args) {
		Comparator<Developer> salaryComparator =(d1,d2)->d1.getSalary().compareTo(d2.getSalary());
		
		Comparator<Developer> nameComparator =(d1,d2)->d1.getName().compareTo(d2.getName());
		
		
		Developer dev1 = new Developer("anand", new BigDecimal(12008), 35);
		Developer dev2 = new Developer("kumar", new BigDecimal(1008), 34);
		Developer dev3 = new Developer("patel", new BigDecimal(4567), 36);
		Developer dev4 = new Developer("uday", new BigDecimal(56789), 31);
		Developer dev5 = new Developer("raj", new BigDecimal(343563), 30);
		Developer dev6 = new Developer("urmila", new BigDecimal(3453), 29);
		Developer dev7 = new Developer("surya", new BigDecimal(5674), 1);
		Developer dev8 = new Developer("ananya", new BigDecimal(34896), 7);
		Developer dev9 = new Developer("kalpna", new BigDecimal(23452), 25);
		
		List<Developer> devs = Arrays.asList(dev1,dev2,dev3,dev4,dev5,dev6,dev7,dev8,dev9);
		
		Collections.sort(devs, nameComparator);
		System.out.println(devs);
		
		Collections.sort(devs, salaryComparator);
		System.out.println(devs);
	
	}

}

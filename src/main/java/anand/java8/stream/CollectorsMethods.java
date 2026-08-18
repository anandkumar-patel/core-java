package anand.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import anand.java8.Employee;


public class CollectorsMethods {

	public static void main(String[] args) {

		List<Employee> employees = getAllEmployees();

		// to list
		List<Employee> filteredEmployees = employees.stream().filter(e -> e.getDepartment().equals("HR"))
				.collect(Collectors.toList());
		System.out.println("to list of same type :" + filteredEmployees);

		// to list of String
		List<String> employeeNames = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println("to list of other type :" + employeeNames);

		// to set
		Set<String> employeeNamesAsSet = employees.stream().map(e -> e.getName()).collect(Collectors.toSet());
		System.out.println("to set of other type :" + employeeNamesAsSet);

		// to map
		Map<String, Employee> map = employees.stream().collect(Collectors
				.toMap(e->e.getName(), e->e));
		System.out.println("to map :" + map);
		
		// join
		String noinedNames = employees.stream().filter(e-> e.getAge()>30)
				.map(e-> e.getName()).collect(Collectors.joining());
		System.out.println("joined name : "+noinedNames);
		// ??? duplicate or not ??
		String noinedDept = employees.stream().filter(e-> e.getAge()>30)
				.map(e-> e.getDepartment()).collect(Collectors.joining(","));
		System.out.println("joined name : "+noinedDept);
		
		Map<String,List<Employee>> empGroupByDept = employees.stream()
				.collect(Collectors.groupingBy(e->e.getDepartment()));
		System.out.println("groupBy : "+empGroupByDept);
		
		// ?? all version of groupBy ??
		Map<String,Long> countByDept = employees.stream()
				.collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
		System.out.println("groupBy: countByDept : "+countByDept);
		
		

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		// Partition numbers into even and odd using Collectors.partitioningBy
		Map<Boolean, List<Integer>> evenOddMap = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		List<Integer> evenList = evenOddMap.get(true);
		List<Integer> oddList = evenOddMap.get(false);
		System.out.println("even list :" + evenList);
		System.out.println("odd list :" + oddList);

		Map<Boolean, Long> countMap = numbers.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));
		System.out.println("even count :" + countMap.get(true));
		System.out.println("odd count :" + countMap.get(false));

		/*
		 * Map<Boolean, Optional<Integer>> sumMap = numbers.stream()
		 * .collect(Collectors.partitioningBy(n -> n % 2 == 0,
		 * Collectors.reducing(null))); System.out.println("even count :" +
		 * sumMap.get(true)); System.out.println("odd count :" + sumMap.get(false));
		 */

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
		// Group names by their length using Collectors.groupingBy
		Map<Integer, List<String>> namesByLength = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(namesByLength);

		// Group names by their length and count them
		Map<Integer, Long> namesByLengthCount = names.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(namesByLengthCount);

	}
	
	public static List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", true, 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", true, 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", false, 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", true, 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", true, 2013, 22700.0));
		employeeList
				.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", false, 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", true, 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", true, 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", false, 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", true, 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", true, 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", false, 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", true, 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", true, 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", true, 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", false, 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", false, 2012, 35700.0));
		return employeeList;
	}
}

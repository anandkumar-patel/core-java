package anand.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import anand.java8.Employee;
import anand.java8.EmployeeHelper;
import anand.java8.Project;


public class CollectorsMethods {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeHelper.getAllEmployees();

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
}

package anand.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import anand.java8.Employee;
import anand.java8.Project;


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
		return List.of(
				new Employee(101, "Anand", 30, "Male", "IT", true, 2020, 90000, List.of(new Project(1, "Banking App", List.of("Java", "Spring Boot", "MySQL", "Docker"), "ABC Bank", 500000), new Project(2, "Insurance App", List.of("Java", "Spring Boot", "Kafka", "AWS"), "XYZ Insurance", 700000))),
				new Employee(102, "Rahul", 28, "Male", "IT", true, 2021, 75000, List.of(new Project(3, "E-Commerce", List.of("Java", "Spring Boot", "MongoDB", "Redis"), "Amazon", 900000), new Project(4, "Payment System", List.of("React", "Node.js", "MongoDB"), "ABC Payments", 600000))),
				new Employee(103, "Priya", 32, "Female", "HR", true, 2019, 85000, List.of(new Project(5, "HR Portal", List.of("Angular", "Java", "Spring Boot", "PostgreSQL"), "XYZ Corp", 300000))),
				new Employee(104, "Amit", 35, "Male", "IT", false, 2018, 95000, List.of(new Project(6, "Banking App", List.of("Java", "Spring Boot", "Kafka"), "ABC Bank", 500000), new Project(7, "Cloud Migration", List.of("AWS", "Docker", "Kubernetes", "Terraform"), "XYZ Corp", 1000000), new Project(8, "DevOps Pipeline", List.of("Jenkins", "Docker", "Kubernetes", "AWS"), "ABC Bank", 400000))),
				new Employee(105, "Neha", 27, "Female", "Finance", true, 2022, 72000, List.of(new Project(9, "Finance Portal", List.of("Java", "Spring Boot", "PostgreSQL"), "HDFC Bank", 450000), new Project(10, "Fraud Detection", List.of("Python", "Kafka", "AWS"), "ICICI Bank", 800000))),
				new Employee(106, "Vikram", 31, "Male", "IT", true, 2019, 88000, List.of(new Project(11, "CRM System", List.of("Java", "Spring Boot", "React", "MySQL"), "Salesforce", 750000), new Project(12, "Cloud Migration", List.of("AWS", "Docker", "Kubernetes"), "TCS", 1200000))),
				new Employee(107, "Sneha", 29, "Female", "Marketing", true, 2021, 68000, List.of(new Project(13, "Marketing Dashboard", List.of("React", "Node.js", "MongoDB"), "Flipkart", 500000), new Project(14, "Analytics Platform", List.of("Python", "PowerBI", "AWS"), "Amazon", 650000))),
				new Employee(108, "Rohit", 36, "Male", "IT", false, 2017, 110000, List.of(new Project(15, "Payment Gateway", List.of("Java", "Spring Boot", "Kafka", "Redis"), "Paytm", 900000), new Project(16, "Security Service", List.of("Java", "Spring Security", "OAuth2"), "PhonePe", 700000), new Project(17, "DevOps Automation", List.of("Jenkins", "Docker", "Kubernetes", "Terraform"), "Wipro", 850000))),
				new Employee(109, "Pooja", 26, "Female", "HR", true, 2023, 62000, List.of(new Project(18, "Employee Portal", List.of("Angular", "Java", "Spring Boot", "MySQL"), "Infosys", 400000), new Project(19, "Recruitment System", List.of("React", "Node.js", "PostgreSQL"), "Accenture", 550000))),
				new Employee(110, "Karan", 33, "Male", "Finance", true, 2018, 98000, List.of(new Project(20, "Investment Platform", List.of("Java", "Spring Boot", "Kafka", "Redis"), "ICICI Bank", 1000000), new Project(21, "Reporting System", List.of("Python", "PostgreSQL", "AWS"), "HDFC Bank", 600000))));
	}
}

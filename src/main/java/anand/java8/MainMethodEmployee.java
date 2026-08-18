package anand.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import java.util.Set;

public class MainMethodEmployee {

	public static final String LINE_BREAKER = "**************************************************";

	public static void main(String[] args) {

		List<Employee> empList = getAllEmployees();
		
		// print the employee name of 3 least salary getter active employee in
		// reverse of there salary.
		System.out.println("List of Employee Names:");
		List<String> empNames = empList.stream()
				.filter(Employee::isActive)
				.sorted(Comparator.comparingDouble(Employee::getSalary))
				.limit(3)
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.map(Employee::getName).toList();
		empNames.stream().forEach(System.out::println);
		System.out.println(LINE_BREAKER);
		
		// list the active employees in salary desc order
		System.out.println("List of Employee :");
		List<Employee> activeEmpList = empList.stream().filter(Employee::isActive)
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		activeEmpList.stream().forEach(emp -> System.out.println(emp.toString()));
		System.out.println(LINE_BREAKER);

		System.out.println("Set of Employee Name :");
		Set<String> activeEmpSet = empList.stream().map(Employee::getName).collect(Collectors.toSet());

		activeEmpSet.stream().forEach(System.out::println);
		System.out.println(LINE_BREAKER);

		System.out.println(empList.stream().collect(Collectors.groupingBy(emp -> emp.getName())));

		System.out.println(empList.stream().collect(Collectors.groupingBy(emp -> emp.getName(),
				Collectors.mapping(emp -> emp.getId(), Collectors.toList()))));

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

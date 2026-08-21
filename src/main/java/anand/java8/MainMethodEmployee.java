package anand.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import java.util.Set;

public class MainMethodEmployee {

	public static final String LINE_BREAKER = "**************************************************";

	public static void main(String[] args) {

		List<Employee> empList = EmployeeHelper.getAllEmployees();
		
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


}

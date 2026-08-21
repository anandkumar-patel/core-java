package anand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import anand.java8.Employee;
import anand.java8.EmployeeHelper;
import anand.java8.Project;

public class CheckHere {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeHelper.getAllEmployees();
		employees.stream().filter(e-> e.getId()>105).toList().forEach(System.out::println);
	}
}

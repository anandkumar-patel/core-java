package anand.java8.stream.realtimeproblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import anand.java8.Employee;

public class MainMethod {

	public static void main(String[] args) {
		MainMethod obj = new MainMethod();
		List<Employee> employees = obj.getAllEmployees();
		obj.problem11(employees);
	}

	public void problem01(List<Employee> employees) {
		System.out.println("01:How many male and female employees");
		// 01
		long femaleCount = employees.stream().filter(emp -> emp.getGender().equalsIgnoreCase("female")).count();
		long maleCount = employees.stream().filter(emp -> emp.getGender().equalsIgnoreCase("male")).count();

		System.out.println("female count :" + femaleCount);
		System.out.println("male count :" + maleCount);
		// best way
		Map<String, Long> maps = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(maps);
		
		//one more way {if there is only two gender}
		Map<Boolean, Long> maps2 = employees.stream().collect(
				Collectors.partitioningBy(e -> e.getGender().equalsIgnoreCase("female"), Collectors.counting()));
		System.out.println("female count :" + maps2.get(true));
		System.out.println("male count :" + maps2.get(false));
	}

	public void problem02(List<Employee> employees) {
		System.out.println("02:Print the name of all departments in the organization");
		List<String> depts = employees.stream().map(e-> e.getDepartment()).distinct().collect(Collectors.toList());
		System.out.println(depts);
	}
	
	public void problem03(List<Employee> employees) {
		System.out.println("03:average age of male and female employees");
		Map<String, Double> avgAge = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("average age : " + avgAge);
	}
	
	public void problem04(List<Employee> employees) {
		System.out.println("04 : Get the details of highest paid employee in the organization?");
		Optional<Employee> e1 = employees.stream().max((emp1,emp2)->Double.compare(emp1.getSalary(), emp2.getSalary()));
        e1.ifPresent(System.out::println);
        
		Optional<Employee> e2 = employees.stream().max(Comparator.comparingDouble(p->p.getSalary()));
        e2.ifPresent(System.out::println);
        
        Optional<Employee> e3 = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(p->p.getSalary())));
        e3.ifPresent(System.out::println);
	}
	
	public void problem05(List<Employee> employees) {
		System.out.println("05 : Get the names of all employees who have joined after 2015?");
		List<String> empNames = employees.stream().filter(e -> e.getYearOfJoining() > 2015).map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(empNames);
	}
	
	public void problem06(List<Employee> employees) {
		System.out.println("06 : Count the number of employees in each department?");
		Map<String,Long> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map);
	}
	
	public void problem07(List<Employee> employees) {
		System.out.println("07 : What is the average salary of each department?");
		Map<String,Double> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map);
	}
	
	public void problem08(List<Employee> employees) {
		System.out.println("08 : Get the details of youngest male employee in the product development department?");
		Optional<Employee> youngest = employees.stream()
				.filter(emp -> emp.getDepartment().equalsIgnoreCase("Product Development"))
				.min(Comparator.comparingDouble(Employee::getSalary));
		youngest.ifPresentOrElse(System.out::println, () -> System.out.println("no record found.."));
	}
	
	public void problem09(List<Employee> employees) {
		System.out.println("09 : Who has the most working experience in the organization?");
		Optional<Employee> mostExp= employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
		mostExp.ifPresentOrElse(System.out::println, () -> System.out.println("no record found.."));
	}
	
	public void problem10(List<Employee> employees) {
		System.out.println("10 : How many male and female employees are there in the sales and marketing team?");
		Map<String, Long> map = employees.stream().filter(emp-> emp.getDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);
	}
	
	public void problem11(List<Employee> employees) {
		System.out.println("average salary of male and female employees");
		Map<String,Double> avgSalaryMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryMap);
	}

	public List<Employee> getAllEmployees() {
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

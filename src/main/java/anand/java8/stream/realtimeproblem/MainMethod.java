package anand.java8.stream.realtimeproblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import anand.java8.Employee;
import anand.java8.Project;

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

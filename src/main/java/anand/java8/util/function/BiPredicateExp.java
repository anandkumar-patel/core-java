package anand.java8.util.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateExp {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Alice", 28, 60000.0), new Person("Bob", 35, 75000.0),
				new Person("Charlie", 22, 50000.0), new Person("David", 40, 90000.0));

		// BiPredicate to filter people based on age and salary
		BiPredicate<Integer, Double> filterCondition = (age, salary) -> age >= 30 && salary >= 70000.0;

		// Filtering the collection using BiPredicate
		List<Person> filteredPeople = people.stream()
				.filter(person -> filterCondition.test(person.getAge(), person.getSalary()))
				.collect(Collectors.toList());

		// Displaying the filtered list
		System.out.println("People meeting the criteria:");
		filteredPeople.forEach(System.out::println);
	}
}

class Person {
	private String name;
	private int age;
	private double salary;

	public Person(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
	}
}

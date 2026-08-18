package anand.java8.util.optional.solution;

import java.util.Optional;

public class Person {
	private String name;
	private Optional<House> House;
	
	public Person(String name, Optional<House> house) {
		super();
		this.name = name;
		House = house;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<House> getHouse() {
		return House;
	}
	public void setHouse(Optional<House> house) {
		House = house;
	}
}

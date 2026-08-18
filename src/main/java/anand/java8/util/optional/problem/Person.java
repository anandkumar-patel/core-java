package anand.java8.util.optional.problem;

public class Person {
	private String name;
	private House House;
	
	public Person(String name, House house) {
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
	public House getHouse() {
		return House;
	}
	public void setHouse(House house) {
		House = house;
	}
}

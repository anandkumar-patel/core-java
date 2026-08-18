package anand.java8.util.optional.solution;

import java.util.Optional;

public class MainMethod {


	public static void main(String[] args) {
		Optional<HouseLoan> loan = Optional.of(new HouseLoan(11, "loan for kripa house"));
		Optional<House> house = Optional.of(new House("kripa nilay", loan));
		Person person = new Person("kripa patel", house);
		
		MainMethod obj = new MainMethod();
		obj.getDetails(person);
	}

	public void getDetails(Person person) {
		Optional<House> house = person.getHouse();
		house.ifPresent(System.out::println);
		house.ifPresent(home-> home.getHouseLone().ifPresent(System.out::println));
	}

}

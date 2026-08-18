package anand.java8.util.optional.problem;

public class MainMethod {

	public static void main(String[] args) {
		HouseLoan loan = new HouseLoan(11, "loan for kripa house");
		House house = new House("kripa nilay", loan);
		Person person = new Person("kripa patel", house);
		
		MainMethod obj = new MainMethod();
		obj.getDetails(person);
	}

	public void getDetails(Person person) {
		if (person != null) {
			House house = person.getHouse();
			// Null check for house
			if (house != null) {
				HouseLoan houseLoan = house.getHouseLone();
				// Null check for houseLoan
				if (houseLoan != null) {
					System.out.println(houseLoan.getLoanDetails());
				}
			}
		}
	}
}

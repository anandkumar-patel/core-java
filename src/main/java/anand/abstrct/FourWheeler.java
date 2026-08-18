package anand.abstrct;

public abstract  class FourWheeler implements Vehicle {
	String name;

	public abstract  String getSound();

	public String getName() {
		return name;
	}
}
/**
 *An abstract method can only set a visibility modifier of public or protected. 
 *That is, an abstract method cannot add static or final modifier to the declaration. 
 * 
 */

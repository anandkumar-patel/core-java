package anand.interview.equals;

public class EqualsHashcodeApp {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("p1.equals(null) :"+p1.equals(null));
		
		Person p2 = new Person(1,"Anand","Patel");
		System.out.println("p1 = p2 :"+( p1==p2));// false - not referencing the same obj in memory 
		System.out.println("p1.equals(p2) :"+ p1.equals(p2));
		
		Person p3 = new Person(1,"anand", "patel");
		
		System.out.println("p2.equals(p3) :"+ p2.equals(p3));
		
		System.out.println("hachcode of p1 :"+p1.hashCode());
		System.out.println("hachcode of p2 :"+p2.hashCode());
		System.out.println("hachcode of p3 :"+p3.hashCode());
	}
}


/*
 1- equal hashcode contract - if equals are same then hashcode must be same.
 2- if hascode are same object may or may not be same by eqaul - hashcode collision
 3- == check the reference of obj in memory, two same object can have diff memory.
  
 */
 
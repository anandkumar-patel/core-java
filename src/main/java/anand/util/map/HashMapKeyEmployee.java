package anand.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapKeyEmployee {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1,"Anand","cse",1000d);
		Employee emp2 = new Employee(1,"Anand","cse",1000d);

		Map<Employee,Integer> map1 = new HashMap<>();
		map1.put(emp1, 11);
		map1.put(emp2, 22);
		System.out.println("Size of map is :"+ map1.size());
		System.out.println("Data in map :"+ map1);
		
		Integer in1 = Integer.valueOf(1);
		Integer in2 =  Integer.valueOf(1);
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(in1, "data1");
		map2.put(in2, "data2");
		System.out.println("Size of map is :"+ map2.size());
		System.out.println("Data in map :"+ map2);

	}

}

/*
 * remove the overridden method(equals and hashCode) 
 * and check the size 
 *
 */
class Employee {
	int empId;
	String name;
	String dept;
	Double salary;
	public Employee(int empId, String name, String dept, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, empId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && empId == other.empId && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}

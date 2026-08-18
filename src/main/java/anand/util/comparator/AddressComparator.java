package anand.util.comparator;

import java.util.Comparator;

import anand.java8.Employee;

public class AddressComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}

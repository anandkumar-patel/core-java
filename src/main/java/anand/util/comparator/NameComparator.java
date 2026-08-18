package anand.util.comparator;

import java.util.Comparator;

import anand.java8.Employee;

public class NameComparator  implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

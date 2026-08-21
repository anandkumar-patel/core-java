package anand.util.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import anand.java8.Employee;
import anand.java8.EmployeeHelper;
import anand.java8.Project;

public class MainMethod {
    public static void main(String[] args) {

        List<Employee> empList = EmployeeHelper.getAllEmployees();

        System.out.println("Unsorted list : "+empList);

        Collections.sort(empList, new AgeComparator());
        System.out.println("Sorted list{ by age} : "+empList);

        Collections.sort(empList, new NameComparator());
        System.out.println("Sorted list{ by name} : "+empList);
    }
}

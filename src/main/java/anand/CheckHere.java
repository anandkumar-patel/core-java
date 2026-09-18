package anand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import anand.java8.Employee;
import anand.java8.EmployeeHelper;
import anand.java8.Project;

public class CheckHere {
	public static void main(String[] args) {
		int value = 7;
		value = calculate(value);
	}

	private static int calculate(int data) {
		int tempValue = data+3;
		int newValue = tempValue * 2;
		return  newValue;
	}
}

package application;

import java.util.Locale;

import model.entities.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Employee firstEmployee = new Employee("John Green", 2150.0);
		System.out.println("Employee #1:");
		System.out.println("Name: " + firstEmployee.getName());
		System.out.printf("Annual salary: $%.2f%n", firstEmployee.getAnnualSalary());
		firstEmployee.increaseSalary(10);
		System.out.printf("Annual salary after 10%% increase: $%.2f%n", firstEmployee.getAnnualSalary());
		
		System.out.println();
		
		Employee secondEmployee = new Employee("Mary Blue", 1700.0);
		System.out.println("Employee #2:");
		System.out.println("Name: " + secondEmployee.getName());
		System.out.printf("Annual salary: $%.2f%n", secondEmployee.getAnnualSalary());
		secondEmployee.increaseSalary(25);
		System.out.printf("Annual salary after 25%% increase: $%.2f%n", secondEmployee.getAnnualSalary());
	}

}

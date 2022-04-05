package model.entities;

import model.exceptions.InvalidSalaryException;
import model.exceptions.InvalidPercentageException;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		if (salary <= 0.0) {
			throw new InvalidSalaryException("The salary must be greater than zero!");
		}
		
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if (salary <= 0.0) {
			throw new InvalidSalaryException("The salary must be greater than zero!");
		}
		
		this.salary = salary;
	}
	
	public double getAnnualSalary() {
		return salary * 12;
	}
	
	public void increaseSalary(int percentage) {
		if (percentage <= 0) {
			throw new InvalidPercentageException("The percentage for salary increase must be greater than zero!");
		}
		
		salary += salary / 100 * percentage;
	}
}

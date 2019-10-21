package com.website.restfull.Model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document("Employee")
public class Employee {
	
	@Id
    private String empId;
    private String name;
    private int age;
    private double salary;
	public synchronized String getEmpId() {
		return empId;
	}
	public synchronized void setEmpId(String empId) {
		this.empId = empId;
	}
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized int getAge() {
		return age;
	}
	public synchronized void setAge(int age) {
		this.age = age;
	}
	public synchronized double getSalary() {
		return salary;
	}
	public synchronized void setSalary(double salary) {
		this.salary = salary;
	}

}

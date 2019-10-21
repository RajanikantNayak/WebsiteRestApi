package com.website.restfull.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Department")
public class Department {

	@Id
	private String id;

	@Indexed(name = "deptName")
	private String name;
	private String description;

	private List<Employee> employees;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public synchronized List<Employee> getEmployees() {
		return employees;
	}

	public synchronized void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}

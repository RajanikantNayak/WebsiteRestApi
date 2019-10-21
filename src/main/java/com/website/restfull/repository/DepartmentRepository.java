package com.website.restfull.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.website.restfull.Model.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {
	
	@Query(value = "{'employees.name': ?0}", fields = "{'employees' : 0}")
    Department findDepartmentByEmployeeName(String empName);

    List findDepartmentByName(String name);

}

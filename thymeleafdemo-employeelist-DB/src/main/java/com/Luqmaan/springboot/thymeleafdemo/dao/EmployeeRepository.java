package com.Luqmaan.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luqmaan.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//Automatically sort by first name using spring jpa
	public List<Employee> findAllByOrderByLastNameAsc();
}

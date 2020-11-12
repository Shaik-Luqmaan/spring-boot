package com.Luqmaan.springboot.cruddemo.dao;

import com.Luqmaan.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

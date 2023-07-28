package com.codeherk.taskapi.repo;

import com.codeherk.taskapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
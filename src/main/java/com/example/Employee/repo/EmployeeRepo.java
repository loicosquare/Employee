package com.example.Employee.repo;

import com.example.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional <Employee>findEmployeeById(Long id); // optional because there can be a situation where they may not be an employee
}

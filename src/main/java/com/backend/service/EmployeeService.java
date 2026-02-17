package com.backend.service;

import java.util.List;
import com.backend.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void deleteEmployee(Long id);
    
    Employee updateEmployee(Long id,Employee employee);
}

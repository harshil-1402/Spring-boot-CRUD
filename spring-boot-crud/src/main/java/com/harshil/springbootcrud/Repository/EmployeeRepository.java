package com.harshil.springbootcrud.Repository;

import com.harshil.springbootcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all CRUD methods
}

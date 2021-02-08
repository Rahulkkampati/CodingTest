package com.app.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.restapp.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

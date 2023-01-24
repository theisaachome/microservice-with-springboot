package com.isaachome.employee.repos;

import com.isaachome.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepos extends JpaRepository<Employee,Long> {

}

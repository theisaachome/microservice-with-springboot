package com.isaachome.department.repos;

import com.isaachome.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepos extends JpaRepository<Department,Long> {
   Department findByDepartmentCode(String code);
}

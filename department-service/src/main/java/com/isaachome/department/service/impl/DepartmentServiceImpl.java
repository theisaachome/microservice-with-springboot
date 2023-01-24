package com.isaachome.department.service.impl;

import com.isaachome.department.dto.DepartmentDTO;
import com.isaachome.department.entity.Department;
import com.isaachome.department.repos.DepartmentRepos;
import com.isaachome.department.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepos departmentRepos;

    public DepartmentServiceImpl(DepartmentRepos departmentRepos) {
        this.departmentRepos = departmentRepos;
    }

    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
        var department = new Department(departmentDTO.getDepartmentName(),departmentDTO.getDepartmentDescription(),departmentDTO.getDepartmentCode());
        departmentRepos.save(department);
        var departmentDto=new DepartmentDTO(department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode());
        return  departmentDto;
    }

    @Override
    public DepartmentDTO getDepartmentByCode(String code) {
        var department = departmentRepos.findByDepartmentCode(code);
        return new DepartmentDTO(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode());
    }
}

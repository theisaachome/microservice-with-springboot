package com.isaachome.employee.service.impl;

import com.isaachome.employee.dto.APIResponseDTO;
import com.isaachome.employee.dto.EmployeeDTO;
import com.isaachome.employee.repos.EmployeeRepos;
import com.isaachome.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepos employeeRepos;

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDto) {
        return null;
    }

    @Override
    public APIResponseDTO getEmployeeById(Long employeeId) {
        return null;
    }
}

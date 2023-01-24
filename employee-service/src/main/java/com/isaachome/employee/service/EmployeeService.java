package com.isaachome.employee.service;
import com.isaachome.employee.dto.APIResponseDTO;
import com.isaachome.employee.dto.EmployeeDTO;

public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDto);
    APIResponseDTO getEmployeeById(Long employeeId);
}

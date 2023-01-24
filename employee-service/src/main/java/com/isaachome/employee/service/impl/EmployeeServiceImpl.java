package com.isaachome.employee.service.impl;

import com.isaachome.employee.dto.APIResponseDTO;
import com.isaachome.employee.dto.DepartmentDTO;
import com.isaachome.employee.dto.EmployeeDTO;
import com.isaachome.employee.entity.Employee;
import com.isaachome.employee.repos.EmployeeRepos;
import com.isaachome.employee.service.APIClient;
import com.isaachome.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepos employeeRepos;
    @Autowired
    private APIClient apiClient;
    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDto) {
        var emp = new Employee(employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getDepartmentCode());
       var savedEmp= employeeRepos.save(emp);
        var empDto=new EmployeeDTO(savedEmp.getId(),savedEmp.getFirstName(),savedEmp.getLastName(), savedEmp.getEmail(),
                savedEmp.getDepartmentCode());
        return empDto;
    }

    @Override
    public APIResponseDTO getEmployeeById(Long employeeId) {
        var emp = employeeRepos.findById(employeeId).get();
        DepartmentDTO departmentDto = apiClient.getDepartment(emp.getDepartmentCode());

        EmployeeDTO employeeDto = new EmployeeDTO(
                emp.getId(),
                emp.getFirstName(),
                emp.getLastName(),
                emp.getEmail(),
                emp.getDepartmentCode()
        );

        APIResponseDTO apiResponseDto = new APIResponseDTO();
        apiResponseDto.setEmployeeDTO(employeeDto);
        apiResponseDto.setDepartmentDTO(departmentDto);
        return apiResponseDto;
    }
}

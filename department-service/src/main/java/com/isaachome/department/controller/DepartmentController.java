package com.isaachome.department.controller;

import com.isaachome.department.dto.DepartmentDTO;
import com.isaachome.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/departments")
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO dto){
      var departmentSaved= departmentService.saveDepartment(dto);
      return  new ResponseEntity<>(departmentSaved, HttpStatus.CREATED);

    }

    @GetMapping("{code}")
    public ResponseEntity<DepartmentDTO> getDepartment(@PathVariable("code") String code){
        var department=departmentService.getDepartmentByCode(code);
        return  new ResponseEntity<>(department,HttpStatus.OK);
    }

}

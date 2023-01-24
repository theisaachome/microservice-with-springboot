package com.isaachome.employee.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    private String departmentCode;
    public  Employee(String firstName,String lastName,String email,String departmentCode){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.departmentCode=departmentCode;
    }
}

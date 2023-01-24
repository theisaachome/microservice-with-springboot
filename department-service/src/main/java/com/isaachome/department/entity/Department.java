package com.isaachome.department.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String departmentName;
    private  String departmentDescription;
    private  String departmentCode;
    public Department(String departmentName,String departmentDescription,String departmentCode){
         this.departmentName=departmentName;
         this.departmentDescription=departmentDescription;
         this.departmentCode=departmentCode;
    }
}

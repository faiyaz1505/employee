package com.employee.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private String employeeId;
    private String employeeName;
    private String employeeMobileNo;
    private float employeeSalary;
    private boolean employmentStatus;
    private String employeePhoto;
    private LocalDate employmentStartDate;
    private LocalDate employmentEndDate;



}

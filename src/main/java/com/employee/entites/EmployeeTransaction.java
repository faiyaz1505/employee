package com.employee.entites;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeTransaction {
    @Id
    private String transactionId;
    private String employeeId;
    private float transactionAmount;
    private LocalDate transactionDate;
    private String comment;
}

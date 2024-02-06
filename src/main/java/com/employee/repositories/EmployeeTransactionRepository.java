package com.employee.repositories;

import com.employee.entites.EmployeeTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeTransactionRepository extends MongoRepository<EmployeeTransaction,String> {
    List<EmployeeTransaction> findByEmployeeId(String employeeId);
}

package com.employee.services;

import com.employee.entites.EmployeeTransaction;
import com.employee.repositories.EmployeeTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTransactionService {
    @Autowired
    private EmployeeTransactionRepository employeeTransactionRepository;


    public EmployeeTransaction saveEmployeeTransaction(EmployeeTransaction employeeTransaction){
        return employeeTransactionRepository.save(employeeTransaction);
    }

    public EmployeeTransaction getTransactionById(String transactionId){
        return employeeTransactionRepository.findById(transactionId).orElse(null);
    }

    public List<EmployeeTransaction>getAllEmployeeTransaction(){
        return employeeTransactionRepository.findAll();
    }

    public EmployeeTransaction updateTransactionDetail(EmployeeTransaction employeeTransaction){
        return employeeTransactionRepository.save(employeeTransaction);
    }

    public void deleteTransactionById(String transactionId){
        employeeTransactionRepository.deleteById(transactionId);
    }

    public List<EmployeeTransaction> getTransactionByEmployeeId(String employeeId){
        return employeeTransactionRepository.findByEmployeeId(employeeId);
    }
}

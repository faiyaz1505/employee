package com.employee.controllers;

import com.employee.entites.EmployeeTransaction;
import com.employee.services.EmployeeService;
import com.employee.services.EmployeeTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transaction")
public class EmployeeTransactionController {
    @Autowired
    private EmployeeTransactionService employeeTransactionService;

    @PostMapping
    public ResponseEntity<EmployeeTransaction> saveTransaction(@RequestBody EmployeeTransaction employeeTransaction){
        return new ResponseEntity<>(employeeTransactionService.saveEmployeeTransaction(employeeTransaction), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<EmployeeTransaction> getTransactionById(@RequestParam String transactionId){
        return new ResponseEntity<>(employeeTransactionService.getTransactionById(transactionId),HttpStatus.OK);
    }
    @GetMapping("allTransactions")
    public ResponseEntity<List<EmployeeTransaction>> getAllTransaction(){
        return new ResponseEntity<>(employeeTransactionService.getAllEmployeeTransaction(),HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<EmployeeTransaction> updateTransaction(@RequestBody EmployeeTransaction employeeTransaction){
        return new ResponseEntity<>(employeeTransactionService.updateTransactionDetail(employeeTransaction),HttpStatus.OK);
    }
    @DeleteMapping
    public void deleteTransaction(@RequestParam String transactionId){
        employeeTransactionService.deleteTransactionById(transactionId);
    }
    @GetMapping("getTransactionByEmployeeId")
    public ResponseEntity<List<EmployeeTransaction>> getTransactionByEmployeeId(@RequestParam String employeeId){
        return new ResponseEntity<>(employeeTransactionService.getTransactionByEmployeeId(employeeId),HttpStatus.OK);
    }
}

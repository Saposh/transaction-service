package com.juniortest.transaction_service.controllers;

import com.juniortest.transaction_service.Services.TransactionService;
import com.juniortest.transaction_service.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> recordTransaction(@RequestBody Transaction transaction) {
        Transaction savedTransactions = transactionService.saveTransaction(transaction);
        return ResponseEntity.ok(savedTransactions);
    }

    @GetMapping("/exceeded")
    public ResponseEntity<List<Transaction>> getExceededTransactions() {
        return ResponseEntity.ok(tra);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }
}

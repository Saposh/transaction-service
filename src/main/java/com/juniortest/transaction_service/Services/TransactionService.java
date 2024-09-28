package com.juniortest.transaction_service.Services;

import com.juniortest.transaction_service.model.Transaction;
import com.juniortest.transaction_service.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepo transRepo;
    public Transaction saveTransaction(Transaction transaction) {
        return transRepo.save(transaction);
    }

    public List<Transaction> getTransactionByCategoryAndDate(String category, LocalDate startdate, LocalDate endDate) {
        return transRepo.findByCategoryAndDateBetween(category, startdate, endDate);
    }

    public List<Transaction> getAllTransactions() {
        return transRepo.findAll();
    }

}

package com.juniortest.transaction_service.repo;

import com.juniortest.transaction_service.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCategoryAndDateBetween(String category, LocalDate startDate, LocalDate endDate);
}

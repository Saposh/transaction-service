package com.juniortest.transaction_service.repo;

import com.juniortest.transaction_service.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ExchangeRateRepo extends JpaRepository<ExchangeRate, Long> {
    Optional<ExchangeRate> findByCurrencyAndDate(String currencyPair, LocalDate date);
}

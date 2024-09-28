package com.juniortest.transaction_service.Services;

import com.juniortest.transaction_service.model.ExchangeRate;
import com.juniortest.transaction_service.repo.ExchangeRateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ExchangeRateService {
    @Autowired
    private ExchangeRateRepo exchangeRateRepo;

    public ExchangeRate saveExchangeRate(ExchangeRate exchangeRate) {
        return exchangeRateRepo.save(exchangeRate);
    }

    public Optional<ExchangeRate> getExchangeRateByCurrencyPairAndDate(String currencyPair, LocalDate date) {
        return exchangeRateRepo.findByCurrencyAndDate(currencyPair, date);
    }
}

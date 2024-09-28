package com.juniortest.transaction_service.Services;

import com.juniortest.transaction_service.model.SpendingLimit;
import com.juniortest.transaction_service.repo.SpendingLimitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpendingLimitService {
    @Autowired
    private SpendingLimitRepo spendingLimitRepo;

    public SpendingLimit saveSpendingLimit(SpendingLimit spendingLimit) {
        return spendingLimitRepo.save(spendingLimit);
    }

    public SpendingLimit getSpendingLimit(String category) {
        return spendingLimitRepo.findByCategory(category);
    }

    public List<SpendingLimit> getAllSpendingLimits() {
        return spendingLimitRepo.findAll();
    }
}

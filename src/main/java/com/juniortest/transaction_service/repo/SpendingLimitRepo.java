package com.juniortest.transaction_service.repo;

import com.juniortest.transaction_service.model.SpendingLimit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendingLimitRepo extends JpaRepository<SpendingLimit, Long> {
    SpendingLimit findByCategory(String category);
}

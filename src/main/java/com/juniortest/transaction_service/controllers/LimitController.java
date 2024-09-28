package com.juniortest.transaction_service.controllers;

import com.juniortest.transaction_service.Services.SpendingLimitService;
import com.juniortest.transaction_service.model.SpendingLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/limits")
public class LimitController {
    @Autowired
    private SpendingLimitService spendingLimitService;

    @PostMapping
    public ResponseEntity<SpendingLimit> setSpendingLimit(@RequestBody SpendingLimit spendingLimit) {
        SpendingLimit savedLimit = spendingLimitService.saveSpendingLimit(spendingLimit);
        return ResponseEntity.ok(savedLimit);
    }

    @GetMapping("/{category}")
    public ResponseEntity<SpendingLimit> getSpendingLimit(@PathVariable String category) {
        SpendingLimit spendingLimit = spendingLimitService.getSpendingLimit(category);
        return ResponseEntity.ok(spendingLimit);
    }

    @GetMapping
    public ResponseEntity<List<SpendingLimit>> getAllSpendingLimit() {
        List<SpendingLimit> spendingLimits = spendingLimitService.getAllSpendingLimits();
        return ResponseEntity.ok(spendingLimits);
    }
}

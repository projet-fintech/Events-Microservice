package com.banque.events.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyLoanPaying {

    private UUID compteId;
    private Double amount;
}
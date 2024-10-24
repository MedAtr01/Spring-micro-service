package com.comptes_bancaires.dtos;

import com.comptes_bancaires.enums.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class BankAccountRequestDto {
    private double balance;
    private String currency;
    private AccountType accountType;
}

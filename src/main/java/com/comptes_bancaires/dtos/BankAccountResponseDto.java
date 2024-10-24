package com.comptes_bancaires.dtos;

import com.comptes_bancaires.enums.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class BankAccountResponseDto {
    private Date createdAt;
    private double balance;
    private String currency;
    private AccountType accountType;
}

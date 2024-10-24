package com.comptes_bancaires.entities;

import com.comptes_bancaires.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class BankAccount {
    @Id
    private String AccountId;
    private Date createdAt;
    private double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
}

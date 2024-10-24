package com.comptes_bancaires.services;

import com.comptes_bancaires.dtos.BankAccountRequestDto;
import com.comptes_bancaires.dtos.BankAccountResponseDto;
import com.comptes_bancaires.entities.BankAccount;
import com.comptes_bancaires.mapper.BankAccountMapper;
import com.comptes_bancaires.repositories.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service @Transactional @RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
    private final BankAccountMapper bankAccountMapper;
    private final BankAccountRepository bankAccountRepository;
    @Override
    public BankAccountResponseDto addAccount(BankAccountRequestDto bankAccountRequestDto) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountId(UUID.randomUUID().toString());
        bankAccount.setCreatedAt(new Date());
        bankAccount.setAccountType(bankAccountRequestDto.getAccountType());
        bankAccount.setBalance(bankAccountRequestDto.getBalance());
        bankAccount.setCurrency(bankAccountRequestDto.getCurrency());
        BankAccount savedAccount = bankAccountRepository.save(bankAccount);
        return bankAccountMapper.fromBankAccount(savedAccount);
    }
}

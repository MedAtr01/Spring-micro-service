package com.comptes_bancaires.mapper;

import com.comptes_bancaires.dtos.BankAccountResponseDto;
import com.comptes_bancaires.entities.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapperImpl implements BankAccountMapper  {
    @Override
    public BankAccount fromBankAccountDto(BankAccountResponseDto bankAccountResponseDto) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountType(bankAccountResponseDto.getAccountType());
        bankAccount.setCurrency(bankAccountResponseDto.getCurrency());
        bankAccount.setBalance(bankAccountResponseDto.getBalance());
        bankAccount.setCreatedAt(bankAccountResponseDto.getCreatedAt());

        return bankAccount;
    }

    @Override
    public BankAccountResponseDto fromBankAccount(BankAccount bankAccount) {
        BankAccountResponseDto bankAccountResponseDto = new BankAccountResponseDto();
        bankAccountResponseDto.setAccountType(bankAccount.getAccountType());
        bankAccountResponseDto.setCurrency(bankAccount.getCurrency());
        bankAccountResponseDto.setBalance(bankAccount.getBalance());
        bankAccountResponseDto.setCreatedAt(bankAccount.getCreatedAt());

        return bankAccountResponseDto;
    }
}

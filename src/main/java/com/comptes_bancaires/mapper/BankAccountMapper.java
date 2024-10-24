package com.comptes_bancaires.mapper;

import com.comptes_bancaires.dtos.BankAccountResponseDto;
import com.comptes_bancaires.entities.BankAccount;

public interface BankAccountMapper {
  BankAccount fromBankAccountDto(BankAccountResponseDto bankAccountResponseDto);
  BankAccountResponseDto fromBankAccount(BankAccount bankAccount);
}

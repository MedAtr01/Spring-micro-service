package com.comptes_bancaires.services;

import com.comptes_bancaires.dtos.BankAccountRequestDto;
import com.comptes_bancaires.dtos.BankAccountResponseDto;

public interface AccountService {
   BankAccountResponseDto addAccount(BankAccountRequestDto bankAccountRequestDto);
}

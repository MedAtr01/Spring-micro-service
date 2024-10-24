package com.comptes_bancaires.repositories;

import com.comptes_bancaires.entities.BankAccount;
import com.comptes_bancaires.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
   List<BankAccount> findByAccountType(AccountType type);
}

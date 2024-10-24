package com.comptes_bancaires;

import com.comptes_bancaires.entities.BankAccount;
import com.comptes_bancaires.enums.AccountType;
import com.comptes_bancaires.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.Format;
import java.util.Date;
import java.util.UUID;

import static java.lang.Math.round;

@SpringBootApplication
public class ComptesBancairesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComptesBancairesApplication.class, args);
    }
    @Bean

    CommandLineRunner start(BankAccountRepository bankAccountRepository){
        return args -> {
            for(int i = 0 ; i<10 ; i++){
                BankAccount bankAccount = new BankAccount();
                bankAccount.setAccountId(UUID.randomUUID().toString());
                bankAccount.setAccountType(Math.random()>0.5?AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT);
                bankAccount.setBalance(round(Math.random()*10000));
                bankAccount.setCurrency("USD");
                bankAccount.setCreatedAt(new Date());
                bankAccountRepository.save(bankAccount);
            }
        };


}

}

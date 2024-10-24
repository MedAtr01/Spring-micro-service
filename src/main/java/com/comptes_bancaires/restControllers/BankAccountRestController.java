package com.comptes_bancaires.restControllers;

import com.comptes_bancaires.dtos.BankAccountRequestDto;
import com.comptes_bancaires.entities.BankAccount;
import com.comptes_bancaires.repositories.BankAccountRepository;
import com.comptes_bancaires.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor
@RequestMapping("/accounts")
public class BankAccountRestController {
    private final BankAccountRepository accountRepository;
    private final AccountService accountService;

    @GetMapping(value = "")
    public ResponseEntity<?> getAccounts(){
        List<BankAccount> accounts = accountRepository.findAll();
      return   accounts.isEmpty()?ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found"): new ResponseEntity<>(accounts,HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getAccountById(@PathVariable String id) {
        Optional<BankAccount> account = accountRepository.findById(id);
      return   account.isPresent()?new ResponseEntity<>(account.get(),HttpStatus.OK):ResponseEntity.status(HttpStatus.NOT_FOUND).body( "Not Found");

    }
    @PostMapping("/add")
    public ResponseEntity<?> addAccount(@RequestBody BankAccountRequestDto account){
       return accountService.addAccount(account)!=null?new ResponseEntity<>(accountService.addAccount(account),HttpStatus.OK):ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error creating account");
    }


}

package com.prcbadminton.badminton.controller;

import com.prcbadminton.badminton.domain.Account;
import com.prcbadminton.badminton.repository.AccountRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(value = "/create-account", produces = {MediaType.APPLICATION_XML_VALUE})
    public String create() {
        Account account = new Account("tunggay", "123");
        accountRepository.save(account);
        return "<status>success</status>";
    }

    @GetMapping("/account")
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok(accountRepository.findAll());
    }

}

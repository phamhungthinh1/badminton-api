package com.prcbadminton.badminton.controller;

import com.prcbadminton.badminton.domain.Account;
import com.prcbadminton.badminton.repository.AccountRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    private final AccountRepository accountRepository;

    public MainController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        List<Account> accounts = accountRepository.findAll();
        request.setAttribute("ACCOUNTS", accounts);
        return "account";
    }
}

package com.prcbadminton.badminton.repository;

import com.prcbadminton.badminton.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}

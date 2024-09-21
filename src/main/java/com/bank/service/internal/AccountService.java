package com.bank.service.internal;

import com.bank.domain.Account;
import com.bank.repository.AccountRepository;

public class AccountService {
    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account findById(String srcAccId) {
        return this.repository.findById(srcAccId);
    }

    public void updateBalance(Account dstAcct) {
        this.repository.updateBalance(dstAcct);
    }

}

package com.bank.service.internal;

import com.bank.repository.AccountRepository;
import com.bank.repository.internal.SimpleAccountRepository;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class AccountServiceTest {

    @Test
    public void testHandleById() {
//        given
        String accId = "A1234";

        AccountRepository repository = new SimpleAccountRepository();
        AccountService accountService = new AccountService(repository);

        assertFalse(false);
    }
}

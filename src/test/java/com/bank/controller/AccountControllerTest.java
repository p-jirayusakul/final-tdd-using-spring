package com.bank.controller;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.bank.domain.Account;
import com.bank.domain.InsufficientFundsException;
import com.bank.repository.AccountRepository;
import com.bank.service.TransferService;


public class AccountControllerTest {
	@Test
    public void testHandleById() {

		TransferService service = mock(TransferService.class);

    	//given
    	String accId = "A123";

    	Account account = new Account(accId, 100d);
    	
    	AccountRepository repository = mock(AccountRepository.class);
    	when(repository.findById(anyString())).thenReturn(account);

		AccountController controller = new AccountController(repository, service);
    	
    	//when
    	Account result = controller.handleById(accId);
    	
    	//then
    	assertEquals(account, result);
	}
}

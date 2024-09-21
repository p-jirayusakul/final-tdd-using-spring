package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.domain.Account;
import com.bank.repository.AccountRepository;
import com.bank.service.TransferService;

@Controller
@RequestMapping("/account")
public class AccountController {
	private final AccountRepository repository;
	private final TransferService service;

	public AccountController(AccountRepository repository, TransferService service) {
		this.repository = repository;
		this.service = service;
	}

	public AccountRepository getRepository() {
		return repository;
	}

	public TransferService getService() {
		return service;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Account handleById(@PathVariable("id") String accId) {
		return repository.findById(accId);
	}
}

package com.bank.controller;

import com.bank.domain.InsufficientFundsException;
import com.bank.domain.TransferReceipt;
import com.bank.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/transfer")
public class TransferController {
    private final TransferService service;

    public TransferController(TransferService service) {
        this.service = service;
    }

    public TransferService getService() {
        return service;
    }

    @RequestMapping(value = "/{srcId}/transfer/{amount}/to/{destId}")
    public TransferReceipt handleTransfer(@PathVariable("srcId") String srcId,
                                          @PathVariable("amount") double amount,
                                          @PathVariable("destId") String destId) throws InsufficientFundsException {
        return service.transfer(amount, srcId, destId);
    }
}

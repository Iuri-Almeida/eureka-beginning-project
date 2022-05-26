package br.com.ialmeida.bankservice.controllers;

import br.com.ialmeida.bankservice.clients.BankClient;
import br.com.ialmeida.bankservice.entities.Bank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/banks")
public class BankController {

    private final BankClient bankClient;

    public BankController(BankClient bankClient) {
        this.bankClient = bankClient;
    }

    @GetMapping(value = "/{code}")
    public Bank getAddressByCode(@PathVariable Long code) {
        return bankClient.getAddressByCode(code);
    }
}

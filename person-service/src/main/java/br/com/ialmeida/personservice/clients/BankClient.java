package br.com.ialmeida.personservice.clients;

import br.com.ialmeida.personservice.entities.Bank;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bank")
public interface BankClient {

    @GetMapping(value = "/banks/{code}")
    Bank getBankByCode(@PathVariable Long code);

}

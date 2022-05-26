package br.com.ialmeida.personservice.clients;

import br.com.ialmeida.personservice.entities.Bank;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8082/banks", name = "bank")
public interface BankClient {

    @GetMapping(value = "/{code}")
    Bank getBankByCode(@PathVariable String code);

}

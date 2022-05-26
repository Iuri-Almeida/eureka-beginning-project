package br.com.ialmeida.bankservice.clients;

import br.com.ialmeida.bankservice.entities.Bank;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://brasilapi.com.br/api/banks/v1", name = "bank")
public interface BankClient {

    @GetMapping(value = "/{code}")
    Bank getAddressByCode(@PathVariable Long code);

}

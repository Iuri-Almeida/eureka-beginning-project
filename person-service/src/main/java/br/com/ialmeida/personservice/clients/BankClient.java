package br.com.ialmeida.personservice.clients;

import br.com.ialmeida.personservice.entities.Bank;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bank")
public interface BankClient {

    @GetMapping(value = "/banks/{code}")
    @CircuitBreaker(name = "service")
    Bank getBankByCode(@PathVariable Long code);

}

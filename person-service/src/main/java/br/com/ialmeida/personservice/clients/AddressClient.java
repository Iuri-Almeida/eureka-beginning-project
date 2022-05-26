package br.com.ialmeida.personservice.clients;

import br.com.ialmeida.personservice.entities.Address;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address")
public interface AddressClient {

    @GetMapping(value = "/address/{cep}")
    @CircuitBreaker(name = "service")
    Address getAddressByCEP(@PathVariable String cep);

}

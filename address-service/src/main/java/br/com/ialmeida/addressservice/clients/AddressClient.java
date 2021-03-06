package br.com.ialmeida.addressservice.clients;

import br.com.ialmeida.addressservice.entities.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "address")
public interface AddressClient {

    @GetMapping(value = "/{cep}/json")
    Address getAddressByCEP(@PathVariable String cep);

}

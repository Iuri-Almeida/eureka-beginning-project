package br.com.ialmeida.addressservice.controllers;

import br.com.ialmeida.addressservice.clients.AddressClient;
import br.com.ialmeida.addressservice.entities.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    private final AddressClient addressClient;

    public AddressController(AddressClient addressClient) {
        this.addressClient = addressClient;
    }

    @GetMapping(value = "/{cep}")
    public Address getAddressByCEP(@PathVariable String cep) {
        return addressClient.getAddressByCEP(cep);
    }
}

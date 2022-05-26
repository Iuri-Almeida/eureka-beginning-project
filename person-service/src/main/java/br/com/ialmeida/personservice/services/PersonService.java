package br.com.ialmeida.personservice.services;

import br.com.ialmeida.personservice.clients.AddressClient;
import br.com.ialmeida.personservice.clients.BankClient;
import br.com.ialmeida.personservice.entities.Address;
import br.com.ialmeida.personservice.entities.Bank;
import br.com.ialmeida.personservice.entities.Person;
import br.com.ialmeida.personservice.entities.PersonDTO;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final AddressClient addressClient;
    private final BankClient bankClient;

    public PersonService(AddressClient addressClient, BankClient bankClient) {
        this.addressClient = addressClient;
        this.bankClient = bankClient;
    }

    public Person insertPerson(PersonDTO personDTO) {
        Person person = new Person();

        person.setName(personDTO.getName());
        person.setEmail(personDTO.getEmail());
        person.setCpf(personDTO.getCpf());

        // address client
        Address address = addressClient.getAddressByCEP(personDTO.getCep());
        if (address != null) {
            person.setCep(address.getCep());
            person.setLogradouro(address.getLogradouro());
            person.setBairro(address.getBairro());
            person.setLocalidade(address.getLocalidade());
            person.setUf(address.getUf());
            person.setDdd(address.getDdd());
        }

        // bank client
        Bank bank = bankClient.getBankByCode(personDTO.getBankCode());
        if (bank != null) {
            person.setBankCode(bank.getCode());
            person.setBankName(bank.getName());
        }

        return person;
    }
}

package br.com.ialmeida.personservice.controllers;

import br.com.ialmeida.personservice.entities.Person;
import br.com.ialmeida.personservice.entities.PersonDTO;
import br.com.ialmeida.personservice.services.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person insertPerson(@RequestBody PersonDTO personDTO) {
        return personService.insertPerson(personDTO);
    }

}

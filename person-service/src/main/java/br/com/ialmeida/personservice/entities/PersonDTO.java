package br.com.ialmeida.personservice.entities;

import lombok.Data;

@Data
public class PersonDTO {

    private String name;
    private String email;
    private String cpf;
    private String cep;
    private Long bankCode;

}

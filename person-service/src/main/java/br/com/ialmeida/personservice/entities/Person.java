package br.com.ialmeida.personservice.entities;

import lombok.Data;

@Data
public class Person {

    private String name;
    private String email;
    private String cpf;
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;
    private Long bankCode;
    private String bankName;

}

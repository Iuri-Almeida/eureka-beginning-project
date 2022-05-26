package br.com.ialmeida.personservice.entities;

import lombok.Data;

@Data
public class Address {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;

}

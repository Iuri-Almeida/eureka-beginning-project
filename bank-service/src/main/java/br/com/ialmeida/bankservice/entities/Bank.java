package br.com.ialmeida.bankservice.entities;

import lombok.Data;

@Data
public class Bank {

    private Long code;
    private String name;
    private String fullName;

}

package com.example.meu_primeiro_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //indicar quer e uma entidade JPA
@Table(name = "produtos") //Cria a tabela no banco
public class Produto {
    
    @Id //indica que e um id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que e uma pk e e gerada de forma automatica
    private Long id;

    private String name;
    private Double value;

    public Produto(){}

    public Produto( String name, Double value){
        this.name = name;
        this.value = value;
    }

    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}

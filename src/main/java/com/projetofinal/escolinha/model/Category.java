package com.projetofinal.escolinha.model;


import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;


    // Metodos Construtores
    public Category(){

    }

    public Category(Integer id){
        this.id = id;
    }

    //Metodos Especiais
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

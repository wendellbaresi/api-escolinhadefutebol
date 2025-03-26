package com.projetofinal.escolinha.model;


import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;


    // Metodos Construtores
    public Categoria(){

    }

    public Categoria(Integer id){
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

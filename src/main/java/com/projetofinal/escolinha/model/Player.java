package com.projetofinal.escolinha.model;

import javax.persistence.*;

@Entity
@Table(name = "jogador")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;
    @Column
    private Integer idade;
    @Column
    private Double altura;
    @Column
    private Double peso;
    @Column
    private String perna;
    @Column
    private String posicao;

    @ManyToOne // Relaçao de Muitos para Um
    @JoinColumn(name = "id_categoria")
    private Category category;



    public Player(){

    }





    // Metodos Getter e Setter
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getPerna() {
        return perna;
    }

    public void setPerna(String perna) {
        this.perna = perna;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Category getCategoria() {
        return category;
    }

    public void setCategoria(Category category) {
        this.category = category;
    }
}

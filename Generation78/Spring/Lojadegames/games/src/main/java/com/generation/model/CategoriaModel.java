package com.generation.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "tb_categorias")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo DESCRIÇÃO é Obrigatório!") 
    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="categoria", cascade=CascadeType.REMOVE)
    @JsonIgnoreProperties("categoria")
    private List<ProdutoModel> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }

}
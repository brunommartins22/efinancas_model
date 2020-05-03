/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno_martins.efinancas.models;

import br.com.bruno_martins.erplibrary.AtributoPadrao;
import br.com.bruno_martins.erplibrary.EntidadeBase;
import br.com.bruno_martins.padrao.rest.domains.DominioAtivo;
import br.com.bruno_martins.padrao.rest.models.Cidade;
import br.com.bruno_martins.padrao.rest.models.Estado;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Bruno Martins
 */
@Entity
@Table(name = "endereco")
public class Endereco extends EntidadeBase<Serializable> {

    @Id
    @SequenceGenerator(name = "gen_endereco", sequenceName = "sq_endereco", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_endereco")
    @Column(name = "id")
    private Integer id;

    @Column(name = "logradouro", length = 255, nullable = false)
    private String logradouro;

    @Column(name = "cep", length = 9, nullable = false, unique = true)
    private String cep;

    @Column(name = "bairro", length = 120, nullable = false)
    private String bairro;

    @Column(name = "complemento", length = 255)
    private String complemento;

    @Column(name = "numero", length = 120, nullable = false)
    private String numero;

    @OneToOne
    @JoinColumn(name = "id_cidade", foreignKey = @ForeignKey(name = "fk01_endereco"), nullable = false)
    private Cidade cidade;

    @OneToOne
    @JoinColumn(name = "id_estado", foreignKey = @ForeignKey(name = "fk02_endereco"), nullable = false)
    private Estado estado;

    @Embedded
    private AtributoPadrao atributoPadrao = new AtributoPadrao();

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", foreignKey = @ForeignKey(name = "fk03_endereco"), nullable = false)
    private Pessoa pessoa;

    @Enumerated(EnumType.STRING)
    @Column(name = "ativo", nullable = false, length = 1)
    private DominioAtivo ativo;

    //*********************** implementations methods **************************
    @Override
    public Serializable getChavePrimaria() {

        return this.id;

    }

    public boolean isExistPrimaryKey() {

        return this != null && this.getChavePrimaria() != null;

    }

    //************************** gets && sets **********************************
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public AtributoPadrao getAtributoPadrao() {
        return atributoPadrao;
    }

    public void setAtributoPadrao(AtributoPadrao atributoPadrao) {
        this.atributoPadrao = atributoPadrao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public DominioAtivo getAtivo() {
        return ativo;
    }

    public void setAtivo(DominioAtivo ativo) {
        this.ativo = ativo;
    }

}

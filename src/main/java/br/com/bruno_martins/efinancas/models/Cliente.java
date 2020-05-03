/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno_martins.efinancas.models;

import br.com.bruno_martins.erplibrary.AtributoPadrao;
import br.com.bruno_martins.erplibrary.EntidadeBase;
import br.com.bruno_martins.padrao.rest.domains.DominioAtivo;
import java.io.Serializable;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Bruno Martins
 */
@Entity
@Table(name = "cliente")
public class Cliente extends EntidadeBase<Serializable> {

    @Id
    @SequenceGenerator(name = "gen_cliente", sequenceName = "sq_cliente", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_cliente")
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Pessoa.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pessoa", foreignKey = @ForeignKey(name = "fk01_cliente"), nullable = false, unique = true)
    private Pessoa pessoa;

    @Embedded
    private AtributoPadrao atributoPadrao;

    @Enumerated(EnumType.STRING)
    @Column(name = "ativo", nullable = false,length = 1)
    private DominioAtivo ativo;

    //*********************** implementations methods **************************
    @Override
    public Serializable getChavePrimaria() {

        return this.id;

    }

    public boolean isExistPrimaryKey() {

        return this != null && this.getChavePrimaria() != null;

    }

    //*************************** gets && sets *********************************
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public AtributoPadrao getAtributoPadrao() {
        return atributoPadrao;
    }

    public void setAtributoPadrao(AtributoPadrao atributoPadrao) {
        this.atributoPadrao = atributoPadrao;
    }

    public DominioAtivo getAtivo() {
        return ativo;
    }

    public void setAtivo(DominioAtivo ativo) {
        this.ativo = ativo;
    }

}

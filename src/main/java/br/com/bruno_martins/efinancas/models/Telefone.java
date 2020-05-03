/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno_martins.efinancas.models;

import br.com.bruno_martins.efinancas.domains.DominioTipoOperadoraTelefone;
import br.com.bruno_martins.efinancas.domains.DominioTipoTelefone;
import br.com.bruno_martins.erplibrary.AtributoPadrao;
import br.com.bruno_martins.erplibrary.EntidadeBase;
import br.com.bruno_martins.padrao.rest.domains.DominioAtivo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

/**
 *
 * @author Bruno Martins
 */
@Entity
@Table(name = "telefone")
public class Telefone extends EntidadeBase<Serializable> {

    @Id
    @SequenceGenerator(name = "gen_telefone", sequenceName = "sq_telefone", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_telefone")
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tipo_telefone", length = 7, nullable = false)
    private DominioTipoTelefone tipo;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tipo_operadora", length = 5)
    private DominioTipoOperadoraTelefone tipoOperadora;

    @DecimalMin(value = "0")
    @DecimalMax(value = "99999999999")
    @Column(name = "numero", precision = 11, nullable = false, unique = true)
    private BigDecimal numero;

    @Embedded
    private AtributoPadrao atributoPadrao = new AtributoPadrao();

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", foreignKey = @ForeignKey(name = "fk01_telefone"), nullable = false)
    private Pessoa pessoa;

    @Enumerated(EnumType.STRING)
    @Column(name = "ativo", length = 1, nullable = false)
    private DominioAtivo ativo;

    //************************ implementation method ***************************
    @Override
    public Serializable getChavePrimaria() {
        return this.id;
    }

    public boolean isExistChavePrimaria() {

        return this != null && this.getChavePrimaria() != null;

    }

    //****************************** get && sets *******************************
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DominioTipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(DominioTipoTelefone tipo) {
        this.tipo = tipo;
    }

    public DominioTipoOperadoraTelefone getTipoOperadora() {
        return tipoOperadora;
    }

    public void setTipoOperadora(DominioTipoOperadoraTelefone tipoOperadora) {
        this.tipoOperadora = tipoOperadora;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public void setNumero(BigDecimal numero) {
        this.numero = numero;
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

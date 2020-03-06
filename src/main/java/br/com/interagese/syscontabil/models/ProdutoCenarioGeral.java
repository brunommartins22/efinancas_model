/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.syscontabil.models;

import br.com.interagese.erplibrary.AtributoPadrao;
import br.com.interagese.syscontabil.domains.DominioRegras;
import br.com.interagese.syscontabil.dto.CountProdutos;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dinael
 */

@Entity
@Table (name = "produto_cenario_geral")
public class ProdutoCenarioGeral implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_produto_cenario_geral")
    @SequenceGenerator(name = "gen_produto_cenario_geral", sequenceName = "seq_produto_cenario_geral")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private ProdutoGeral produtoGeral;
    @ManyToOne
    private Cenario cenario;
    @Enumerated(EnumType.STRING)
    private DominioRegras dominioRegras;
    @Column(length = 20)
    private Long regraId;
    @Embedded
    private TributoFederalPadrao tributoFederal;
    @Embedded
    private TributoEstadualPadrao tributoEstadual;
    @Transient
    private CountProdutos countProdutos;
    @Embedded
    private AtributoPadrao atributoPadrao;
    
//******************************************************************************

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProdutoGeral getProdutoGeral() {
        return produtoGeral;
    }

    public void setProdutoGeral(ProdutoGeral produtoGeral) {
        this.produtoGeral = produtoGeral;
    }

    public Cenario getCenario() {
        return cenario;
    }

    public void setCenario(Cenario cenario) {
        this.cenario = cenario;
    }

    public DominioRegras getDominioRegras() {
        return dominioRegras;
    }

    public void setDominioRegras(DominioRegras dominioRegras) {
        this.dominioRegras = dominioRegras;
    }

    public Long getRegraId() {
        return regraId;
    }

    public void setRegraId(Long regraId) {
        this.regraId = regraId;
    }

    public TributoFederalPadrao getTributoFederal() {
        return tributoFederal;
    }

    public void setTributoFederal(TributoFederalPadrao tributoFederal) {
        this.tributoFederal = tributoFederal;
    }

    public TributoEstadualPadrao getTributoEstadual() {
        return tributoEstadual;
    }

    public void setTributoEstadual(TributoEstadualPadrao tributoEstadual) {
        this.tributoEstadual = tributoEstadual;
    }

    public CountProdutos getCountProdutos() {
        return countProdutos;
    }

    public void setCountProdutos(CountProdutos countProdutos) {
        this.countProdutos = countProdutos;
    }

    public AtributoPadrao getAtributoPadrao() {
        return atributoPadrao;
    }

    public void setAtributoPadrao(AtributoPadrao atributoPadrao) {
        this.atributoPadrao = atributoPadrao;
    }
    
}

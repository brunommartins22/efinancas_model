/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.syscontabil.models;

import br.com.interagese.erplibrary.AtributoPadrao;
import br.com.interagese.syscontabil.domains.DominioTipoProduto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Bruno Martins
 */
@Entity
@Table(name = "produto_geral")
public class ProdutoGeral implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_produto_geral")
    @SequenceGenerator(name = "gen_produto_geral", sequenceName = "seq_produto_geral")
    private Long id;
    @Column(length = 255)
    private String nomeProduto;
    @Column(length = 14, unique = true)
    private Long ean;
    @Column(length = 8, nullable = false)
    private String ncm;
    @Column(length = 7)
    private String cest;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DominioTipoProduto tipoProduto;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProdutoGeral> listaProdutosCompostos;
    @Embedded
    private AtributoPadrao atributoPadrao = new AtributoPadrao();

    //************************* Equals && HashCode *****************************
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProdutoGeral other = (ProdutoGeral) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.interagese.syscontabil.models.ProdutoGeral{" + "id=" + id + '}';
    }

    //***************************** get && setts *******************************
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the ean
     */
    public Long getEan() {
        return ean;
    }

    /**
     * @param ean the ean to set
     */
    public void setEan(Long ean) {
        this.ean = ean;
    }

    /**
     * @return the ncm
     */
    public String getNcm() {
        return ncm;
    }

    /**
     * @param ncm the ncm to set
     */
    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    /**
     * @return the cest
     */
    public String getCest() {
        return cest;
    }

    /**
     * @param cest the cest to set
     */
    public void setCest(String cest) {
        this.cest = cest;
    }

    /**
     * @return the atributoPadrao
     */
    public AtributoPadrao getAtributoPadrao() {
        return atributoPadrao;
    }

    /**
     * @param atributoPadrao the atributoPadrao to set
     */
    public void setAtributoPadrao(AtributoPadrao atributoPadrao) {
        this.atributoPadrao = atributoPadrao;
    }

    public DominioTipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(DominioTipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    /**
     * @return the listaProdutosCompostos
     */
    public List<ProdutoGeral> getListaProdutosCompostos() {
        if (listaProdutosCompostos == null) {
            listaProdutosCompostos = new ArrayList<>();
        }
        return listaProdutosCompostos;
    }

    /**
     * @param listaProdutosCompostos the listaProdutosCompostos to set
     */
    public void setListaProdutosCompostos(List<ProdutoGeral> listaProdutosCompostos) {
        this.listaProdutosCompostos = listaProdutosCompostos;
    }

}

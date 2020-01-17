/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.syscontabil.models;

import br.com.interagese.erplibrary.AtributoPadrao;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Dinael
 */
@Entity
@Table(name="mensagem_inativacao")
public class MensagemInativacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_mensagem_inativacao")
    @SequenceGenerator (name="gen_mensagem_inativacao", sequenceName = "seq_mensagem_inativacao")
    private Long id;
    
    @Column(nullable = false)
    private String nomeMensagemInativacao;
    
    @Embedded
    private AtributoPadrao atributoPadrao = new AtributoPadrao();

    
    //*********************** Equals && Hashcode *******************************
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final MensagemInativacao other = (MensagemInativacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    //**************************** get && setts ********************************

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMensagemInativacao() {
        return nomeMensagemInativacao;
    }

    public void setNomeMensssagemInativacao(String nomeMensagemInativacao) {
        this.nomeMensagemInativacao = nomeMensagemInativacao;
    }

    public AtributoPadrao getAtributoPadrao() {
        return atributoPadrao;
    }

    public void setAtributoPadrao(AtributoPadrao atributoPadrao) {
        this.atributoPadrao = atributoPadrao;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno_martins.efinancas.models;

import br.com.bruno_martins.erplibrary.AtributoPadrao;
import br.com.bruno_martins.erplibrary.EntidadeBase;
import br.com.bruno_martins.erplibrary.Utils;
import br.com.bruno_martins.padrao.rest.domains.DominioTipoPessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Bruno Martins
 */
@Entity
@Table(name = "pessoa")
public class Pessoa extends EntidadeBase<Serializable> {

    @Id
    @SequenceGenerator(name = "gen_pessoa", sequenceName = "sq_pessoa", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_pessoa")
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 120, nullable = false)
    private String nome;

    @Column(name = "nome_fantasia", length = 255)
    private String nomeFantasia;

    @Column(name = "documento_fiscal", length = 14, nullable = false, unique = true)
    private String documentoFiscal;

    @Column(name = "ie_rg", length = 12, unique = true)
    private String ieRg;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa", length = 11, nullable = false)
    private DominioTipoPessoa tipoPessoa;

    @Column(name = "email", length = 120)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa", cascade = CascadeType.ALL, targetEntity = Endereco.class, orphanRemoval = true)
    private List<Endereco> enderecos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa", cascade = CascadeType.ALL, targetEntity = Telefone.class, orphanRemoval = true)
    private List<Telefone> telefones;

    @Embedded
    private AtributoPadrao atributoPadrao;

    //*********************** implementations methods **************************
    @Override
    public Serializable getChavePrimaria() {

        return this.id;

    }

    public boolean isExistPrimaryKey() {

        return this != null && this.getChavePrimaria() != null;

    }

    //**************************** gets && sets ********************************
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getDocumentoFiscal() {
        return documentoFiscal;
    }

    public void setDocumentoFiscal(String documentoFiscal) {
        this.documentoFiscal = documentoFiscal;
    }

    public String getIeRg() {
        return ieRg;
    }

    public void setIeRg(String ieRg) {
        this.ieRg = ieRg;
    }

    public DominioTipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(DominioTipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Endereco> getEnderecos() {

        if (this.enderecos == null) {

            this.enderecos = new ArrayList<>();

        }

        return enderecos;
    }

    public Pessoa registrarEndereco(Endereco endereco) {

        endereco.setPessoa(this);

        this.getEnderecos().add(endereco);

        return this;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Telefone> getTelefones() {

        if (this.telefones == null) {

            this.telefones = new ArrayList<>();

        }

        return telefones;
    }

    public Pessoa registrarTelefone(Telefone telefone) {

        telefone.setPessoa(this);

        this.getTelefones().add(telefone);

        return this;

    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public AtributoPadrao getAtributoPadrao() {
        return atributoPadrao;
    }

    public void setAtributoPadrao(AtributoPadrao atributoPadrao) {
        this.atributoPadrao = atributoPadrao;
    }

    public String getDescricaoDocumento() {

        return Utils.formatarString(this.getDocumentoFiscal(), this.getTipoPessoa().getMascara());

    }

    public String getDescricaoCompleta() {

        return StringUtils.join(this.getDocumentoFiscal(), " - ", this.getNome());

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.syscontabil.models.fileProcessed;

import br.com.interagese.syscontabil.models.MensagemInativacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class Produto {

    private Long id;
    private Long clienteId;
    private String nmProduto;
    private String codigoProduto;
    private Long ean;
    private String ncm;
    private String cest;
    private String ncmPadrao;
    private String cestPadrao;
    private String ncmInformado;
    private String cestInformado;
    private ProdutoGeralJob produtoGeral;
    private List<ProdutoCenarioJob> listaProdutoCenario;
    private boolean ativo;
    private String log;
    private List<Long> mensagem;
    private AtributoPadrao atributoPadrao;
    private boolean isProdutoGeral;

    //******************************** get && setts ****************************
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
     * @return the nmProduto
     */
    public String getNmProduto() {
        if (getNcmPadrao() == null) {
            setNcmPadrao("");
        }
        return nmProduto;
    }

    /**
     * @param nmProduto the nmProduto to set
     */
    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    /**
     * @return the codigoProduto
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * @param codigoProduto the codigoProduto to set
     */
    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
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
        if (ncm == null) {
            ncm = "";
        }
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
        if (cest == null) {
            cest = "";
        }
        return cest;
    }

    /**
     * @param cest the cest to set
     */
    public void setCest(String cest) {
        this.cest = cest;
    }

    /**
     * @return the listaProdutoCenario
     */
    public List<ProdutoCenarioJob> getListaProdutoCenario() {
        if (listaProdutoCenario == null) {
            listaProdutoCenario = new ArrayList<>();
        }
        return listaProdutoCenario;
    }

    /**
     * @param listaProdutoCenario the listaProdutoCenario to set
     */
    public void setListaProdutoCenario(List<ProdutoCenarioJob> listaProdutoCenario) {
        this.listaProdutoCenario = listaProdutoCenario;
    }

    /**
     * @return the atributoPadrao
     */
    public AtributoPadrao getAtributoPadrao() {
        if (atributoPadrao == null) {
            atributoPadrao = new AtributoPadrao();
        }
        return atributoPadrao;
    }

    /**
     * @param atributoPadrao the atributoPadrao to set
     */
    public void setAtributoPadrao(AtributoPadrao atributoPadrao) {
        this.atributoPadrao = atributoPadrao;
    }

    /**
     * @return the clienteId
     */
    public Long getClienteId() {
        return clienteId;
    }

    /**
     * @param clienteId the clienteId to set
     */
    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    /**
     * @return the isProdutoGeral
     */
    public boolean isIsProdutoGeral() {
        return isProdutoGeral;
    }

    /**
     * @param isProdutoGeral the isProdutoGeral to set
     */
    public void setIsProdutoGeral(boolean isProdutoGeral) {
        this.isProdutoGeral = isProdutoGeral;
    }

    /**
     * @return the produtoGeral
     */
    public ProdutoGeralJob getProdutoGeral() {
        return produtoGeral;
    }

    /**
     * @param produtoGeral the produtoGeral to set
     */
    public void setProdutoGeral(ProdutoGeralJob produtoGeral) {
        this.produtoGeral = produtoGeral;
    }

    /**
     * @return the ncmPadrao
     */
    public String getNcmPadrao() {
        if (ncmPadrao == null) {
            ncmPadrao = "";
        }
        return ncmPadrao;
    }

    /**
     * @param ncmPadrao the ncmPadrao to set
     */
    public void setNcmPadrao(String ncmPadrao) {
        this.ncmPadrao = ncmPadrao;
    }

    /**
     * @return the cestPadrao
     */
    public String getCestPadrao() {
        if (cestPadrao == null) {
            cestPadrao = "";
        }
        return cestPadrao;
    }

    /**
     * @param cestPadrao the cestPadrao to set
     */
    public void setCestPadrao(String cestPadrao) {
        this.cestPadrao = cestPadrao;
    }

    /**
     * @return the ncmInformado
     */
    public String getNcmInformado() {
        return ncmInformado;
    }

    /**
     * @param ncmInformado the ncmInformado to set
     */
    public void setNcmInformado(String ncmInformado) {
        this.ncmInformado = ncmInformado;
    }

    /**
     * @return the cestInformado
     */
    public String getCestInformado() {
        return cestInformado;
    }

    /**
     * @param cestInformado the cestInformado to set
     */
    public void setCestInformado(String cestInformado) {
        this.cestInformado = cestInformado;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the log
     */
    public String getLog() {
        return log;
    }

    /**
     * @param log the log to set
     */
    public void setLog(String log) {
        this.log = log;
    }

    /**
     * @return the mensagem
     */
    public List<Long> getMensagem() {
        if (mensagem == null) {
            mensagem = new ArrayList<>();
        }
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(List<Long> mensagem) {
        this.mensagem = mensagem;
    }

}

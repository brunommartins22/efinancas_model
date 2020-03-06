/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.syscontabil.dto;

import java.math.BigInteger;

/**
 *
 * @author Bruno Martins
 */
public class ConsultaTributariaDto {

    private String nomeCenario;
    private String nomeProduto;
    private BigInteger ean;
    private String ncm;
    private String cest;
    private String cfop;
    private String cstIcmsSaidaPadrao;
    private String cstCofinsSaidaPadrao;
    private String cstPisSaidaPadrao;
    private String cstIpiSaidaPadrao;
    
    //****************************** get && setts ******************************

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigInteger getEan() {
        return ean;
    }

    public void setEan(BigInteger ean) {
        this.ean = ean;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getNomeCenario() {
        return nomeCenario;
    }

    public void setNomeCenario(String nomeCenario) {
        this.nomeCenario = nomeCenario;
    }

    public String getCstIcmsSaidaPadrao() {
        return cstIcmsSaidaPadrao;
    }

    public void setCstIcmsSaidaPadrao(String cstIcmsSaidaPadrao) {
        this.cstIcmsSaidaPadrao = cstIcmsSaidaPadrao;
    }

    public String getCstCofinsSaidaPadrao() {
        return cstCofinsSaidaPadrao;
    }

    public void setCstCofinsSaidaPadrao(String cstCofinsSaidaPadrao) {
        this.cstCofinsSaidaPadrao = cstCofinsSaidaPadrao;
    }

    public String getCstPisSaidaPadrao() {
        return cstPisSaidaPadrao;
    }

    public void setCstPisSaidaPadrao(String cstPisSaidaPadrao) {
        this.cstPisSaidaPadrao = cstPisSaidaPadrao;
    }

    public String getCstIpiSaidaPadrao() {
        return cstIpiSaidaPadrao;
    }

    public void setCstIpiSaidaPadrao(String cstIpiSaidaPadrao) {
        this.cstIpiSaidaPadrao = cstIpiSaidaPadrao;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }


}

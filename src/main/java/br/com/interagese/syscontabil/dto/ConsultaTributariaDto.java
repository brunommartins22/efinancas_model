/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.syscontabil.dto;

import br.com.interagese.syscontabil.models.ProdutoCliente;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class ConsultaTributariaDto {

    private BigInteger idCenario;
    private String nomeProduto;
    private Long ean;
    private String ncm;
    private String cest;

    //****************************** get && setts ******************************

    public BigInteger getIdCenario() {
        return idCenario;
    }

    public void setIdCenario(BigInteger idCenario) {
        this.idCenario = idCenario;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Long getEan() {
        return ean;
    }

    public void setEan(Long ean) {
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


}

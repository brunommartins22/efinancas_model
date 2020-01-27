/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.syscontabil.dto;

import br.com.interagese.syscontabil.models.MensagemInativacao;
import br.com.interagese.syscontabil.models.ProdutoCenario;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class MensagemInativacaoDto {
    
    private List<ProdutoCenario> produtos;
    private List<MensagemInativacao> mensagens;
    
    //********************** get && setts **************************************

    public List<ProdutoCenario> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoCenario> produtos) {
        this.produtos = produtos;
    }

    public List<MensagemInativacao> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<MensagemInativacao> mensagens) {
        this.mensagens = mensagens;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno_martins.efinancas.domains;

import br.com.bruno_martins.padrao.rest.util.DominioPadrao;

/**
 *
 * @author Bruno Martins
 */
public enum DominioTipoTelefone implements DominioPadrao {

    CELULAR("CELULAR"), FIXO("FIXO");

    private final String descricao;

    private DominioTipoTelefone(String descricao) {

        this.descricao = descricao;

    }

    @Override
    public String getDescricao() {

        return this.descricao;

    }

}

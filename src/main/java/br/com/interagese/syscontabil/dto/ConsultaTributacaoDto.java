/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.syscontabil.dto;

import br.com.interagese.syscontabil.models.ProdutoCliente;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class ConsultaTributacaoDto {

    private BigInteger clienteId;
    private String regime;
    private String cpfCnpj;
    private String nomeCliente;
    private BigInteger qtdRegistro;
    private List<ProdutoCliente> resultProdutoCliente;

    //****************************** get && setts ******************************
    

}

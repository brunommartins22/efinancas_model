package br.com.interagese.syscontabil.dto;

import br.com.interagese.syscontabil.domains.DominioEnvio;



public class StatusSincronizadorDto {

    private final boolean executando;
    private final DominioEnvio envio;
    private final String log;

    public StatusSincronizadorDto(boolean executando, DominioEnvio envio,String log) {
        this.executando = executando;
        this.envio = envio;
        this.log=log;
    }

    public boolean isExecutando() {
        return executando;
    }

    public DominioEnvio getEnvio() {
        return envio;
    }

    public String getLog() {
        return log;
    }

  
}

package com.monnet.autoapi.model;


public class ModoAgenteSecreto implements ModoUso {
    @Override
    public String usar() {
        return "Activando modo agente secreto.";
    }

    @Override
    public String activarCamuflaje() {
        return "Camuflaje activado para ocultarse.";
    }

    @Override
    public String usarArmas() {
        return "Usando armas preinstaladas.";
    }
}
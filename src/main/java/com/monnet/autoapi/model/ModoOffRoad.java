package com.monnet.autoapi.model;

public class ModoOffRoad implements ModoUso {
    @Override
    public String usar() {
        return "Usando el auto para hacer offroad.";
    }

    @Override
    public String activarLlantasAnchas() {
        return "Llantas anchas activadas para offroad.";
    }

    @Override
    public String activarDobleTraccion() {
        return "Doble tracción activada para offroad.";
    }
}
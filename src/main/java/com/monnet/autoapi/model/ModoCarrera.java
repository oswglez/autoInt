package com.monnet.autoapi.model;


public class ModoCarrera implements ModoUso {
    @Override
    public String usar() {
        return "Activando modo carrera.";
    }

    @Override
    public String activarLlantasCarrera()  {
        return "Llantas de carrera activadas.";
    }

    @Override
    public String activarInyeccionTurbo() {
        return "Usando turbo inyeccion.";
    }
}

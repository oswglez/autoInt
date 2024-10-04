package com.monnet.autoapi.service;

import com.monnet.autoapi.model.*;
import org.springframework.stereotype.Service;
import com.monnet.autoapi.model.ModoUso;

@Service
public class AutoService {

    public ModoUso obtenerModoPorDia(String dia) {
        switch (dia.toLowerCase()) {
            case "lunes":
                return new ModoTrabajo();
            case "martes":
                return new ModoCarrera();
            case "miercoles":
            case "jueves":
                return new ModoOffRoad();
            case "viernes":
                return new ModoAgenteSecreto();
            default:
                throw new IllegalArgumentException("Día no válido: " + dia);
        }
    }
}

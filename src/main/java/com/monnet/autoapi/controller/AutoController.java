package com.monnet.autoapi.controller;

import com.monnet.autoapi.model.ModoAgenteSecreto;
import com.monnet.autoapi.model.ModoCarrera;
import com.monnet.autoapi.model.ModoOffRoad;
import com.monnet.autoapi.model.ModoUso;
import com.monnet.autoapi.service.AutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

    private final AutoService autoService;

    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @GetMapping("/modo/{dia}")
    public ResponseEntity<String> obtenerModo(@PathVariable String dia) {try {
            ModoUso modo = autoService.obtenerModoPorDia(dia);
            String resultado = modo.usar();

            // Si es modo Offroad, también activamos llantas y doble tracción.
            if (modo instanceof ModoOffRoad) {
                resultado += "\n" + modo.activarLlantasAnchas();
                resultado += "\n" + modo.activarDobleTraccion();
            }

            // Si es modo Carrera, activamos llantas e Inyeccion turbo.
            if (modo instanceof ModoCarrera)  {
                resultado += "\n" + modo.activarLlantasCarrera();
                resultado += "\n" + modo.activarInyeccionTurbo();
            }

            // Si es modo Agente Secreto, activamos camuflaje y usamos armas (directamente).

            if (modo instanceof ModoAgenteSecreto) {
                resultado += "\n" + modo.activarCamuflaje();
                resultado += "\n" + modo.usarArmas();
            }

            return new ResponseEntity<>(resultado, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
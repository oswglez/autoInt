package com.monnet.autoapi.model;


    public interface ModoUso {
        String usar();

        // Métodos específicos para el modo offroad
        default String activarLlantasAnchas() {
            return "Llantas anchas activadas.";
        }

        default String activarDobleTraccion() {
            return "Doble tracción activada.";
        }
        // Métodos específicos para el modo carrera
        default String activarLlantasCarrera() {
            return "Llantas de carrera activadas.";
        }

        default String activarInyeccionTurbo() {
            return "Inyeccion  turbo activada.";
        }
        // Métodos específicos para el modo agente secreto
        default String activarCamuflaje() {
            return "Camuflaje activado.";
        }

        default String usarArmas() {
            return "No hay armas disponibles.";
        }
    }

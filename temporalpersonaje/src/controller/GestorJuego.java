package controller;

import java.util.ArrayList;
import java.util.List;

import model.Curable;
import model.Defendible;
import model.Hechizable;
import model.Movilizable;
import model.Personaje;
import model.Sigiloso;

public class GestorJuego {

    private final List<Personaje> personajes;

    public GestorJuego() {
        this.personajes = new ArrayList<>();
    }

    public void agregarPersonaje(Personaje p) {
        if (p != null) {
            personajes.add(p);
        }
    }

    public void listarPersonajes() {
        System.out.println("Listado de personajes:");
        for (Personaje p : personajes) {
            System.out.println(p.toString());
        }
    }

    public void simularTurno() {
        System.out.println("Simulación de turno de ataque:");
        for (Personaje atacante : personajes) {
            Personaje objetivo = obtenerSiguienteObjetivo(atacante);
            if (objetivo != null) {
                atacante.atacar(objetivo);
            }
        }
    }

    public void mostrarCapacidades() {
        System.out.println("Demostración de capacidades por interfaz:");
        for (Personaje p : personajes) {
            if (p instanceof Curable) {
                Curable curable = (Curable) p;
                curable.curar(p);
            }
            if (p instanceof Defendible) {
                Defendible defendible = (Defendible) p;
                defendible.defender();
            }
            if (p instanceof Movilizable) {
                Movilizable movilizable = (Movilizable) p;
                movilizable.moverse();
            }
            if (p instanceof Sigiloso) {
                Sigiloso sigiloso = (Sigiloso) p;
                sigiloso.ocultar();
            }
            if (p instanceof Hechizable) {
                Hechizable hechizable = (Hechizable) p;
                hechizable.lanzarHechizo(p);
            }
        }
    }

    private Personaje obtenerSiguienteObjetivo(Personaje atacante) {
        if (personajes.size() < 2) {
            return null;
        }
        int indiceAtacante = personajes.indexOf(atacante);
        int indiceObjetivo = (indiceAtacante + 1) % personajes.size();
        return personajes.get(indiceObjetivo);
    }
}


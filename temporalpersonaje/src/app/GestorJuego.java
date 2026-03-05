package app;

import java.util.ArrayList;
import java.util.List;

import Personaje.Personaje;

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
            // Por simplicidad, cada personaje ataca al siguiente en la lista
            Personaje objetivo = obtenerSiguienteObjetivo(atacante);
            if (objetivo != null) {
                atacante.atacar(objetivo);
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


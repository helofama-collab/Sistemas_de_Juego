package app;

import Personaje.Fisico.Clases.Cazador;
import Personaje.Fisico.Clases.Guerrero;
import Personaje.Fisico.Clases.Ladron;
import Personaje.Fisico.Clases.Tanque;
import Personaje.Magico.Clases.Clerigo;
import Personaje.Magico.Clases.Hechizero;
import Personaje.Magico.Clases.Mago;
import Personaje.Magico.Clases.Nigromante;

public class App {
    public static void main(String[] args) {
        GestorJuego gestor = new GestorJuego();

        Guerrero guerrero = new Guerrero("Guerrero", 5, 20, 15, 10, 0.2);
        Tanque tanque = new Tanque("Tanque", 4, 15, 20, 25, 0.1);
        Cazador cazador = new Cazador("Cazador", 3, 18, 18, 8, 0.3);
        Ladron ladron = new Ladron("Ladron", 3, 17, 19, 7, 0.35);

        Mago mago = new Mago("Mago", 5, 30, 10, 5, 25);
        Hechizero hechizero = new Hechizero("Hechizero", 4, 28, 9, 6, 22);
        Clerigo clerigo = new Clerigo("Clerigo", 3, 25, 12, 7, 20);
        Nigromante nigromante = new Nigromante("Nigromante", 4, 27, 11, 6, 23);

        gestor.agregarPersonaje(guerrero);
        gestor.agregarPersonaje(tanque);
        gestor.agregarPersonaje(cazador);
        gestor.agregarPersonaje(ladron);
        gestor.agregarPersonaje(mago);
        gestor.agregarPersonaje(hechizero);
        gestor.agregarPersonaje(clerigo);
        gestor.agregarPersonaje(nigromante);

        gestor.listarPersonajes();
        gestor.simularTurno();
    }
}

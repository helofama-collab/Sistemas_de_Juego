package app;

import controller.GestorJuego;
import model.fisico.clases.*;
import model.magico.clases.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("     DEMO DEL SISTEMA DE PERSONAJES    ");
        System.out.println("=======================================\n");

        GestorJuego gestor = new GestorJuego();

        Guerrero guerrero = new Guerrero("Guerrero", 5, 20, 15, 10, 0.2, 80, 70);
        Tanque tanque = new Tanque("Tanque", 4, 15, 20, 25, 0.1, 90, 60);
        Cazador cazador = new Cazador("Cazador", 3, 18, 18, 8, 0.3, 85, 30);
        Ladron ladron = new Ladron("Ladrón", 3, 17, 19, 7, 0.35, 75, 80);

        Mago mago = new Mago("Mago", 5, 30, 10, 5, 25, 90, 80);
        Hechizero hechizero = new Hechizero("Hechicero", 4, 28, 9, 6, 22, 85, 70);
        Clerigo clerigo = new Clerigo("Clérigo", 3, 25, 12, 7, 20, 95, 90);
        Nigromante nigromante = new Nigromante("Nigromante", 4, 27, 11, 6, 23, 88, 85);

        gestor.agregarPersonaje(guerrero);
        gestor.agregarPersonaje(tanque);
        gestor.agregarPersonaje(cazador);
        gestor.agregarPersonaje(ladron);
        gestor.agregarPersonaje(mago);
        gestor.agregarPersonaje(hechizero);
        gestor.agregarPersonaje(clerigo);
        gestor.agregarPersonaje(nigromante);

        System.out.println("=== 1) LISTADO DE PERSONAJES (toString) ===");
        gestor.listarPersonajes();
        System.out.println();

        System.out.println("=== 2) SIMULACIÓN DE TURNO (ataques polimórficos) ===");
        gestor.simularTurno();
        System.out.println();

        System.out.println("=== 3) DEMOSTRACIÓN DE CAPACIDADES (interfaces + instanceof) ===");
        gestor.mostrarCapacidades();
        System.out.println();

        System.out.println("=== 4) ACCIONES ESPECIALES DE ALGUNOS PERSONAJES ===");
        guerrero.gritoDeGuerra();
        tanque.provocar(guerrero);
        cazador.colocarTrampa(ladron);
        ladron.robarOro(cazador);
        mago.teletransportarse();
        hechizero.canalizarMana();
        clerigo.bendecirAliado(guerrero);
        nigromante.levantarMuerto();

        System.out.println("\n=== FIN DE LA DEMO ===");
    }
}

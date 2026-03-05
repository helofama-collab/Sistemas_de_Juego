package Personaje.Fisico.Clases;

import Personaje.Fisico.PersonajeFisico;
import Personaje.Movilizable;
import Personaje.Personaje;
import Personaje.Sigiloso;

public class Cazador extends PersonajeFisico implements Movilizable, Sigiloso{
    
    public Cazador(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico){
    super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }

    public void colocarTrampa(Personaje objetivo){
    System.out.println(getnombre() + " coloca una trampa para atrapar a " + objetivo.getnombre());
    }

    @Override
    public void moverse() {
        System.out.println(getnombre() + " se mueve rápidamente.");
    }

    @Override
    public void ocultar() {
        System.out.println(getnombre() + " se oculta en la sombra.");
    }
}
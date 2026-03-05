package Personaje.Fisico.Clases;

import Personaje.Fisico.PersonajeFisico;
import Personaje.Movilizable;
import Personaje.Personaje;
import Personaje.Sigiloso;

public class Ladron extends PersonajeFisico implements Sigiloso, Movilizable{
    
    public Ladron(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico){
    super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }

    public void robarOro(Personaje objetivo){
    System.out.println(getnombre() + " roba oro a " + objetivo.getnombre());
    }

    @Override
    public void ocultar() {
        System.out.println(getnombre() + " se oculta en la sombra.");
    }

    @Override
    public void moverse() {
        System.out.println(getnombre() + " se mueve rápidamente.");
    }
}

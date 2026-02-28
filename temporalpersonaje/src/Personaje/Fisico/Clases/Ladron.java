package Personaje.Fisico.Clases;

import Personaje.Personaje;
import Personaje.Fisico.PersonajeFisico;

public class Ladron extends PersonajeFisico{
    
    public Ladron(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico){
    super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }
}

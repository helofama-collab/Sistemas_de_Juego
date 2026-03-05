package Personaje.Fisico.Clases;

import Personaje.Fisico.PersonajeFisico;
import Personaje.Personaje;

public class Cazador extends PersonajeFisico{
    
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
}
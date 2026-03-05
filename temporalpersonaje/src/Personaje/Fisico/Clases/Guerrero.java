package Personaje.Fisico.Clases;

import Personaje.Fisico.PersonajeFisico;
import Personaje.Personaje;

public class Guerrero extends PersonajeFisico{
    
    public Guerrero(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico){
    super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }

    public void gritoDeGuerra(){
    System.out.println(getnombre() + " lanza un grito de guerra que aumenta su fuerza.");
}
}

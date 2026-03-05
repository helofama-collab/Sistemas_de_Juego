package Personaje.Fisico.Clases;

import Personaje.Defendible;
import Personaje.Fisico.PersonajeFisico;
import Personaje.Personaje;

public class Tanque extends PersonajeFisico implements Defendible{
    
    public Tanque(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico){
    super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }

    public void provocar(Personaje objetivo){
    System.out.println(getnombre() + " provoca a " + objetivo.getnombre() + " para que lo ataque.");
    }

    @Override
    public void defender() {
        System.out.println(getnombre() + " se defiende con su escudo.");
    }
}
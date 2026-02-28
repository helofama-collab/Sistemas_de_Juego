package Personaje.Magico.Clases;

import Personaje.Personaje;
import Personaje.Magico.PersonajeMagico;

public class Hechizero extends PersonajeMagico{
    
    public Hechizero(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria){
    super(nombre,nivel, mana, resistenciamagica, regeneracionmana, sabiduria);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }
}
package Personaje.Magico.Clases;

import Personaje.Curable;
import Personaje.Magico.PersonajeMagico;
import Personaje.Personaje;

public class Clerigo extends PersonajeMagico implements Curable{
    
    public Clerigo(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria){
    super(nombre,nivel, mana, resistenciamagica, regeneracionmana, sabiduria);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }

    public void bendecirAliado(Personaje objetivo){
    System.out.println(getnombre() + " bendice a " + objetivo.getnombre());
    }

    @Override
    public void curar(Personaje objetivo) {
        System.out.println(getnombre() + " cura a " + objetivo.getnombre());
    }
    
}
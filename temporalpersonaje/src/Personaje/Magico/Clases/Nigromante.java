package Personaje.Magico.Clases;


import Personaje.Curable;
import Personaje.Hechizable;
import Personaje.Magico.PersonajeMagico;
import Personaje.Personaje;

public class Nigromante extends PersonajeMagico implements Hechizable, Curable{
    
    public Nigromante(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria){
    super(nombre,nivel, mana, resistenciamagica, regeneracionmana, sabiduria);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }

    public void levantarMuerto(){
    System.out.println(getnombre() + " levanta un muerto para luchar a su lado.");
    }
    
    @Override
    public void lanzarHechizo(Personaje objetivo) {
        System.out.println(getnombre() + " lanza un hechizo contra " + objetivo.getnombre());
    }  

    @Override
    public void curar(Personaje objetivo) {
        System.out.println(getnombre() + " se cura a sí mismo utilizando su propia energía vital.");
    }
}
package Personaje.Magico.Clases;

import Personaje.Hechizable;
import Personaje.Magico.PersonajeMagico;
import Personaje.Personaje;

public class Hechizero extends PersonajeMagico implements Hechizable {
    
    public Hechizero(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria){
    super(nombre,nivel, mana, resistenciamagica, regeneracionmana, sabiduria);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(this.getnombre() + " ataca con fuerza.");
    }

    public void canalizarMana(){
    System.out.println(getnombre() + " canaliza mana para recuperar poder mágico.");
    }

    @Override
    public void lanzarHechizo(Personaje objetivo) {
        System.out.println(getnombre() + " lanza un hechizo contra " + objetivo.getnombre());
    }
}
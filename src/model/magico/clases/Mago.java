package model.magico.clases;

import model.Hechizable;
import model.Personaje;
import model.magico.PersonajeMagico;

public class Mago extends PersonajeMagico implements Hechizable {

    private int potenciaHechizo;
    private int conocimientoRunas;
    
    public Mago(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria,
                int potenciaHechizo, int conocimientoRunas){
        super(nombre,nivel, mana, resistenciamagica, regeneracionmana, sabiduria);
        this.potenciaHechizo = potenciaHechizo;
        this.conocimientoRunas = conocimientoRunas;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getnombre() + " lanza una bola de fuego contra " + objetivo.getnombre() + ".");
    }

    public void teletransportarse(){
    System.out.println(getnombre() + " se teletransporta a otra posición.");
    }  

    @Override
    public void lanzarHechizo(Personaje objetivo) {
        System.out.println(getnombre() + " lanza un hechizo contra " + objetivo.getnombre());
    }

    @Override
    protected String getDetallesMagicoPropios() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos propios de Mago ----\n");
        sb.append("Potencia de hechizo : ").append(potenciaHechizo).append("\n");
        sb.append("Conocimiento de runas: ").append(conocimientoRunas).append("\n");
        return sb.toString();
    }
}
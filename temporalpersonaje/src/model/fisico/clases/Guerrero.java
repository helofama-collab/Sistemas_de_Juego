package model.fisico.clases;

import model.Defendible;
import model.Personaje;

public class Guerrero extends PersonajeFisico implements Defendible{

    private int dominioEspada;
    private int coraje;
    
    public Guerrero(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico,
                    int dominioEspada, int coraje){
        super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);
        this.dominioEspada = dominioEspada;
        this.coraje = coraje;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getnombre() + " lanza un poderoso golpe de espada contra " + objetivo.getnombre() + ".");
    }

    public void gritoDeGuerra(){
    System.out.println(getnombre() + " lanza un grito de guerra que aumenta su fuerza.");
    }

    @Override
    public void defender() {
        System.out.println(getnombre() + " se defiende con su escudo.");
    }

    @Override
    protected String getDetallesFisicoPropios() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos propios de Guerrero ----\n");
        sb.append("Dominio de espada : ").append(dominioEspada).append("\n");
        sb.append("Coraje            : ").append(coraje).append("\n");
        return sb.toString();
    }
}

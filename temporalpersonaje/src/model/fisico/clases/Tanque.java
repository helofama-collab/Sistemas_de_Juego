package model.fisico.clases;

import model.Defendible;
import model.Personaje;

public class Tanque extends PersonajeFisico implements Defendible{

    private int resistenciaExtra;
    private int nivelAmenaza;
    
    public Tanque(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico,
                  int resistenciaExtra, int nivelAmenaza){
        super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);
        this.resistenciaExtra = resistenciaExtra;
        this.nivelAmenaza = nivelAmenaza;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getnombre() + " embiste y golpea brutalmente a " + objetivo.getnombre() + ".");
    }

    public void provocar(Personaje objetivo){
    System.out.println(getnombre() + " provoca a " + objetivo.getnombre() + " para que lo ataque.");
    }

    @Override
    public void defender() {
        System.out.println(getnombre() + " se defiende con su escudo.");
    }

    @Override
    protected String getDetallesFisicoPropios() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos propios de Tanque ----\n");
        sb.append("Resistencia extra : ").append(resistenciaExtra).append("\n");
        sb.append("Nivel de amenaza  : ").append(nivelAmenaza).append("\n");
        return sb.toString();
    }
}
package model.fisico.clases;

import model.Movilizable;
import model.Personaje;
import model.Sigiloso;
import model.fisico.PersonajeFisico;

public class Ladron extends PersonajeFisico implements Sigiloso, Movilizable{

    private int habilidadRobo;
    private int nivelEscapismo;
    
    public Ladron(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico,
                  int habilidadRobo, int nivelEscapismo){
        super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);
        this.habilidadRobo = habilidadRobo;
        this.nivelEscapismo = nivelEscapismo;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getnombre() + " apuñala por la espalda a " + objetivo.getnombre() + ".");
    }

    public void robarOro(Personaje objetivo){
    System.out.println(getnombre() + " roba oro a " + objetivo.getnombre());
    }

    @Override
    public void ocultar() {
        System.out.println(getnombre() + " se oculta en la sombra.");
    }

    @Override
    public void moverse() {
        System.out.println(getnombre() + " se mueve rápidamente.");
    }

    @Override
    protected String getDetallesFisicoPropios() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos propios de Ladron ----\n");
        sb.append("Habilidad de robo : ").append(habilidadRobo).append("\n");
        sb.append("Nivel de escapismo: ").append(nivelEscapismo).append("\n");
        return sb.toString();
    }
}

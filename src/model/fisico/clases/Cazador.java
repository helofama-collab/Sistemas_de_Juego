package model.fisico.clases;

import model.*;

import model.fisico.PersonajeFisico;

public class Cazador extends PersonajeFisico implements Movilizable, Sigiloso{

    private int precisionDisparo;
    private int numeroFlechas;
    
    public Cazador(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico,
                   int precisionDisparo, int numeroFlechas){
        super(nombre,nivel,fuerza,estamina,defensa,probabilidadCritico);
        this.precisionDisparo = precisionDisparo;
        this.numeroFlechas = numeroFlechas;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getnombre() + " dispara una flecha precisa hacia " + objetivo.getnombre() + ".");
    }

    public void colocarTrampa(Personaje objetivo){
    System.out.println(getnombre() + " coloca una trampa para atrapar a " + objetivo.getnombre());
    }

    @Override
    public void moverse() {
        System.out.println(getnombre() + " se mueve rápidamente.");
    }

    @Override
    public void ocultar() {
        System.out.println(getnombre() + " se oculta en la sombra.");
    }

    @Override
    protected String getDetallesFisicoPropios() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos propios de Cazador ----\n");
        sb.append("Precisión disparo : ").append(precisionDisparo).append("\n");
        sb.append("Número de flechas : ").append(numeroFlechas).append("\n");
        return sb.toString();
    }
}
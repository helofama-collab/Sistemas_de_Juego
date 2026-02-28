package Personaje.Fisico;

import Personaje.Personaje;

public abstract class PersonajeFisico extends Personaje{
    protected int fuerza;
    protected int estamina;
    protected int defensa;
    protected double probabilidadCritico;
    public PersonajeFisico(String nombre, int nivel, int fuerza,int estamina, int defensa, double probabilidadCritico){
        super(nombre,nivel);
        this.fuerza = fuerza;
        this.estamina = estamina;
        this.defensa = defensa;
        this.probabilidadCritico = probabilidadCritico;
    }

    public int getfuerza(){
        return fuerza;
    }

    public int getestamina(){
        return estamina;
    }
    public int getdefensa(){
        return defensa;
    }
    public double getprobabilidadCritico(){
        return probabilidadCritico;
    }
    

}

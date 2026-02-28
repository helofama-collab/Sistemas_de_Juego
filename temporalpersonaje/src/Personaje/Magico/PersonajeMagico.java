package Personaje.Magico;

import Personaje.Personaje;

public abstract class PersonajeMagico extends Personaje{
    protected int mana;
    protected int resistenciamagica;
    protected int regeneracionmana;
    protected int sabiduria;
    
    public PersonajeMagico(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria){
        super(nombre,nivel);
        this.mana = mana;
        this.resistenciamagica = resistenciamagica;
        this.regeneracionmana = regeneracionmana;
        this.sabiduria = sabiduria;
    }
    
    public int getmana(){
        return mana;
    }

    public int getresistenciamagica(){
        return resistenciamagica;
    }

    public int getregeneracionmana(){
        return regeneracionmana;
    }

    public int getsabiduria(){
        return sabiduria;
    }
}
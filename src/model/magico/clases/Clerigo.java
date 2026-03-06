package model.magico.clases;

import model.Curable;
import model.Personaje;
import model.magico.PersonajeMagico;

public class Clerigo extends PersonajeMagico implements Curable{

    private int fe;
    private int poderCurativo;
    
    public Clerigo(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria,
                   int fe, int poderCurativo){
        super(nombre,nivel, mana, resistenciamagica, regeneracionmana, sabiduria);
        this.fe = fe;
        this.poderCurativo = poderCurativo;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getnombre() + " golpea a " + objetivo.getnombre() + " con su maza sagrada.");
    }

    public void bendecirAliado(Personaje objetivo){
    System.out.println(getnombre() + " bendice a " + objetivo.getnombre());
    }

    @Override
    public void curar(Personaje objetivo) {
        System.out.println(getnombre() + " cura a " + objetivo.getnombre());
    }

    @Override
    protected String getDetallesMagicoPropios() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos propios de Clerigo ----\n");
        sb.append("Fe             : ").append(fe).append("\n");
        sb.append("Poder curativo : ").append(poderCurativo).append("\n");
        return sb.toString();
    }
}
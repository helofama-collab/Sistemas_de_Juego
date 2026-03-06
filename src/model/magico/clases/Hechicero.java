package model.magico.clases;

import model.Hechizable;
import model.Personaje;
import model.magico.PersonajeMagico;

public class Hechicero extends PersonajeMagico implements Hechizable {

    private int controlCaos;
    private int corrupcion;

    public Hechicero(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria,
            int controlCaos, int corrupcion) {
        super(nombre, nivel, mana, resistenciamagica, regeneracionmana, sabiduria);
        this.controlCaos = controlCaos;
        this.corrupcion = corrupcion;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getnombre() + " desata un hechizo oscuro sobre " + objetivo.getnombre() + ".");
    }

    public void canalizarMana() {
        System.out.println(getnombre() + " canaliza mana para recuperar poder mágico.");
    }

    @Override
    public void lanzarHechizo(Personaje objetivo) {
        System.out.println(getnombre() + " lanza un hechizo contra " + objetivo.getnombre());
    }

    @Override
    protected String getDetallesMagicoPropios() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos propios de Hechicero ----\n");
        sb.append("Control del caos : ").append(controlCaos).append("\n");
        sb.append("Corrupción       : ").append(corrupcion).append("\n");
        return sb.toString();
    }
}
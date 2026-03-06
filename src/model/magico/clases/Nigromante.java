package model.magico.clases;


import model.Curable;
import model.Hechizable;
import model.Personaje;
import model.magico.PersonajeMagico;

public class Nigromante extends PersonajeMagico implements Hechizable, Curable{

    private int controlNoMuertos;
    private int oscuridadInterior;
    
    public Nigromante(String nombre, int nivel, int mana, int resistenciamagica, int regeneracionmana, int sabiduria,
                      int controlNoMuertos, int oscuridadInterior){
        super(nombre,nivel, mana, resistenciamagica, regeneracionmana, sabiduria);
        this.controlNoMuertos = controlNoMuertos;
        this.oscuridadInterior = oscuridadInterior;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getnombre() + " canaliza energía oscura contra " + objetivo.getnombre() + ".");
    }

    public void levantarMuerto(){
    System.out.println(getnombre() + " levanta un muerto para luchar a su lado.");
    }
    
    @Override
    public void lanzarHechizo(Personaje objetivo) {
        System.out.println(getnombre() + " lanza un hechizo contra " + objetivo.getnombre());
    }  

    @Override
    public void curar(Personaje objetivo) {
        System.out.println(getnombre() + " se cura a sí mismo utilizando su propia energía vital.");
    }

    @Override
    protected String getDetallesMagicoPropios() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos propios de Nigromante ----\n");
        sb.append("Control de no muertos : ").append(controlNoMuertos).append("\n");
        sb.append("Oscuridad interior    : ").append(oscuridadInterior).append("\n");
        return sb.toString();
    }
}
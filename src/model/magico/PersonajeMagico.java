package model.magico;

import model.Personaje;

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

    public void concentrarse() {
        System.out.println(getnombre() + " se concentra para regenerar su energía mágica.");
    }

    @Override
    protected String getDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos mágicos comunes ----\n");
        sb.append("Maná               : ").append(mana).append("\n");
        sb.append("Resistencia mágica : ").append(resistenciamagica).append("\n");
        sb.append("Regeneración maná  : ").append(regeneracionmana).append("\n");
        sb.append("Sabiduría          : ").append(sabiduria).append("\n");

        String propios = getDetallesMagicoPropios();
        if (propios != null && !propios.isEmpty()) {
            sb.append(propios);
        }
        return sb.toString();
    }

    // Punto de extensión para las subclases mágicas
    protected String getDetallesMagicoPropios() {
        return "";
    }
}
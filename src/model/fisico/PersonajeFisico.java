package model.fisico;

import model.Personaje;

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

    public void cargarAtaque() {
        System.out.println(getnombre() + " prepara un poderoso ataque físico.");
    }

    @Override
    protected String getDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- Atributos físicos comunes ----\n");
        sb.append("Fuerza   : ").append(fuerza).append("\n");
        sb.append("Estamina : ").append(estamina).append("\n");
        sb.append("Defensa  : ").append(defensa).append("\n");
        sb.append("Crítico  : ").append(probabilidadCritico).append("\n");

        String propios = getDetallesFisicoPropios();
        if (propios != null && !propios.isEmpty()) {
            sb.append(propios);
        }
        return sb.toString();
    }

    // Punto de extensión para las subclases físicas
    protected String getDetallesFisicoPropios() {
        return "";
    }

}

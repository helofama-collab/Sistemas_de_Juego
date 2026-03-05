package Personaje;
import java.util.UUID;

public abstract class Personaje {
    private final UUID identificadorunico;
    private String nombre;
    private int nivel;
    private int salud;
    


    public Personaje(String nombre, int nivel){
        this.identificadorunico = UUID.randomUUID();
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = 100;
    }

    public Personaje(UUID idcargado, String nombre, int nivel, int salud){
        this.identificadorunico = idcargado;
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        
    }

    public UUID getidentificadorunico(){
        return identificadorunico;
    }

    public String getnombre(){
        return nombre;
    }

    public int getnivel(){
        return nivel;
    }

    public int getsalud(){
        return salud;
    }

    

    @Override
    public String toString() {
        return "Personaje{nombre='" + nombre + "', id=" + identificadorunico + "}";
    }

    @Override
    public int hashCode() {
        return identificadorunico.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() !=obj.getClass()) return false;
        Personaje quecompone = (Personaje) obj;
        return identificadorunico.equals(quecompone.identificadorunico);
    }
    
    public abstract void atacar(Personaje objetivo);
}


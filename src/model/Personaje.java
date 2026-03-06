package model;
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
        StringBuilder sb = new StringBuilder();
        sb.append("============= FICHA DE PERSONAJE =============\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Nivel : ").append(nivel).append("\n");
        sb.append("Salud : ").append(salud).append("\n");

        String detalles = getDetalles();
        if (detalles != null && !detalles.isEmpty()) {
            sb.append(detalles);
        }

        sb.append("ID    : ").append(identificadorunico).append("\n");
        sb.append("=============================================\n");
        return sb.toString();
    }

    // Método de plantilla para que las subclases añadan sus datos sin romper el diseño
    protected String getDetalles() {
        return "";
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


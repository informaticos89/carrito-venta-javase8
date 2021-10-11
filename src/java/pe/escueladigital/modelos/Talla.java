package pe.escueladigital.modelos;

public class Talla {
    private short id;
    private String abreviatura;
    private String nombre;

    public Talla() {
    }

    public Talla(short id, String abreviatura, String nombre) {
        this.id = id;
        this.abreviatura = abreviatura;
        this.nombre = nombre;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

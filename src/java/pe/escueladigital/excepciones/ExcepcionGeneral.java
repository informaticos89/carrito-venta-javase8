package pe.escueladigital.excepciones;

public class ExcepcionGeneral extends RuntimeException {
    
    public ExcepcionGeneral() {
        this("Excepcion General no especificada");
    }
    
    public ExcepcionGeneral(String msg) {
        super(msg);
    }
}

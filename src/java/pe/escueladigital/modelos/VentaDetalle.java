package pe.escueladigital.modelos;

public class VentaDetalle {
    private int id;
    private int idEncabezado;
    private Producto producto;
    private Talla talla;

    public VentaDetalle() {
    }

    public VentaDetalle(int id, int idEncabezado, Producto producto, Talla talla) {
        this.id = id;
        this.idEncabezado = idEncabezado;
        this.producto = producto;
        this.talla = talla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEncabezado() {
        return idEncabezado;
    }

    public void setIdEncabezado(int idEncabezado) {
        this.idEncabezado = idEncabezado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

}

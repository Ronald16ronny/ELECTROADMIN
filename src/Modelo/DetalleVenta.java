package Modelo;

public class DetalleVenta {

    private int idDetealleventa;
    private int idCabeceraventa;
    private int idProducto;
    //este de mas
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private double descuento;
    private double igv;
    private double totalapagar;
    private int estado;

    public DetalleVenta() {
        this.idDetealleventa = 0;
        this.idCabeceraventa = 0;
        this.idProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precioUnitario = 0.0;
        this.subtotal = 0.0;
        this.descuento = 0.0;
        this.igv = 0.0;
        this.totalapagar = 0.0;
        this.estado = 0;
    }

    public DetalleVenta(int idDetealleventa, int idCabeceraventa, int idProducto, String nombre, int cantidad, double precioUnitario, double subtotal, double descuento, double igv, double totalapagar, int estado) {
        this.idDetealleventa = idDetealleventa;
        this.idCabeceraventa = idCabeceraventa;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.igv = igv;
        this.totalapagar = totalapagar;
        this.estado = estado;
    }

    public int getIdDetealleventa() {
        return idDetealleventa;
    }

    public void setIdDetealleventa(int idDetealleventa) {
        this.idDetealleventa = idDetealleventa;
    }

    public int getIdCabeceraventa() {
        return idCabeceraventa;
    }

    public void setIdCabeceraventa(int idCabeceraventa) {
        this.idCabeceraventa = idCabeceraventa;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotalapagar() {
        return totalapagar;
    }

    public void setTotalapagar(double totalapagar) {
        this.totalapagar = totalapagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetealleventa=" + idDetealleventa + ", idCabeceraventa=" + idCabeceraventa + ", idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + ", descuento=" + descuento + ", igv=" + igv + ", totalapagar=" + totalapagar + ", estado=" + estado + '}';
    }

}

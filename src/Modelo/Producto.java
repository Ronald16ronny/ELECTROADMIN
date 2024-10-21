/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private int idProducto;
    private String Nombre;
    private int Cantidad;
    private double Precio;
    private String Descripcion;
    private int  PorsentajeIVA;
    private int idCategoria;
    private int estado;
    
//Constructor
    public Producto() {
        this.idProducto =0;
        this.Nombre="";
        this.Cantidad=0;
        this.Precio=0.0;
        this.Descripcion="";
        this.idCategoria=0;
        this.estado = 0;
    
    }
// constructor sobrecargado
    public Producto(int idProducto, String Nombre, int Cantidad, double Precio, String Descripcion, int PorsentajeIVA, int idCategoria, int estado) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.PorsentajeIVA = PorsentajeIVA;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }
    
    //metodos set and get

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPorsentajeIVA() {
        return PorsentajeIVA;
    }

    public void setPorsentajeIVA(int PorsentajeIVA) {
        this.PorsentajeIVA = PorsentajeIVA;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
    
}

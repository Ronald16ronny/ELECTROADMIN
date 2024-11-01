
package Modelo;

public class Cliente {
    //Atrivutos
    
    private int idCliente;
    private String Nombre;
    private String Apellido;
    private String Dni;
    private String Telefono;
    private String Direccion;
    private int estado;

    public Cliente() {
        this.idCliente = 0;
        this.Nombre = "";
        this.Apellido = "";
        this.Dni ="" ;
        this.Telefono ="" ;
        this.Direccion = "";
        this.estado = 0;
    }

    public Cliente(int idCliente, String Nombre, String Apellido, String Dni, String Telefono, String Direccion, int estado) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
}


package Controlador;

import Modelo.CabeceraVenta;
import Modelo.DetalleVenta;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ctr_ReguistrarVenta {
    //ultimo id de cabecera
    
    public static  int idCAbeceraReguistrada;
    java.math.BigDecimal iDColvar;
    
    
    
      /**
     *********************************************
     * METODO PARA GUARDAR La CAbecera de Venta 
     ******************************************
     *
     */
    public boolean guardar(CabeceraVenta obj) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_cabecera_venta values (?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            consulta.setInt(1, 0);//id
            consulta.setInt(2, obj.getIdCliente());
            consulta.setDouble(3, obj.getValorPagar());
            consulta.setString(4, obj.getFechaVenta());
            consulta.setInt(5, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            ResultSet rs= consulta.getGeneratedKeys();
            while (rs.next()){
                iDColvar = rs.getBigDecimal(1);
                idCAbeceraReguistrada = iDColvar.intValue();
            }
            
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cabecera de venta: -- " + e);
        }
        return respuesta;
    }
    
     /**
     *********************************************
     * METODO PARA GUARDAR EL DETALLE DE VENTA 
     ******************************************
     *
     */
    public boolean guardarDetalle(DetalleVenta obj) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_detalle_venta values (?, ?, ?, ?, ?, ?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, idCAbeceraReguistrada);
            consulta.setInt(3, obj.getIdProducto());
            consulta.setInt(4, obj.getCantidad());
            consulta.setDouble(5, obj.getPrecioUnitario());
            consulta.setDouble(6, obj.getSubtotal());
            consulta.setDouble(7, obj.getDescuento());
            consulta.setDouble(8, obj.getIgv());
            consulta.setDouble(9, obj.getTotalapagar());
            consulta.setInt(10, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cabecera de venta: -- " + e);
        }
        return respuesta;
    }
    
}

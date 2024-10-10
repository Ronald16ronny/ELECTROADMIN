/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Producto;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Crt_Producto {
    
    public boolean Guardar (Producto objeto){
        
        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_Producto values(?,?,?,?,?,?,?,?)"); 
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getPorsentajeIVA());
            consulta.setInt(8, objeto.getEstado());
            
            if (consulta.executeUpdate() > 0 ){
                respuesta = true;

            }
            
            cn.close();
            
            
        } catch (SQLException e) {
            System.out.println("Error al guardar producto " + e);
        }
        return respuesta;   
 
    }
    
       
       public boolean existeProducto(String Producto) {
           boolean respuesta = false;
           String sql= "select Nombre from tb_producto where nombre = "+ Producto + "';";
           Statement st;
           
           try {
               
               Connection cn = Conexion.conexcion.conectar();
               st = cn.createStatement();
               ResultSet rs = st.executeQuery(sql);
               while (rs.next()) {
                   respuesta = true;
               }
           } catch (SQLException e) {
               System.out.println("Error al consultar Producto" + e);
           }
           return respuesta;
           
       }
      

}

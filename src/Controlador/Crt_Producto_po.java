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

public class Crt_Producto_po {

    /**
     *********************************************
     * METODO PARA GUARDAR UNA NUEVO PRODUCTO
     * *******************************************
     *
     */
    public boolean Guardar(Producto objeto) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_producto values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getPorsentajeIVA());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto " + e);
        }
        return respuesta;

    }

    /**
     *************************************************
     * METODO PARA CONSULTA SI EL PRODUCTO YA EXISTE
     * ***********************************************
     *
     */
    public boolean existeProducto(String Producto) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_producto where descripcion = '" + Producto + "';";
        Statement st;

        try {

            Connection cn = Conexion.conexcion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar Producto [exis]" + e);
        }
        return respuesta;

    }

    /**
     ************************************
     * METODO PARA ACTUALIZAR UN PODUCTO *********************************
     *
     */
    public boolean actualizar(Producto obj, int idProducto) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_producto set nombre=?, cantidad=?, precio=?, descripcion=?, porcentajeIgv=?, idCategoria=?, estado=? where idProducto = '" + idProducto + "'");
            consulta.setString(1, obj.getNombre());
            consulta.setInt(2, obj.getCantidad());
            consulta.setDouble(3, obj.getPrecio());
            consulta.setString(4, obj.getDescripcion());
            consulta.setInt(5, obj.getPorsentajeIVA());
            consulta.setInt(6, obj.getIdCategoria());
            consulta.setInt(7, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actuaizar producto [ac]" + e);
        }
        return respuesta;
    }

    /**
     ************************************
     * METODO PARA ELIMINAR PRODUCTO *********************************
     *
     */
    public boolean eliminar(int idProducto) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from tb_producto where idProducto = '" + idProducto + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto" + e);
        }
        return respuesta;
    }

    /**
     ************************************
     * METODO PARA Actualizar del producto ***********************************
     *
     */
    public boolean actualizarStock(Producto producto, int idProducto) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_producto set cantidad =? where idProducto = '" + idProducto + "'");
            consulta.setInt(1, producto.getCantidad());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actuaizar cantidad [acc]" + e);
        }
        return respuesta;
    }

}

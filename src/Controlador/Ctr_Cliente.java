package Controlador;

import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Ctr_Cliente {

    /**
     *********************************************
     * METODO PARA GUARDAR CLIENTE ******************************************
     *
     */
    public boolean guardar(Cliente obj) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_cliente values (?, ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, obj.getNombre());
            consulta.setString(3, obj.getApellido());
            consulta.setString(4, obj.getDni());
            consulta.setString(5, obj.getTelefono());
            consulta.setString(6, obj.getDireccion());
            consulta.setInt(7, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Cliente" + e);
        }
        return respuesta;
    }

    /**
     *************************************************
     * METODO PARA CONSULTA SI EL CLIENTE EXISTE
     * ***********************************************
     *
     */
    public boolean existeCliente(String cedula) {

        boolean respuesta = false;
        String sql = "select cedula from tb_cliente where cedula = ' " + cedula + " ';";
        Statement st;

        try {
            Connection cn = Conexion.conexcion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al Consultar Cliente" + e);
        }
        return respuesta;
    }

    /**
     ************************************
     * METODO PARA ACTUALIZAR UN CLIENTE ***********************************
    *
     */
    public boolean actualizar(Cliente obj, int idCliente) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_cliente set nombre=?, apellido=?, cedula=?, telefono=?, direccion=?, estado=? where idCliente = '" + idCliente + "'");
            consulta.setString(1, obj.getNombre());
            consulta.setString(2, obj.getApellido());
            consulta.setString(3, obj.getDni());
            consulta.setString(4, obj.getTelefono());
            consulta.setString(5, obj.getDireccion());
            consulta.setInt(6, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actuaizar cliente" + e);
        }
        return respuesta;
    }

    /**
     ************************************
     * METODO PARA ELIMINAR CLIENTE ***********************************
    *
     */
    public boolean eliminar(int idCliente) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from tb_cliente where idCliente = '" + idCliente + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente" + e);
        }
        return respuesta;
    }

}

package Controlador;

import Modelo.Cliente;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Ctr_Usuario {
    
    

    //metodo para iniciar sesion
    public boolean loginUser(Usuario objeto) {

        boolean respuesta = false;

        Connection cn = Conexion.conexcion.conectar();
        String sql = "select usuario, password from tb_usuario where usuario = '" + objeto.getUsuario() + " ' and password = '" + objeto.getPassword() + " ' ";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }

    /**
     *********************************************
     * METODO PARA GUARDAR USUARIO ******************************************
     *
     */
    public boolean guardar(Usuario obj) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_usuario values (?, ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, obj.getNombre());
            consulta.setString(3, obj.getApellido());
            consulta.setString(4, obj.getUsuario());
            consulta.setString(5, obj.getPassword());
            consulta.setString(6, obj.getTelefono());
            consulta.setInt(7, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Usuario" + e);
        }
        return respuesta;
    }

    /**
     *************************************************
     * METODO PARA CONSULTA SI EL CLIENTE EXISTE
     * ***********************************************
     *
     */
    public boolean existeUsuario(String usuario) {

        boolean respuesta = false;
        String sql = "select cedula from tb_usuario where cedula = '" + usuario + "';";
        Statement st;

        try {
            Connection cn = Conexion.conexcion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al Consultar Usuario" + e);
        }
        return respuesta;
    }
/**
     ************************************
     * METODO PARA ACTUALIZAR UN USUARIO ***********************************
    *
     */
    public boolean actualizar(Usuario obj, int idUsuario) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_usuario set nombre=?, apellido=?, usuario=?, password=?, telefono=?, estado=? where idUsuario = '" + idUsuario + "'");
            consulta.setString(2, obj.getNombre());
            consulta.setString(3, obj.getApellido());
            consulta.setString(4, obj.getUsuario());
            consulta.setString(5, obj.getPassword());
            consulta.setString(6, obj.getTelefono());
            consulta.setInt(7, obj.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actuaizar usuario" + e);
        }
        return respuesta;
    }

    /**
     ************************************
     * METODO PARA ELIMINAR USUARIO ***********************************
    *
     */
    public boolean eliminar(int idUsuario) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from tb_usuario where idUsuario = '" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario" + e);
        }
        return respuesta;
    }
}

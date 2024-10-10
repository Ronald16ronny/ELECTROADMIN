package Controlador;

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
        String sql = "select usuario, password from tb_usuario where usuario = '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "';";
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

}

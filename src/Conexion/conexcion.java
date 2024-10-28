package Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexcion {

    // conexcion local
    public static Connection conectar() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Electro_ad", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la coñexion local " + e);
            
        }
        return null;
    }
}

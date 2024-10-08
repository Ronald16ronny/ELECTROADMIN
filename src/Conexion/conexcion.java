package Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class conexcion {

    // conexcion local
    public static Connection conectar() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/BD_Electro_Admin");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la coñexion local " + e);
        }
        return null;
    }
}

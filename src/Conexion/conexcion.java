package Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class conexcion {

    // conexcion local
    public static Connection conectar() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_electro_admin", "root", "852066");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la coñexion local " + e);
        }
        return null;
    }
}

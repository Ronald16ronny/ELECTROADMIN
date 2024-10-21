package Controlador;

import Modelo.Categoria;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Ctr_Categoria {

    //METODO PARA REGUISTRAR CETEGORIA
    public boolean guardar(Categoria obj) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_categoria(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, obj.getDescripcion());
            consulta.setInt(3, obj.getEstado());

            if (consulta.executeUpdate() > 0) {

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar Categoria" + e);
        }
        return respuesta;
    }
    // metodo para consultar si existe la categoria
    public boolean existeCategoria(String categoria) {

        boolean respuesta = false;
        String sql = "select decripcion from tb_categoria where descripcion = '" + categoria + "';";
        Statement st;

        try {
            Connection cn = Conexion.conexcion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al Consultar Categoria" + e);
        }
        return respuesta;
    }
    
     //METODO PARA ACTUALIZAR CETEGORIA
    public boolean actualizar(Categoria obj, int idCategoria) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_categoria set descripcion=? where idCategoria = '" + idCategoria + "'");
            consulta.setString(1, obj.getDescripcion());

            if (consulta.executeUpdate() > 0) {

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actuaizar categoria" + e);
        }
        return respuesta;
    }
    
      //METODO PARA ACTUALIZAR CETEGORIA
    public boolean eliminar( int idCategoria) {

        boolean respuesta = false;
        Connection cn = Conexion.conexcion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("delete from tb_categoria where idCategoria = '" + idCategoria + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar categoria" + e);
        }
        return respuesta;
    }
    
}

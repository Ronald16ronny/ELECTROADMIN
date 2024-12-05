/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package InternalFrame;

import Controlador.Crt_Producto_po;
import Modelo.Producto;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSUE
 */
public class ActualizarStock extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActualizarStock
     */
    //variable glovales
    int idProducto = 0;
    int cantidad = 0;

    public ActualizarStock() {
        initComponents();
        this.setSize(new Dimension(400, 300));

        this.ComboProducto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadActual = new javax.swing.JTextField();
        txtCantidadNueva = new javax.swing.JTextField();
        jComboBox1_producto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        lblwalpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Actualizar Stock");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setText("Actualizar Stock");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Stock Actual:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Stock Nuevo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, -1));

        txtCantidadActual.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidadActual.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtCantidadActual.setEnabled(false);
        getContentPane().add(txtCantidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, -1));

        txtCantidadNueva.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidadNueva.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        getContentPane().add(txtCantidadNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, -1));

        jComboBox1_producto.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jComboBox1_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto:", "Item 2", "Item 3", "Item 4" }));
        jComboBox1_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_productoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 170, 30));

        lblwalpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-azul-para-textura.jpg"))); // NOI18N
        getContentPane().add(lblwalpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_productoActionPerformed
        this.MostrarStock();
    }//GEN-LAST:event_jComboBox1_productoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //validamos seleccione producto
        if (!jComboBox1_producto.getSelectedItem().equals("Seleccione Producto:")) {
            //validamos campos vacion
            if (!txtCantidadNueva.getText().isEmpty()) {
                //validamos q no entren otros caracteres no numeriococ 
                boolean validacion = validar(txtCantidadNueva.getText());
                if (validacion == true) {
                    //validamos que la cantidad es mayor a (0)
                    if (Integer.parseInt(txtCantidadNueva.getText()) > 0) {

                        Producto producto = new Producto();
                        Crt_Producto_po controlproduto = new Crt_Producto_po();
                        int stockactual = Integer.parseInt(txtCantidadActual.getText().trim());
                        int stocknuevo = Integer.parseInt(txtCantidadNueva.getText().trim());

                        stocknuevo = stockactual + stocknuevo;
                        producto.setCantidad(stocknuevo);
                        if (controlproduto.actualizarStock(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, " Stock actualizado ");
                            jComboBox1_producto.setSelectedItem("Seleccione Producto:");
                            txtCantidadActual.setText("");
                            txtCantidadNueva.setText("");
                            this.txtCantidadNueva.requestFocus();
                            this.ComboProducto();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al actualizar stock ");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, " La cantidad no puede ser cero ni negativa ");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "En la la cantidad no se admiten caracteres no numericos");
                }//
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un nueva cantidad para sumar al stock anterior");
            }//
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        }//


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblwalpaper;
    private javax.swing.JTextField txtCantidadActual;
    private javax.swing.JTextField txtCantidadNueva;
    // End of variables declaration//GEN-END:variables

//metodo para cargart los producto en el combobox
    private void ComboProducto() {

        Connection con = Conexion.conexcion.conectar();
        String sql = "select * from tb_producto";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox1_producto.removeAllItems();
            jComboBox1_producto.addItem("Seleccione Producto:");
            while (rs.next()) {
                jComboBox1_producto.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error al al cargar los productos: (cbo) " + e);
        }

    }

    //metodo para mostrar stock del producto seleccionado
    private void MostrarStock() {
        try {
            Connection con = Conexion.conexcion.conectar();
            String sql = "select * from tb_producto where nombre = '" + this.jComboBox1_producto.getSelectedItem() + "'";
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idProducto = rs.getInt("idProducto");
                cantidad = rs.getInt("cantidad");
                txtCantidadActual.setText(String.valueOf(cantidad));
            } else {
                txtCantidadActual.setText("");

            }

        } catch (SQLException e) {
            System.out.println("Error al obtener stock del producto (mosstock):  " + e);
        }

    }

    //metodo para caracteres no numericos
    private boolean validar(String valor) {
        int num;
        try {
            num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

}

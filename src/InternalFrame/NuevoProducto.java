package InternalFrame;

import Controlador.Crt_Producto;
import Modelo.Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class NuevoProducto extends javax.swing.JInternalFrame {

    int obtenerIdCategoriaCombo = 0;

    public NuevoProducto() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Producto");

        this.CargarComboCategorias();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        CmbxIVA = new javax.swing.JComboBox<>();
        CmbCategoria = new javax.swing.JComboBox<>();
        bnGuardar = new javax.swing.JButton();
        Lb1_Fondo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("IVA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Categoria: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, -1));

        txtNombre.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        txtCantidad.setBackground(new java.awt.Color(153, 255, 255));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, -1));

        txtPrecio.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        txtDescripcion.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, -1));

        CmbxIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione IVA:", "No grab IVA", "18%", "16%", " " }));
        getContentPane().add(CmbxIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        CmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Categoria:", " ", " " }));
        CmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(CmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        bnGuardar.setBackground(new java.awt.Color(102, 255, 255));
        bnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bnGuardar.setText("Guardar");
        bnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(bnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 30));

        Lb1_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-09-23 142356.png"))); // NOI18N
        getContentPane().add(Lb1_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void bnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnGuardarActionPerformed
        Producto producto = new Producto();
        Crt_Producto controlProducto = new Crt_Producto();
        String iva = "";
        String categoria = "";
        iva = CmbxIVA.getSelectedItem().toString().trim();
        categoria = CmbCategoria.getSelectedItem().toString().trim();

        if (txtNombre.getText().equals("") || txtCantidad.getText().equals("") || txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos ");
            txtNombre.setBackground(Color.red);
            txtCantidad.setBackground(Color.red);
            txtPrecio.setBackground(Color.red);

        } else {
            if (!controlProducto.existeProducto(txtNombre.getText().trim())) {

                if (iva.equalsIgnoreCase("Selecione IVA: ")) {
                    JOptionPane.showMessageDialog(null, "Selecione IVA  ");
                } else {
                    if (categoria.equalsIgnoreCase("Selecione Categoria:")) {
                        JOptionPane.showMessageDialog(null, "Selecione categoria  ");
                    } else {

                        try {

                            producto.setNombre(txtNombre.getText().trim());
                            producto.setCantidad(Integer.parseInt(txtCantidad.getText().trim()));
                            String preciotxt = "";
                            double Precio = 0.0;
                            preciotxt = txtPrecio.getText().trim();
                            boolean aux = false;

                            for (int i = 0; i < preciotxt.length(); i++) {

                                if (preciotxt.charAt(i) == ',') {
                                    String precioNuevo = preciotxt.replace(",", ".");
                                    Precio = Double.parseDouble(precioNuevo);
                                    aux = true;
                                }

                            }

                            if (aux == true) {
                                producto.setPrecio(Precio);
                            } else {
                                Precio = Double.parseDouble(preciotxt);
                                producto.setPrecio(Precio);
                            }

                            producto.setDescripcion(txtDescripcion.getText().trim());

                            if (iva.equalsIgnoreCase("No grab IVA")) {
                                producto.setPorsentajeIVA(0);

                            } else if (iva.equalsIgnoreCase("18%")) {
                                producto.setPorsentajeIVA(18);
                            } else if (iva.equalsIgnoreCase("16%")) {
                                producto.setPorsentajeIVA(16);
                            }

                            this.IdCategoria();
                            producto.setIdCategoria(obtenerIdCategoriaCombo);
                            producto.setEstado(1);
                            if (controlProducto.Guardar(producto)) {
                                JOptionPane.showMessageDialog(null, "Registro guardar ");
                                txtNombre.setBackground(Color.green);
                                txtCantidad.setBackground(Color.green);
                                txtPrecio.setBackground(Color.green);
                                txtDescripcion.setBackground(Color.green);

                                this.CargarComboCategorias();
                                this.CmbxIVA.setSelectedItem("Selecione IVA: ");
                                this.Limpiar();

                            } else {
                                JOptionPane.showMessageDialog(null, "Error al guardar ");
                            }

                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en: "+e);
                        }

                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la Base de Datos  ");
            }

        }


    }//GEN-LAST:event_bnGuardarActionPerformed

    private void CmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbCategoria;
    private javax.swing.JComboBox<String> CmbxIVA;
    private javax.swing.JLabel Lb1_Fondo;
    private javax.swing.JButton bnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtDescripcion.setText("");

    }

    private void CargarComboCategorias() {

        Connection cn = Conexion.conexcion.conectar();
        String sql = "select * from tb_categoria";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            CmbCategoria.removeAllItems();
            CmbCategoria.addItem("Selecione Categoria:");
            while (rs.next()) {
                CmbCategoria.addItem(rs.getString("Descripcion"));

            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar categorias ");

        }

    }

    private int IdCategoria() {
        String sql = "select * from tb_Categoria where description = '" + this.CmbCategoria.getSelectedItem() + "'";
        Statement st;
        try {

            Connection cn = Conexion.conexcion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");

            }

        } catch (SQLException e) {
            System.out.println("Error al optener id categoria ");
        }
        return obtenerIdCategoriaCombo;
    }

}

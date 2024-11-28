/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package InternalFrame;

import Controlador.Ctr_Cliente;
import Modelo.Cliente;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static InternalFrame.GestionarVentas.tVentas;

/**
 *
 * @author JOSUE
 */
public class GestionarVentas extends javax.swing.JInternalFrame {

    private int idCliente=0;
    private int idVentas;
    
    public GestionarVentas() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.CargarTablaClientes();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tVentas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_totalpagar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Administrar Cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Arministrar Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 720, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 130, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Pagar");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txt_totalpagar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txt_totalpagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_totalpagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_totalpagar.setEnabled(false);
        txt_totalpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalpagarActionPerformed(evt);
            }
        });
        jPanel3.add(txt_totalpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 30));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Fecha:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        txt_fecha.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txt_fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_fecha.setEnabled(false);
        jPanel3.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 30));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cliente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estado:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 90, -1));

        cboCliente.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones Cliente:", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 860, 140));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-azul-para-textura.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if(txt_totalpagar.getText().isEmpty() && txtapellido.getText().isEmpty() && txtdni.getText().isEmpty() && txt_fecha.getText().isEmpty() && txtdireccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "¡Complete todos los campos!");
        }else{
            
            Cliente cliente = new Cliente();
            Ctr_Cliente controlCliente = new Ctr_Cliente();
            
            cliente.setNombre(txt_totalpagar.getText().trim());
            cliente.setApellido(txtapellido.getText().trim());
            cliente.setDni(txtdni.getText().trim());
            cliente.setTelefono(txt_fecha.getText().trim());
            cliente.setDireccion(txtdireccion.getText().trim());
            
            if(controlCliente.actualizar(cliente, idCliente)){
                 JOptionPane.showMessageDialog(null, "¡Datos del cliente Actualizados!");
                 this.CargarTablaClientes();
                 this.Limpiar();
            }else{
                 JOptionPane.showMessageDialog(null, "¡Error al Actualizar!");
            }
            
            
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txt_totalpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalpagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalpagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tVentas;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_totalpagar;
    // End of variables declaration//GEN-END:variables
 /**
     *
     * metodos para mostrar todas las categorias
     *
     */
    private void CargarTablaClientes() {
        Connection con = Conexion.conexcion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from  tb_cliente";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            GestionarVentas.tVentas = new JTable(model);
            GestionarVentas.jScrollPane1.setViewportView(GestionarVentas.tVentas);

            model.addColumn("Nº");//ID
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Dni");
            model.addColumn("Telefono");
            model.addColumn("Direccion");
            model.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[7];

                for (int i = 0; i < 7; i++) {

                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar ala tabla cliente" + e);
        }

        tVentas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tVentas.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCliente = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClientesSeleccionado(idCliente);
                }

            }
        });

    }

    private void EnviarDatosClientesSeleccionado(int idCliente) {
        try {

            Connection con = Conexion.conexcion.conectar();
            PreparedStatement pst = con.prepareStatement("select * from tb_cliente where idCliente = '" + idCliente + " ' ");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_totalpagar.setText(rs.getString("nombre"));
                txtapellido.setText(rs.getString("apellido"));
                txtdni.setText(rs.getString("cedula"));
                txt_fecha.setText(rs.getString("telefono"));
                txtdireccion.setText(rs.getString("direccion"));
            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al seleccionar cliente" + e);
        }
    }

    private void Limpiar() {
        txt_totalpagar.setText("");
        txtapellido.setText("");
        txt_fecha.setText("");
        txtdireccion.setText("");
        txtdni.setText("");
    }

}

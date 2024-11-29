package InternalFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */


import Controlador.Ctr_Usuario;
import Modelo.Usuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSUE
 */
public class NuevoUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Nuevo Usuario");
        
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Usuario = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        txt_Password = new javax.swing.JPasswordField();
        jLabel_wallpaper = new javax.swing.JLabel();
        txt_Apellido1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Nuevo Usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 40));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombres:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 110, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Uusario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, -1));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, -1));

        txt_Nombre.setBackground(new java.awt.Color(153, 204, 255));
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, -1));

        txt_Apellido.setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, -1));

        txt_Usuario.setBackground(new java.awt.Color(153, 204, 255));
        txt_Usuario.setForeground(new java.awt.Color(204, 255, 255));
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, -1));

        txt_Telefono.setBackground(new java.awt.Color(153, 204, 255));
        txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, -1));

        jButton_Guardar.setBackground(new java.awt.Color(153, 204, 255));
        jButton_Guardar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.setInheritsPopupMenu(true);
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 110, 30));

        txt_Password.setBackground(new java.awt.Color(153, 204, 255));
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-azul-para-textura.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        txt_Apellido1.setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().add(txt_Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        if (txt_Nombre.getText().isEmpty()|| txt_Apellido.getText().isEmpty() || txt_Usuario.getText().isEmpty() 
                || txt_Password.getText().isEmpty() || txt_Telefono.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
            
        } else {
            //se valida la existancia del usuario
            Usuario usuario = new Usuario();
            Ctr_Usuario controlUsuario = new Ctr_Usuario();
            if (!controlUsuario.existeUsuario(txt_Usuario.getText().trim())) {
                //enviamos datos del usuario
                usuario.setNombre(txt_Nombre.getText().trim());
                usuario.setApellido(txt_Apellido.getText().trim());
                usuario.setUsuario(txt_Usuario.getText().trim());
                usuario.setPassword(txt_Password.getText().trim());
                usuario.setTelefono(txt_Telefono.getText().trim());
                usuario.setEstado(1);
                if (controlUsuario.guardar(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario REGISTRADO correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR al registrar usuario");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya esta registrado,ingrese otro");
            }
        }
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Apellido1;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Usuario.setText("");
        txt_Password.setText("");
        txt_Telefono.setText("");
    }

}

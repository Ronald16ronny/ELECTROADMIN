
package Formularios;

import Controlador.Ctr_Usuario;
import Modelo.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.tools.Tool;

public class Login extends javax.swing.JFrame {
    
    int xmouse, ymouse;
    
    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(900, 600));
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/new logo de empresa.png"));
        return retValue;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnhead = new javax.swing.JPanel();
        pnsalir = new javax.swing.JPanel();
        lblexit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        psscontraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btniniciarcecion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-09-20 160907.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 330, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-09-20 151234.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 330, 210));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 600));

        pnhead.setBackground(new java.awt.Color(0, 0, 0));
        pnhead.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnheadMouseDragged(evt);
            }
        });
        pnhead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnheadMousePressed(evt);
            }
        });

        pnsalir.setBackground(new java.awt.Color(0, 0, 0));

        lblexit.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblexit.setForeground(new java.awt.Color(255, 255, 255));
        lblexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexit.setText("x");
        lblexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblexitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnsalirLayout = new javax.swing.GroupLayout(pnsalir);
        pnsalir.setLayout(pnsalirLayout);
        pnsalirLayout.setHorizontalGroup(
            pnsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnsalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblexit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnsalirLayout.setVerticalGroup(
            pnsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnsalirLayout.createSequentialGroup()
                .addComponent(lblexit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnheadLayout = new javax.swing.GroupLayout(pnhead);
        pnhead.setLayout(pnheadLayout);
        pnheadLayout.setHorizontalGroup(
            pnheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnheadLayout.createSequentialGroup()
                .addGap(0, 875, Short.MAX_VALUE)
                .addComponent(pnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnheadLayout.setVerticalGroup(
            pnheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnhead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 20));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-09-23 172606.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 170, 160));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su usuario");
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 310, 40));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 310, 40));

        psscontraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        psscontraseña.setForeground(new java.awt.Color(204, 204, 204));
        psscontraseña.setText("********");
        psscontraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        psscontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psscontraseñaMousePressed(evt);
            }
        });
        psscontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                psscontraseñaKeyPressed(evt);
            }
        });
        jPanel3.add(psscontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 310, 40));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 310, 40));

        btniniciarcecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/56156189519566485.png"))); // NOI18N
        btniniciarcecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarcecionActionPerformed(evt);
            }
        });
        jPanel3.add(btniniciarcecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 60, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-09-23 150910.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 100, 110));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTRASEÑA");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 52)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INICIAR SESIÓN");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E|A");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 570, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnheadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnheadMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_pnheadMousePressed

    private void pnheadMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnheadMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_pnheadMouseDragged

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblexitMouseClicked

    private void lblexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseExited
        pnsalir.setBackground(Color.black);
    }//GEN-LAST:event_lblexitMouseExited

    private void lblexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseEntered
        pnsalir.setBackground(Color.red);
    }//GEN-LAST:event_lblexitMouseEntered

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
         if ( txtUsuario.getText().equals("Ingrese su usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
       }
       if (String.valueOf(psscontraseña.getPassword()).isEmpty()){
             psscontraseña.setText("********");
             psscontraseña.setForeground(Color.gray);
       }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void psscontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psscontraseñaMousePressed
        if (String.valueOf(psscontraseña.getPassword()).equals("********")){
                 psscontraseña.setText("");
                psscontraseña.setForeground(Color.black);
          }
          if (txtUsuario.getText().isEmpty()){
               txtUsuario.setText("Ingrese su usuario");
               txtUsuario.setForeground(Color.gray);
          }
    }//GEN-LAST:event_psscontraseñaMousePressed

    private void btniniciarcecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarcecionActionPerformed
        this.Login();
    }//GEN-LAST:event_btniniciarcecionActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            psscontraseña.requestFocus();
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void psscontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_psscontraseñaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER)
            this.Login();
    }//GEN-LAST:event_psscontraseñaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciarcecion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblexit;
    private javax.swing.JPanel pnhead;
    private javax.swing.JPanel pnsalir;
    private javax.swing.JPasswordField psscontraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

private void Login (){
    if (!txtUsuario.getText().isEmpty() && !psscontraseña.getText().isEmpty()) {
        
        Ctr_Usuario controlUsuario = new Ctr_Usuario();
        Usuario usuario = new Usuario();
        usuario.setUsuario(txtUsuario.getText().trim());
        usuario.setPassword(psscontraseña.getText().trim());
        if (controlUsuario.loginUser(usuario)){
            Menu menu = new Menu();
            menu.setVisible(true);
        }else{
              JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrecta");
        }
        
    }else {
        JOptionPane.showMessageDialog(null,"Ingrese sus credenciales");
    }
}
    
}


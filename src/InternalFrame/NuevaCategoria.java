package InternalFrame;

import Controlador.Ctr_Categoria;
import Modelo.Categoria;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSUE
 */
public class NuevaCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevaCategoria
     */
    public NuevaCategoria() {
        initComponents();
        this.setSize(new Dimension(400, 200));

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
        txtdescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblwalpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion Categoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtdescripcion.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 170, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 100, 30));

        lblwalpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura de pantalla 2024-09-23 142356.png"))); // NOI18N
        getContentPane().add(lblwalpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Categoria cat = new Categoria();
        Ctr_Categoria controlcategoria = new Ctr_Categoria();

        //validamos campos vacios
        if (txtdescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos");
        } else {
            if (!controlcategoria.existeCategoria(txtdescripcion.getText().trim())) {
                cat.setDescripcion(txtdescripcion.getText().trim());
                cat.setEstado(1);
                if (controlcategoria.guardar(cat)) {
                    JOptionPane.showMessageDialog(null, "Reguistro guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La categoria ya esta reguistrada en la base de datos");
            }
        }
        //limpiar campo
        txtdescripcion.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblwalpaper;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
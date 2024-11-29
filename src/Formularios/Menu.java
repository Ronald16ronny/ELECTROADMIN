/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import InternalFrame.Boleta;
import InternalFrame.FACTURA_01;
import InternalFrame.Factura;
import InternalFrame.GestionarCategorias;
import InternalFrame.GestionarCliente;
import InternalFrame.GestionarUsuario;
import InternalFrame.NuevaCategoria;
import InternalFrame.NuevoCliente;
import InternalFrame.NuevoProducto;
import InternalFrame.NuevoUsuario;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;



/**
 *
 * @author JOSUE
 */
public class Menu extends javax.swing.JFrame {



    public Menu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
       this.setContentPane(this.dpMenu);
       this.setLayout(null);
       
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/fondo abstrac.jpg"));
        Image image = icon.getImage();
        dpMenu = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        mbMenu = new javax.swing.JMenuBar();
        MnUsuario = new javax.swing.JMenu();
        MnINuevoUsuario = new javax.swing.JMenuItem();
        MnIGesUsuario = new javax.swing.JMenuItem();
        MnProducto = new javax.swing.JMenu();
        MnINuevoProducto = new javax.swing.JMenuItem();
        MnIGesProducto = new javax.swing.JMenuItem();
        MnIActualizarStock = new javax.swing.JMenuItem();
        MnCliente = new javax.swing.JMenu();
        MnINuevoCliente = new javax.swing.JMenuItem();
        MnIGesCliente = new javax.swing.JMenuItem();
        MnCategoria = new javax.swing.JMenu();
        MnINuevaCategoria = new javax.swing.JMenuItem();
        MnIGesCategoria = new javax.swing.JMenuItem();
        MnVenta = new javax.swing.JMenu();
        Mnventa = new javax.swing.JMenu();
        MnIBoleta = new javax.swing.JMenuItem();
        MnIFactura = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnIGesVenta = new javax.swing.JMenuItem();
        MnReporte = new javax.swing.JMenu();
        MnIRepCliente = new javax.swing.JMenuItem();
        MnIRepCategoria = new javax.swing.JMenuItem();
        MnIRepProducto = new javax.swing.JMenuItem();
        MnIRepVenta = new javax.swing.JMenuItem();
        MnHistorial = new javax.swing.JMenu();
        MnIHistorial = new javax.swing.JMenuItem();
        MnCerrarSesion = new javax.swing.JMenu();
        MnICerarsesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        dpMenu.setBackground(new java.awt.Color(255, 255, 255));
        dpMenu.setForeground(new java.awt.Color(255, 255, 255));
        dpMenu.setPreferredSize(new java.awt.Dimension(1200, 700));
        dpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mbMenu.setBackground(new java.awt.Color(238, 234, 231));

        MnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/USUARIO.png"))); // NOI18N
        MnUsuario.setText("Usuario");
        MnUsuario.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        MnUsuario.setMargin(new java.awt.Insets(3, 15, 3, 15));

        MnINuevoUsuario.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnINuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVO USUARIO.png"))); // NOI18N
        MnINuevoUsuario.setText("Nuevo Usuario");
        MnINuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnINuevoUsuarioActionPerformed(evt);
            }
        });
        MnUsuario.add(MnINuevoUsuario);

        MnIGesUsuario.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIGesUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GESTIONARUSUARIO.png"))); // NOI18N
        MnIGesUsuario.setText("Gestionar Usuarios");
        MnIGesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIGesUsuarioActionPerformed(evt);
            }
        });
        MnUsuario.add(MnIGesUsuario);

        mbMenu.add(MnUsuario);

        MnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRODUCTO.png"))); // NOI18N
        MnProducto.setText("Producto");
        MnProducto.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        MnProducto.setMargin(new java.awt.Insets(3, 15, 3, 15));

        MnINuevoProducto.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnINuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVO PRODUCTO.png"))); // NOI18N
        MnINuevoProducto.setText("Nuevo Producto");
        MnINuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnINuevoProductoActionPerformed(evt);
            }
        });
        MnProducto.add(MnINuevoProducto);

        MnIGesProducto.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIGesProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GESTIONAR PRODUCTO.png"))); // NOI18N
        MnIGesProducto.setText("Gestionar Producto");
        MnProducto.add(MnIGesProducto);

        MnIActualizarStock.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIActualizarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ACTUALIZAR STOCK.png"))); // NOI18N
        MnIActualizarStock.setText("Actualizar Stock");
        MnProducto.add(MnIActualizarStock);

        mbMenu.add(MnProducto);

        MnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLIENTE.png"))); // NOI18N
        MnCliente.setText("Cliente");
        MnCliente.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        MnCliente.setMargin(new java.awt.Insets(3, 15, 3, 15));

        MnINuevoCliente.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnINuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVO CLIENTE.png"))); // NOI18N
        MnINuevoCliente.setText("NuevoCliente");
        MnINuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnINuevoClienteActionPerformed(evt);
            }
        });
        MnCliente.add(MnINuevoCliente);

        MnIGesCliente.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIGesCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GESTIONAR CLIENTE.png"))); // NOI18N
        MnIGesCliente.setText(" Gestionar Cliente");
        MnIGesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIGesClienteActionPerformed(evt);
            }
        });
        MnCliente.add(MnIGesCliente);

        mbMenu.add(MnCliente);

        MnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CATEGORIA.png"))); // NOI18N
        MnCategoria.setText("Categoria");
        MnCategoria.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        MnCategoria.setMargin(new java.awt.Insets(3, 15, 3, 15));

        MnINuevaCategoria.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnINuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVA CATEGORIA.png"))); // NOI18N
        MnINuevaCategoria.setText("Nueva Categoria");
        MnINuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnINuevaCategoriaActionPerformed(evt);
            }
        });
        MnCategoria.add(MnINuevaCategoria);

        MnIGesCategoria.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIGesCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GESTIONAR CATEGORIA.png"))); // NOI18N
        MnIGesCategoria.setText("Gestionar Categoria");
        MnIGesCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIGesCategoriaActionPerformed(evt);
            }
        });
        MnCategoria.add(MnIGesCategoria);

        mbMenu.add(MnCategoria);

        MnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VENTA.png"))); // NOI18N
        MnVenta.setText("Venta");
        MnVenta.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        MnVenta.setMargin(new java.awt.Insets(3, 15, 3, 15));

        Mnventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NUEVA VENTA.png"))); // NOI18N
        Mnventa.setText("Nueva Venta");
        Mnventa.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        MnIBoleta.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOLETA.png"))); // NOI18N
        MnIBoleta.setText("Boleta");
        MnIBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIBoletaActionPerformed(evt);
            }
        });
        Mnventa.add(MnIBoleta);

        MnIFactura.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FACTURA.png"))); // NOI18N
        MnIFactura.setText("Factura");
        MnIFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIFacturaActionPerformed(evt);
            }
        });
        Mnventa.add(MnIFactura);

        MnVenta.add(Mnventa);
        MnVenta.add(jSeparator1);

        MnIGesVenta.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIGesVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GESTIONAR VENTA.png"))); // NOI18N
        MnIGesVenta.setText("Gestionar Venta");
        MnIGesVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIGesVentaActionPerformed(evt);
            }
        });
        MnVenta.add(MnIGesVenta);

        mbMenu.add(MnVenta);

        MnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTE 3.png"))); // NOI18N
        MnReporte.setText("Reporte");
        MnReporte.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        MnReporte.setMargin(new java.awt.Insets(3, 15, 3, 15));

        MnIRepCliente.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIRepCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTE2.png"))); // NOI18N
        MnIRepCliente.setText("Reporte Clientes");
        MnIRepCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnIRepClienteActionPerformed(evt);
            }
        });
        MnReporte.add(MnIRepCliente);

        MnIRepCategoria.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIRepCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTE2.png"))); // NOI18N
        MnIRepCategoria.setText("Reporte Categoria");
        MnReporte.add(MnIRepCategoria);

        MnIRepProducto.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIRepProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTE2.png"))); // NOI18N
        MnIRepProducto.setText("Reporte Producto");
        MnReporte.add(MnIRepProducto);

        MnIRepVenta.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIRepVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTE2.png"))); // NOI18N
        MnIRepVenta.setText("Reporte Venta");
        MnReporte.add(MnIRepVenta);

        mbMenu.add(MnReporte);

        MnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HISTORIAL 2.png"))); // NOI18N
        MnHistorial.setText("Historial");
        MnHistorial.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        MnHistorial.setMargin(new java.awt.Insets(3, 15, 3, 15));

        MnIHistorial.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnIHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HISTORIAL.png"))); // NOI18N
        MnIHistorial.setText("Ver Historial");
        MnHistorial.add(MnIHistorial);

        mbMenu.add(MnHistorial);

        MnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exit_41038.png"))); // NOI18N
        MnCerrarSesion.setText("Cerrar Sesión");
        MnCerrarSesion.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        MnCerrarSesion.setMargin(new java.awt.Insets(3, 15, 3, 15));

        MnICerarsesion.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        MnICerarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        MnICerarsesion.setText("Cerrar Sesión");
        MnICerarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnICerarsesionActionPerformed(evt);
            }
        });
        MnCerrarSesion.add(MnICerarsesion);

        mbMenu.add(MnCerrarSesion);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnINuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnINuevoUsuarioActionPerformed
        NuevoUsuario nuevoUsuario = new NuevoUsuario();
        dpMenu.add(nuevoUsuario);
        nuevoUsuario.setVisible(true);
       
    }//GEN-LAST:event_MnINuevoUsuarioActionPerformed

    private void MnIGesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIGesUsuarioActionPerformed
        GestionarUsuario gestionarUsuario = new GestionarUsuario();
        dpMenu.add(gestionarUsuario);
        gestionarUsuario.setVisible(true);
    }//GEN-LAST:event_MnIGesUsuarioActionPerformed

    private void MnINuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnINuevoClienteActionPerformed
        NuevoCliente  nuevoCliente = new NuevoCliente();
        dpMenu.add(nuevoCliente);
        nuevoCliente.setVisible(true);
    }//GEN-LAST:event_MnINuevoClienteActionPerformed

    private void MnINuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnINuevaCategoriaActionPerformed
        NuevaCategoria  nuevoCategoria = new NuevaCategoria();
        dpMenu.add(nuevoCategoria);
        nuevoCategoria.setVisible(true);
        
    }//GEN-LAST:event_MnINuevaCategoriaActionPerformed

    private void MnIGesCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIGesCategoriaActionPerformed
         GestionarCategorias  gestionarCategoria = new GestionarCategorias();
        dpMenu.add(gestionarCategoria);
        gestionarCategoria.setVisible(true);
    }//GEN-LAST:event_MnIGesCategoriaActionPerformed

    private void MnICerarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnICerarsesionActionPerformed
       Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MnICerarsesionActionPerformed

    private void MnIGesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIGesClienteActionPerformed
        
        GestionarCliente  gestionarCliente = new GestionarCliente();
        dpMenu.add(gestionarCliente);
        gestionarCliente.setVisible(true);
        
    }//GEN-LAST:event_MnIGesClienteActionPerformed

    private void MnIFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIFacturaActionPerformed
        FACTURA_01 fac = new FACTURA_01();
        dpMenu.add(fac);
        fac.setVisible(true);
    }//GEN-LAST:event_MnIFacturaActionPerformed

    private void MnIRepClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIRepClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnIRepClienteActionPerformed

    private void MnIGesVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIGesVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnIGesVentaActionPerformed

    private void MnIBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnIBoletaActionPerformed
        Boleta  bol = new Boleta();
        dpMenu.add(bol);
        bol.setVisible(true);
    }//GEN-LAST:event_MnIBoletaActionPerformed

      
   private void MnINuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                
       NuevoProducto nuevoProducto = new NuevoProducto();
        dpMenu.add(nuevoProducto);
       nuevoProducto.setVisible(true);
    }   
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnCategoria;
    private javax.swing.JMenu MnCerrarSesion;
    private javax.swing.JMenu MnCliente;
    private javax.swing.JMenu MnHistorial;
    private javax.swing.JMenuItem MnIActualizarStock;
    private javax.swing.JMenuItem MnIBoleta;
    private javax.swing.JMenuItem MnICerarsesion;
    private javax.swing.JMenuItem MnIFactura;
    private javax.swing.JMenuItem MnIGesCategoria;
    private javax.swing.JMenuItem MnIGesCliente;
    private javax.swing.JMenuItem MnIGesProducto;
    private javax.swing.JMenuItem MnIGesUsuario;
    private javax.swing.JMenuItem MnIGesVenta;
    private javax.swing.JMenuItem MnIHistorial;
    private javax.swing.JMenuItem MnINuevaCategoria;
    private javax.swing.JMenuItem MnINuevoCliente;
    private javax.swing.JMenuItem MnINuevoProducto;
    private javax.swing.JMenuItem MnINuevoUsuario;
    private javax.swing.JMenuItem MnIRepCategoria;
    private javax.swing.JMenuItem MnIRepCliente;
    private javax.swing.JMenuItem MnIRepProducto;
    private javax.swing.JMenuItem MnIRepVenta;
    private javax.swing.JMenu MnProducto;
    private javax.swing.JMenu MnReporte;
    private javax.swing.JMenu MnUsuario;
    private javax.swing.JMenu MnVenta;
    private javax.swing.JMenu Mnventa;
    private javax.swing.JDesktopPane dpMenu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar mbMenu;
    // End of variables declaration//GEN-END:variables
}

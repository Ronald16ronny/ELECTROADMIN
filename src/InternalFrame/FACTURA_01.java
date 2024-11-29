/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package InternalFrame;


import Modelo.DetalleVenta;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FACTURA_01 extends javax.swing.JInternalFrame {

    // modelo de datos 
    private DefaultTableModel modeloDatosProductos;
    //lista para el detalle de ventas para los productos
    ArrayList<DetalleVenta> listaProducto = new ArrayList<>();
    private DetalleVenta producto;

    private int idProducto = 0;
    private String nombre = "";
    private int cantidadProductoBBDD = 0;
    private double precioUnitario = 0;
    private int porcentajeIGV = 0;

    private int cantidad = 0; //cantidad de productos a comprar
    private double subtotal = 0.0;//cantodad por precio
    private double descuento = 0.0;
    private double igv = 0.0;
    private double totalpagar = 0.0;

    //variables para calculos glovales
    private double sub_total_general = 0.0;
    private double descuento_general = 0.0;
    private double igv_general = 0.0;
    private double totalpagar_general = 0.0;
    //fin

    private int auxIdDetalle = 1; //id del detalle de venta

    
    public FACTURA_01() {
        initComponents();
         this.setSize(new Dimension(800, 600));

        //cargar los clientes a la vista
        this.CargarCliente();
        //cargar los clientes a la vista
        this.CargarProducto();
        txt_efectivo.setEnabled(false);
        btn_Añadir_Producto.setEnabled(false);
        this.inicializarTabla();
        txt_Subtotal.setText("0.0");
        txt_Descuento.setText("0.0");
        txt_igv.setText("0.0");
        txt_TotalPagar.setText("0.0");

    }

        //metodo para inicializar la tabla de los productos
    private void inicializarTabla() {
        modeloDatosProductos = new DefaultTableModel();
        //añadir columnas
        modeloDatosProductos.addColumn("N");
        modeloDatosProductos.addColumn("Nombre");
        modeloDatosProductos.addColumn("Cantidad");
        modeloDatosProductos.addColumn("p. Unitario");
        modeloDatosProductos.addColumn("Subtotal");
        modeloDatosProductos.addColumn("Descuento");
        modeloDatosProductos.addColumn("IGV");
        modeloDatosProductos.addColumn("Total Pagar");
        modeloDatosProductos.addColumn("Accion");
        //agregar los datos del modelo a la tabla
        this.tbl_Productos.setModel(modeloDatosProductos);

    }

    //metodo para presentar la informacion de la tabla detalle de venta
    private void ListaTabla_Producto() {
        this.modeloDatosProductos.setRowCount(listaProducto.size());
        for (int i = 0; i < listaProducto.size(); i++) {
            this.modeloDatosProductos.setValueAt(i + 1, i, 0);
            this.modeloDatosProductos.setValueAt(listaProducto.get(i).getNombre(), i, 1);
            this.modeloDatosProductos.setValueAt(listaProducto.get(i).getCantidad(), i, 2);
            this.modeloDatosProductos.setValueAt(listaProducto.get(i).getPrecioUnitario(), i, 3);
            this.modeloDatosProductos.setValueAt(listaProducto.get(i).getSubtotal(), i, 4);
            this.modeloDatosProductos.setValueAt(listaProducto.get(i).getDescuento(), i, 5);
            this.modeloDatosProductos.setValueAt(listaProducto.get(i).getIgv(), i, 6);
            this.modeloDatosProductos.setValueAt(listaProducto.get(i).getTotalapagar(), i, 7);
            this.modeloDatosProductos.setValueAt("Eleminar", i, 8);//luego poner un boton de eliminar
        }
        //añadir al tbltable
        tbl_Productos.setModel(modeloDatosProductos);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox<>();
        txtCliente_Buscar = new javax.swing.JTextField();
        btn_Buacar_Cliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btn_Añadir_Producto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Productos = new javax.swing.JTable();
        btn_ReguistrarVenta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_Subtotal = new javax.swing.JTextField();
        txt_Descuento = new javax.swing.JTextField();
        txt_igv = new javax.swing.JTextField();
        txt_TotalPagar = new javax.swing.JTextField();
        txt_cambio = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        btn_Calcular_cambio_cambio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Facturación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        cboCliente.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Cliente:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, -1));

        txtCliente_Buscar.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente_Buscar.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        getContentPane().add(txtCliente_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 150, -1));

        btn_Buacar_Cliente.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btn_Buacar_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/magnifier-on-a-user_icon-icons.com_56923.png"))); // NOI18N
        btn_Buacar_Cliente.setText("Buscar");
        btn_Buacar_Cliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Buacar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buacar_ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Buacar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, -1));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 60, -1));

        btn_Añadir_Producto.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btn_Añadir_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486395885-plus_80605.png"))); // NOI18N
        btn_Añadir_Producto.setText("Añadir");
        btn_Añadir_Producto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Añadir_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Añadir_ProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Añadir_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 120, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/invoice_document_bill_delivery_note_icon_225116(1).png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 130, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Productos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Productos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 760, 210));

        btn_ReguistrarVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ReguistrarVenta.setForeground(new java.awt.Color(0, 0, 0));
        btn_ReguistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Printer-blue_37120(2).png"))); // NOI18N
        btn_ReguistrarVenta.setText("Reguistrar Venta");
        btn_ReguistrarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ReguistrarVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btn_ReguistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 130, 110));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Subtotal:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Descuento:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("IGV:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Total a pagar:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Efectivo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Cambio:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, -1));

        txt_Subtotal.setBackground(new java.awt.Color(255, 255, 255));
        txt_Subtotal.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txt_Subtotal.setForeground(new java.awt.Color(0, 0, 0));
        txt_Subtotal.setEnabled(false);
        jPanel2.add(txt_Subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, -1));

        txt_Descuento.setBackground(new java.awt.Color(255, 255, 255));
        txt_Descuento.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txt_Descuento.setForeground(new java.awt.Color(0, 0, 0));
        txt_Descuento.setEnabled(false);
        jPanel2.add(txt_Descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, -1));

        txt_igv.setBackground(new java.awt.Color(255, 255, 255));
        txt_igv.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txt_igv.setForeground(new java.awt.Color(0, 0, 0));
        txt_igv.setEnabled(false);
        jPanel2.add(txt_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        txt_TotalPagar.setBackground(new java.awt.Color(255, 255, 255));
        txt_TotalPagar.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txt_TotalPagar.setForeground(new java.awt.Color(0, 0, 0));
        txt_TotalPagar.setEnabled(false);
        jPanel2.add(txt_TotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        txt_cambio.setBackground(new java.awt.Color(255, 255, 255));
        txt_cambio.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txt_cambio.setForeground(new java.awt.Color(0, 0, 0));
        txt_cambio.setEnabled(false);
        txt_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cambioActionPerformed(evt);
            }
        });
        jPanel2.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, -1));

        txt_efectivo.setBackground(new java.awt.Color(255, 255, 255));
        txt_efectivo.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txt_efectivo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));

        btn_Calcular_cambio_cambio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Calcular_cambio_cambio.setForeground(new java.awt.Color(0, 0, 0));
        btn_Calcular_cambio_cambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pay_cash_payment_money_dollar_bill_icon_143267(1).png"))); // NOI18N
        btn_Calcular_cambio_cambio.setText("Calcular Cambio");
        btn_Calcular_cambio_cambio.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pay_cash_payment_money_dollar_bill_icon_143267(1).png"))); // NOI18N
        btn_Calcular_cambio_cambio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Calcular_cambio_cambio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Calcular_cambio_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Calcular_cambio_cambioActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Calcular_cambio_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 380, 210));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-azul-para-textura.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 800, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Buacar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buacar_ClienteActionPerformed
         String clientebuscar = txtCliente_Buscar.getText().trim();
        Connection cn = Conexion.conexcion.conectar();
        String sql = "select nombre, apellido  from tb_cliente where cedula = '" + clientebuscar + "'";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                cboCliente.setSelectedItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            } else {
                cboCliente.setSelectedItem("Seleccione Cliente:");
                JOptionPane.showMessageDialog(null, "¡DNI del Cliente incorrecta o no encontrada!");
            }
            txtCliente_Buscar.setText("");
            this.txtCliente_Buscar.requestFocus();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al buscar Cliente!, " + e);
        }
    }//GEN-LAST:event_btn_Buacar_ClienteActionPerformed

    private void btn_Añadir_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Añadir_ProductoActionPerformed
//        String combo = this.cboProducto.getSelectedItem().toString();
//        //validar que seleccione un producto
//        if (combo.equalsIgnoreCase("Seleccione Producto:")) {
//            JOptionPane.showMessageDialog(null, "Seleccione un producto");
//        } else {
//            //validar que ingrese una cantidad
//            if (!txtCantidad.getText().isEmpty()) {
//                //validar que el usuario no ingrese caracteres no numericos
//                boolean validacion = validar(txtCantidad.getText());
//                if (validacion == true) {
//                    //validar que la cantidad sea mayor a cero
//                    if (Integer.parseInt(txtCantidad.getText()) > 0) {
//                        cantidad = Integer.parseInt(txtCantidad.getText());
//                        //ejecutar metodo para obtener datos del producto
//                        this.DatosDelProducto();
//                        //validar que la cantidad de productos seleccionados no sea mayor al stock de la base de datos
//                        if (cantidad <= cantidadProductoBBDD) {
//                            subtotal = precioUnitario * cantidad;
//                            totalpagar = subtotal + igv + descuento;
//
//                            // redondear a decimales
//                            subtotal = (double) Math.round(subtotal * 100) / 100;
//                            igv = (double) Math.round(igv * 100) / 100;
//                            descuento = (double) Math.round(descuento * 100) / 100;
//                            totalpagar = (double) Math.round(totalpagar * 100) / 100;
//
//                            //se crea un nuevo producto 
//                            producto = new DetalleVenta(auxIdDetalle, //idDetalleVenta
//                                    1, /*idCabecera*/
//                                    idProducto,
//                                    nombre,
//                                    Integer.parseInt(txtCantidad.getText()),
//                                    precioUnitario,
//                                    subtotal,
//                                    descuento,
//                                    igv,
//                                    totalpagar,
//                                    1//estado
//                            );
//                            //añadir a la lista
//                            listaProducto.add(producto);
////                            JOptionPane.showMessageDialog(null, "Producto agregado");
//                            auxIdDetalle++;
//                            txtCantidad.setText("");//Limpiar el campo
//                            //volver a cargar el combo producto
//                            this.CargarProducto();
//                            this.CalcularTotalPagar();
//                            txt_efectivo.setEnabled(true);
//                            btn_Calcular_cambio_02.setEnabled(true);
//                        } else {
//                            JOptionPane.showMessageDialog(null, "La cantidad supera al Stokc");
//
//                        }
//
//                    } else {
//                        JOptionPane.showMessageDialog(null, "La cantidad no puede ser cero ( 0 ), ni negativo");
//
//                    }
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "En la cantidad no se admiten caracteres no numericos");
//
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Ingresa la cantidad de Productos");
//            }
//            //llamar al metodo
//            this.ListaTabla_Producto();

    }//GEN-LAST:event_btn_Añadir_ProductoActionPerformed
int idArrayList =0;
    private void tbl_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProductosMouseClicked
      int fila_point = tbl_Productos.rowAtPoint(evt.getPoint());
        int columa_pint = 0;
        if (fila_point > -1) {
            idArrayList = (int) modeloDatosProductos.getValueAt(fila_point, columa_pint);
        }
        int opcion = JOptionPane.showConfirmDialog(null, "¿Eliminar Producto?");
        //opcion de confirmar dialog - (si = 0; no = 1; cancel = 2; close = -1)
        switch (opcion) {
            case 0: //presione si
                listaProducto.remove(idArrayList - 1);
                this.CalcularTotalPagar();
                this.ListaTabla_Producto();
                break;
            case 1: //presione no
                break;
            default: //sea que precione cancel (2) o  precione clouse (-1)
                break;
        } 
    }//GEN-LAST:event_tbl_ProductosMouseClicked

    private void txt_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cambioActionPerformed

    private void btn_Calcular_cambio_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Calcular_cambio_cambioActionPerformed
      if (!txt_efectivo.getText().isEmpty()) {
            //validamos que el usuario no ingrese otros caracteres no numericos
            boolean validacion = validarDouble(txt_efectivo.getText());
            if (validacion == true) {
                //vaidamos que el efectivo sea mayor a cero
                double efec = Double.parseDouble(txt_efectivo.getText().trim());
                double top = Double.parseDouble(txt_TotalPagar.getText().trim());

                if (efec < top) {
                    JOptionPane.showMessageDialog(null, "El dinero en efectivo no es suficiente");
                } else {
                    double cambio = (efec - top);
                    double cambi = (double) Math.round(cambio * 100d) / 100;
                    String camb = String.valueOf(cambi);
                    txt_cambio.setText(camb);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se admite caracterres no numericos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese dinero en efectivo para calcular cambio");

        }
    }//GEN-LAST:event_btn_Calcular_cambio_cambioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Añadir_Producto;
    private javax.swing.JButton btn_Buacar_Cliente;
    private javax.swing.JButton btn_Calcular_cambio_cambio;
    private javax.swing.JButton btn_ReguistrarVenta;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbl_Productos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente_Buscar;
    private javax.swing.JTextField txt_Descuento;
    private javax.swing.JTextField txt_Subtotal;
    private javax.swing.JTextField txt_TotalPagar;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_igv;
    // End of variables declaration//GEN-END:variables


    /*Metodo para cargar CLiente en el jCombobox*/
    private void CargarCliente() {
        Connection cn = Conexion.conexcion.conectar();
        String sql = "select * from tb_cliente";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cboCliente.removeAllItems();
            cboCliente.addItem("Seleccione Cliente");

            while (rs.next()) {
                cboCliente.addItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar Cliente: " + e);
        }

    }

    /*Metodo para cargar Producto en el jCombobox*/
    private void CargarProducto() {
        Connection cn = Conexion.conexcion.conectar();
        String sql = "select * from tb_producto";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            cboProducto.removeAllItems();
            cboProducto.addItem("Seleccione Producto");
            while (rs.next()) {
                cboProducto.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar Producto: " + e);
        }

    }

    /*Metodo para validar que el usuario no ingrese caracteres no */
    private boolean validar(String valor) {
        try {
            int num = Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /*Metodo para validar que el usuario no ingrese caracteres no */
    private boolean validarDouble(String valor) {
        try {
            double num = Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //METODO PARA MOSTRAR LOS DATOS DEL PRODUTO SELECIONADO
    private void DatosDelProducto() {
        try {
            String sql = "select * from tb_producto where nombre = '" + this.cboProducto.getSelectedItem() + "'";
            Connection cn = Conexion.conexcion.conectar();
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idProducto = rs.getInt("idProducto");
                nombre = rs.getString("nombre");
                cantidadProductoBBDD = rs.getInt("cantidad");
                precioUnitario = rs.getDouble("precio");
                porcentajeIGV = rs.getInt("porcentajeIgv");
                this.CalcularIGV(precioUnitario, porcentajeIGV);//calcular y retorna el igv
            }

        } catch (SQLException e) {
            System.out.println("Error al optener datos del producto" + e);
        }
    }

    //metodo para calcular el igv
    private double CalcularIGV(double precio, int porcentajeigv) {
        int p_igv = porcentajeigv;

        switch (p_igv) {
            case 0:
                igv = 0.0;
                break;
            case 16:
                igv = (precio * cantidad) * 0.16;
                break;
            case 18:
                igv = (precio * cantidad) * 0.18;
                break;
            default:
                break;
        }

        return igv;

    }

    //metodo para calcular el total a pagar de todos los productos agregados
    private void CalcularTotalPagar() {
        sub_total_general = 0;
        descuento_general = 0;
        igv_general = 0;
        totalpagar_general = 0;

        for (DetalleVenta elemento : listaProducto) {
            sub_total_general += elemento.getSubtotal();
            descuento_general += elemento.getDescuento();
            igv_general += elemento.getIgv();
            totalpagar_general += elemento.getTotalapagar();
        }
        //redondear los decimales
        sub_total_general = (double) Math.round(sub_total_general * 100) / 100;
        igv_general = (double) Math.round(igv_general * 100) / 100;
        descuento_general = (double) Math.round(descuento_general * 100) / 100;
        totalpagar_general = (double) Math.round(totalpagar_general * 100) / 100;

        //enviar datos a la vista
        txt_Subtotal.setText(String.valueOf(sub_total_general));
        txt_Descuento.setText(String.valueOf(descuento_general));
        txt_igv.setText(String.valueOf(igv_general));
        txt_TotalPagar.setText(String.valueOf(totalpagar_general));

    }

}

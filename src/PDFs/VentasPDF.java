
package PDFs;
import InternalFrame.FACTURA_01;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class VentasPDF {
    
    private String nombreCliente;
    private String DniCliente;
    private String telefonoCliente;
    private String direccionCliente;
    
    private String fechaActual = "";
    private String NombreArchivoPDF;
    
    //METODO PARA OBTENER DATOS DEL CLIENTE
    
    public void DatosdelCliente(int idCliente){
        Connection cn = Conexion.conexcion.conectar();
        String sql= "select * from tb_cliente where idCliente = '" + idCliente + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                nombreCliente = rs.getString("nombre") + " " + rs.getString("apellido");
                DniCliente = rs.getString("cedula");
                telefonoCliente = rs.getString("telefono");            
                direccionCliente = rs.getString("direccion"); 
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener datos del cliente: // " + e);
        }
    }
    
    //  METODO PARA GENERAR FACTURA DE VENTA
     
    public void GenerarFacturaPDF(){
        try {
            
            // cargar la fecha actual
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
            
            //cambiar el formato de la fecha de ( / ) a ( _ )
            
            String fechanueva="";
            for (int i = 0; i < fechaActual.length(); i++){
                if(fechaActual.charAt(i) == '/'){
                    fechanueva = fechaActual.replace("/", "_");
                }
            }
            
            NombreArchivoPDF = "Venta_" + nombreCliente + "_" + fechanueva + "." ;
            
            FileOutputStream archivo;
            File file = new File("src/pdf_archivoventa/" + NombreArchivoPDF);
            archivo = new FileOutputStream(file);
            
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            Image img = Image.getInstance("src/Imagenes/new logo de empresa.png");
            Paragraph fechaop = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fechaop.add(Chunk.NEWLINE); // agregar nueva linea
            fechaop.add("Factura: 001" + "\nFecha: " + fechaActual + "\n\n");
            
            PdfPTable ENCABEZADO = new PdfPTable(4);
            ENCABEZADO.setWidthPercentage(100);
            ENCABEZADO.getDefaultCell(). setBorder(0); // quitar el borde de la tabla
            // tamaño de las celdas
            float [] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            ENCABEZADO.setWidths(ColumnaEncabezado);
            ENCABEZADO.setHorizontalAlignment(Element.ALIGN_LEFT);
            //ageregar celdas
            ENCABEZADO.addCell(img);
            
            String ruc="09874561231321";
            String nombre="Electro-Admin";
            String telefono="956123008";
            String direccion="Santa Clara";
            
            ENCABEZADO.addCell(""); // celda vacia
            ENCABEZADO.addCell("RUC: " + ruc + "\nNOMBRE: " + nombre+"\nTELEFONO: " + telefono+"\nDIRECCION: " + direccion);
            ENCABEZADO.addCell(fechaop);
            doc.add(ENCABEZADO);
            
            
            // cuerpo
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE); // nueva linea
            cliente.add("Datos del cliente: " + "\n\n");
            doc.add(cliente);
            
            //DATOS DEL CLIENTE
            PdfPTable tablacliente = new PdfPTable(4);
            tablacliente.setWidthPercentage(100);
            tablacliente.getDefaultCell().setBorder(0);
            //tamaño de celdas
             float [] ColumnaCliente = new float[]{25f, 45f, 30f, 40f};
            tablacliente.setWidths(ColumnaCliente);
             tablacliente.setHorizontalAlignment(Element.ALIGN_LEFT);
             
             PdfPCell cliente1 = new PdfPCell(new Phrase("Dni/RUC: ", negrita));
             PdfPCell cliente2 = new PdfPCell(new Phrase("Nombre: ", negrita));
             PdfPCell cliente3 = new PdfPCell(new Phrase("Telefono: ", negrita));
             PdfPCell cliente4 = new PdfPCell(new Phrase("Direccion: ", negrita));
             //quitar bordes
             cliente1.setBorder(0);
             cliente2.setBorder(0);
             cliente3.setBorder(0);
             cliente4.setBorder(0);
             //agregar celda a al tabla
             tablacliente.addCell(cliente1);
             tablacliente.addCell(cliente2);
             tablacliente.addCell(cliente3);
             tablacliente.addCell(cliente4);
             tablacliente.addCell(DniCliente);
             tablacliente.addCell(nombreCliente);
             tablacliente.addCell(telefonoCliente);
             tablacliente.addCell(direccionCliente);
             //agregar al documento
             doc.add(tablacliente);
             //     ESPACIO EN BLANCO EN LA TABLA
             Paragraph espacio = new Paragraph();
             espacio.add(Chunk.NEWLINE);
             espacio.add("");
             espacio.setAlignment(Element.ALIGN_CENTER);
             doc.add(espacio);
             
             //AGREGAR LOS PRODUCTOS
             PdfPTable tableProducto = new PdfPTable(4);
             tableProducto.setWidthPercentage(100);
            tableProducto.getDefaultCell().setBorder(0);
             float [] ColumnaProcucto = new float[]{50f, 15f, 15f, 20f};
             tableProducto.setWidths(ColumnaProcucto);
             tableProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
             PdfPCell producto1 = new PdfPCell(new Phrase("Descripcion: ", negrita));
             PdfPCell producto2 = new PdfPCell(new Phrase("Cantidad: ", negrita));
             PdfPCell producto3 = new PdfPCell(new Phrase("Precio Unitario: ", negrita));
             PdfPCell producto4 = new PdfPCell(new Phrase("Precio Total: ", negrita));
             //quitar borde
              producto1.setBorder(0);
             producto2.setBorder(0);
             producto3.setBorder(0);
             producto4.setBorder(0);
             //AGREGAR COLOR AL ENCABEZADO DEL PRODUCTO
             producto1.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto2.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto3.setBackgroundColor(BaseColor.LIGHT_GRAY);
             producto4.setBackgroundColor(BaseColor.LIGHT_GRAY);
             //ageregar la celda a la tabla
             tableProducto.addCell(producto1);
             tableProducto.addCell(producto2);
             tableProducto.addCell(producto3);
             tableProducto.addCell(producto4);
            
             for(int i = 0; i<FACTURA_01.tbl_Productos.getRowCount(); i++){
                 String producto = FACTURA_01.tbl_Productos.getValueAt(i, 1).toString();
                 String cantidad = FACTURA_01.tbl_Productos.getValueAt(i, 2).toString();
                 String precio = FACTURA_01.tbl_Productos.getValueAt(i, 3).toString();
                 String total = FACTURA_01.tbl_Productos.getValueAt(i, 7).toString();
                 
                 tableProducto.addCell(producto);
                 tableProducto.addCell(cantidad);
                 tableProducto.addCell(precio);
                 tableProducto.addCell(total);
                 
             }
             
             //agregar al documento
             doc.add(tableProducto);
             
             //Total a pagar
            Paragraph info = new Paragraph();
             info.add(Chunk.NEWLINE);
             info.add("Total a pagar: " + FACTURA_01.txt_TotalPagar.getText());
             info.setAlignment(Element.ALIGN_RIGHT);
             doc.add(info);
             
             //firma
             Paragraph firma = new Paragraph();
             firma.add(Chunk.NEWLINE);
             firma.add("Cancelacion y Firma \n\n ");
             firma.add("_____________________");
             firma.setAlignment(Element.ALIGN_CENTER);
             doc.add(firma);
             
             //MENSAJE
             Paragraph mensaje = new Paragraph();
             mensaje.add(Chunk.NEWLINE);
             mensaje.add("¡Gracias por su compra!" );
             mensaje.setAlignment(Element.ALIGN_CENTER);
             doc.add(mensaje);
             
             //cerrar el documento y el archivo
             doc.close();
             archivo.close();
             
             //abrir el documento al ser generado automaticamente
             Desktop.getDesktop().open(file);
             
        } catch (DocumentException  |  IOException e) {
            System.out.println("Error en: // " + e);
        }
    }
}

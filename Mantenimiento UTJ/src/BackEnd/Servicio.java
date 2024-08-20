/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo Arturo Gutiérrez Hernández
 */
public class Servicio {
    
    //Variables
    private int id;
    private String tipoServicio;
    private String piso;
    private String area;
    private String elemento;
    private String descripcion;
    private LocalDate fecha = LocalDate.now();
    private String operador;
    private String rutaImagen;
    //private byte[] image;
    
    //Constructor vacío

    public Servicio() {
    }
    
    //Constructor con parametros

    public Servicio(int id, String tipoServicio, String piso, String area, String elemento, String descripcion, LocalDate fecha, String operador, String rutaImagen ) {
        this.id = id;
        this.tipoServicio = tipoServicio;
        this.piso = piso;
        this.area = area;
        this.elemento = elemento;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.operador = operador;
        this.rutaImagen = rutaImagen;
        //this.image = loadImage(rutaImagen);
    }
    
    //Setters y getters
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public String getOperador(){
        return operador;
    }
    
    public void setOperador(String operador){
        this.operador = operador;
    }
    
    public String getRutaImagen(){
        return rutaImagen;
    }
    
    public void setRutaImagen(String rutaImagen){
        this.rutaImagen = rutaImagen;
    }
    
    /*public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }*/
    
    //Metodos
    
    // Método para cargar la imagen desde la ruta proporcionada
    private byte[] loadImage(String rutaImagen) {
        try {
            File file = new File(rutaImagen);
            byte[] imageData = new byte[(int) file.length()];
            try (FileInputStream archivoFoto = new FileInputStream(file)) {
                archivoFoto.read(imageData);
            }
            return imageData;
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo de imagen no encontrado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Void GuardarServicio(){        
         // Asignar la fecha actual si no está configurada
    this.fecha = LocalDate.now();

    Conexion mysql = new Conexion();
    Connection conex = mysql.conectar();
    String sSQL = "";
    sSQL = "INSERT INTO servicio(id, tipoServicio, piso, area, elemento, descripcion, fecha, operador, rutaImagen)"
            + "VALUES(?,?,?,?,?,?,?,?,?)";
    
    FileInputStream archivoFoto = null;
    
    try {
        PreparedStatement service = (PreparedStatement) conex.prepareStatement(sSQL);
        service.setInt(1, this.id);
        service.setString(2, this.tipoServicio);
        service.setString(3, this.piso);
        service.setString(4, this.area);
        service.setString(5, this.elemento);
        service.setString(6, this.descripcion);
        service.setDate(7, Date.valueOf(this.fecha));
        service.setString(8, this.operador);
        service.setString(9, this.rutaImagen);
        int n = service.executeUpdate();
        if (n > 0) {
            JOptionPane.showMessageDialog(null, "El registro se ingresó", "", JOptionPane.INFORMATION_MESSAGE);
        } 
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al ingresar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    return null;
    }
        return null;
    };
    
    
    //Metodo modificar servicio--------------------------------------------------------------------------------------------------
   /* public String ModificarServicio(){
        String mensaje="";
                 
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se pudo conectar";
        }else{
            try {
            String instruccionSQL= "UPDATE servicio SET tipoServicio = ?,piso = ?, area=?, elemento=?, descripcion=?, fecha=?, operador=?, rutaImagen=?  WHERE Id=?";
                 PreparedStatement comando = conexion.getConex().prepareStatement(instruccionSQL);
                 comando.setString(1, tipoServicio);
                 comando.setString(2, piso);
        r         comando.setString(3, area);     
                 comando.setString(4, elemento); 
                 comando.setString(5, descripcion); 
                 comando.setDate(6, Date.valueOf(this.fecha)); 
                 comando.setString(7, operador);
                 comando.setString(8, rutaImagen);
                 comando.setInt(9, id);
                 int fila = comando.executeUpdate();
                 mensaje= fila + " registro ";
            } catch (SQLException ex) {
               mensaje= "Error al intentar modificar"+ex.getMessage();
            }
           
        }
        return mensaje;
    };*/
    
    //Metodo Eliminar servicio---------------------------------------------------------------------------------------------------
    /*public void EliminarServicio(int codigo){
        String mensaje="";
    
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se pudo conectar";
        }else{
            try {
            String instruccionSQL="delete from servicio where id=?";  
            PreparedStatement comando = conexion.getConex().prepareStatement(instruccionSQL);
            comando.setInt(1, codigo);
            comando.executeUpdate();

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error "+ex, "Error", JOptionPane.ERROR_MESSAGE);
            }      
        }
    };*/

    //Metodo consultar servicio------------------------------------------------------------------------------------------
    public String ConsultarServicio(DefaultTableModel tabla) {
    String mensaje = "";
    String[] etiquetas = {"id","Tipo de Servicio", "Piso", "Área", "Elemento", "Descripción", "Fecha", "Operador", "Imagen"};
    tabla.setColumnIdentifiers(etiquetas);

    Conexion conexion = new Conexion();
    Connection conn = conexion.conectar();
    if (conn == null) { 
        mensaje = "No se pudo conectar";
    } else {
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try {
            String instruccionSQL = "SELECT * FROM servicio ORDER BY id DESC";
            comando = conn.prepareStatement(instruccionSQL);
            resultado = comando.executeQuery();
            while (resultado.next()) {
                String[] fila = new String[9];
                fila[0] = resultado.getString("id");
                fila[1] = resultado.getString("tipoServicio");
                fila[2] = resultado.getString("piso");
                fila[3] = resultado.getString("area");
                fila[4] = resultado.getString("elemento");
                fila[5] = resultado.getString("descripcion");
                fila[6] = resultado.getString("fecha");
                fila[7] = resultado.getString("operador");
                fila[8] = resultado.getString("rutaImagen");
                tabla.addRow(fila);
            }
        } catch (SQLException ex) {
            mensaje = "Error al intentar consultar los productos";
            ex.printStackTrace();
        } finally {
            try {
                if (resultado != null) resultado.close();
                if (comando != null) comando.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            conexion.desconectar(); // Cierra la conexión aquí
        }
    }
    return mensaje;
}       
    
    //Metodo busqueda de servicio---------------------------------------------------------------------------------------------
    /*public void busquedaServicio(int codigo){
         String mensaje="";
    
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se pudo conectar";
        }else{
            try {
            String instruccionSQL="select * from servicio where id=?";
                PreparedStatement comando = conexion.getConex().prepareStatement(instruccionSQL);
                 comando.setInt(1, codigo);
                ResultSet resultado= comando.executeQuery();
                //desempaquetar o abrir el resultado para sacar la información
                if(resultado.next()){
                    id = resultado.getInt("id");
                    tipoServicio = resultado.getString("tipoServicio");
                    piso = resultado.getString("piso");
                    area = resultado.getString("area");
                    elemento = resultado.getString("elemento");
                    descripcion = resultado.getString("descripcion");
                    //fecha = resultado.getDate(String.valueOf("fecha"));
                    operador = resultado.getString("operador");
                    rutaImagen = resultado.getString("rutaImagen");
                }else{
                    mensaje= "Codigo de cliente no encontrado";
                 
                }
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error "+ex, "Error", JOptionPane.ERROR_MESSAGE);
            }      
        }
    };*/
    
     /*public Image obtenerImagenPorId(int id) {
    Image imagen = null;
    Conexion conexion = new Conexion();
    try {
        String instruccionSQL = "SELECT image FROM servicio WHERE id = ?";
        PreparedStatement comando = conexion.getConex().prepareStatement(instruccionSQL);
        comando.setInt(1, id);
        ResultSet resultado = comando.executeQuery();
        if (resultado.next()) {
            InputStream input = resultado.getBinaryStream("image");
            if (input != null) {
                BufferedImage img = ImageIO.read(input);
                imagen = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Ajusta el tamaño según necesites
            }
        }
        resultado.close();
        comando.close();
    } catch (SQLException | IOException ex) {
        ex.printStackTrace();
    } finally {
        conexion.desconectar(); // Asegúrate de manejar correctamente la conexión y cierre de recursos
    }
    return imagen;
}*/

   
}

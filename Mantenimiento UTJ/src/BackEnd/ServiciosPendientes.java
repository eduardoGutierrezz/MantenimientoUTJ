/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo Arturo Gutiérrez Hernández
 */
public class ServiciosPendientes {
    
    //Variables
    private int id;
    private String piso;
    private String area;
    private String servicio;
    private String elemento;
    private String descripcion;
    private String operador;
    private LocalDate fecha = LocalDate.now();
    private int status;
    
    //Contrcutor vacio

    public ServiciosPendientes() {
    }
    
    //Constructor con parametros

    public ServiciosPendientes(int id, String piso, String area, String servicio, String elemento, String descripcion, String operador,LocalDate fecha, int status) {
        this.id = id;
        this.piso = piso;
        this.area = area;
        this.servicio = servicio;
        this.elemento = elemento;
        this.descripcion = descripcion;
        this.operador = operador;
        this.fecha = fecha;
        this.status = status;
    }
    
    //Setters y getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
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

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public int getStatus(){
        return status;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    
    
    //Metodos-------------------------------------------------------------------------------------------------------------------------------
    
    //Metodo Guardar servicio---------------------------------------------------------------------------------------------------------------
    public Void GuardarServicio(){        
         // Asignar la fecha actual si no está configurada
    this.fecha = LocalDate.now();

    Conexion mysql = new Conexion();
    Connection conex = mysql.conectar();
    String sSQL = "";
    sSQL = "INSERT INTO serviciospendientes(id, piso, area, servicio, elemento, descripcion, fecha, operador, status)"
            + "VALUES(?,?,?,?,?,?,?,?,1)";
    
    FileInputStream archivoFoto = null;
    
    try {
        PreparedStatement service = (PreparedStatement) conex.prepareStatement(sSQL);
        service.setInt(1, this.id);
        service.setString(2, this.piso);
        service.setString(3, this.area);
        service.setString(4, this.servicio);
        service.setString(5, this.elemento);
        service.setString(6, this.descripcion);
        service.setDate(7, Date.valueOf(this.fecha));
        service.setString(8, this.operador);
        
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
    
    //Metodo consultar servicio--------------------------------------------------------------------------------------------------
    public String ConsultarServiciospendientes(DefaultTableModel tabla) {
    String mensaje = "";
    String[] etiquetas = {"id","Tipo de Servicio", "Piso", "Área", "Elemento", "Descripción", "Fecha", "Operador"};
    tabla.setColumnIdentifiers(etiquetas);

    Conexion conexion = new Conexion();
    Connection conn = conexion.conectar();
    if (conn == null) { 
        mensaje = "No se pudo conectar";
    } else {
        PreparedStatement comando = null;
        ResultSet resultado = null;
        try {
            String instruccionSQL = "SELECT id, piso, area, servicio, elemento, descripcion, fecha, operador FROM serviciospendientes WHERE status = 1 ORDER BY id DESC";
            comando = conn.prepareStatement(instruccionSQL);
            resultado = comando.executeQuery();
            while (resultado.next()) {
                String[] fila = new String[8];
                fila[0] = resultado.getString("id");
                fila[1] = resultado.getString("piso");
                fila[2] = resultado.getString("area");
                fila[3] = resultado.getString("servicio");
                fila[4] = resultado.getString("elemento");
                fila[5] = resultado.getString("descripcion");
                fila[6] = resultado.getString("fecha");
                fila[7] = resultado.getString("operador");
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
    
    public void eliminarServicio(int codigo) {
    Conexion conexion = new Conexion();
    Connection conex = conexion.conectar();
    if (conex == null) {
        JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            String instruccionSQL = "UPDATE serviciospendientes SET status = 0 WHERE id = ?";
            PreparedStatement comando = conex.prepareStatement(instruccionSQL);
            comando.setInt(1, codigo);
            int filasAfectadas = comando.executeUpdate();
            
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "El servicio ha sido marcado como completado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el servicio con el ID proporcionado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado del servicio: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (conex != null) {
                    conex.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

    
    //Metodo modificar servicio--------------------------------------------------------------------------------------------------
   public String ModificarServicio(){
        String mensaje="";
                 
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se pudo conectar";
        }else{
            try {
            String instruccionSQL= "UPDATE serviciospendientes SET piso = ?, area=?,Servicio = ?, elemento=?, descripcion=?, fecha=?, operador=?  WHERE Id=?";
                 PreparedStatement comando = conexion.getConex().prepareStatement(instruccionSQL);
                 comando.setString(1, piso);
                 comando.setString(2, area);
                 comando.setString(3, servicio);     
                 comando.setString(4, elemento); 
                 comando.setString(5, descripcion); 
                 comando.setDate(6, Date.valueOf(this.fecha)); 
                 comando.setString(7, operador);
                 comando.setInt(8, id);
                 int fila = comando.executeUpdate();
                 mensaje= fila + " registro ";
            } catch (SQLException ex) {
               mensaje= "Error al intentar modificar"+ex.getMessage();
            }
           
        }
        return mensaje;
    };
   
    
}

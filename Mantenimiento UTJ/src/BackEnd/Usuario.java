/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Arturo Gutièrrez Hernàndez
 */
public class Usuario {
    
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasenia;

    //Constructor vacìo
    public Usuario() {
    }
    
   //Constructor con parametros 

    public Usuario(int id, String nombre, String apellidos, String correo, String contrasenia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }
    
    //Setters y getters para el objeto
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    //Metodos
    
    //Metodo para guardar un nuevo usuario------------------------------------------------------------------------------------
    public Void GuardarUsuario(){
        Conexion mysql = new Conexion();
        Connection conex = mysql.conectar();
        String sSQL="";
        sSQL="INSERT INTO usuario(id,nombre,apellidos,correo,contrasenia)"
                + "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement service = (PreparedStatement) conex.prepareStatement(sSQL);
            service.setInt(1, this.id);
            service.setString(2, this.nombre);
            service.setString(3, this.apellidos);
            service.setString(4, this.correo);
            service.setString(5, this.contrasenia);
            int n = service.executeUpdate();
            //CargarTabla(id);
            if(n>0){
                JOptionPane.showMessageDialog(null, "El registro se ingreso", "", JOptionPane.INFORMATION_MESSAGE);
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al "+ex, "ingresar", JOptionPane.INFORMATION_MESSAGE);
        }
        return null;
    };
    
    //Metodo para modificar la contraseña del usuario--------------------------------------------------------------------------
    public String ModificarUsuario(int id, String nuevaContrasenia) {
    String mensaje = "";
                 
    Conexion conexion = new Conexion();
    if (conexion.conectar() == null) {
        mensaje = "No se pudo conectar";
    } else {
        try {
            String instruccionSQL = "UPDATE usuario SET contrasenia = ? WHERE id = ?";
            PreparedStatement comando = conexion.getConex().prepareStatement(instruccionSQL);
            comando.setString(1, nuevaContrasenia); 
            comando.setInt(2, id);
            int fila = comando.executeUpdate();
            mensaje = fila + " registro actualizado";
        } catch (SQLException ex) {
            mensaje = "Error al intentar modificar: " + ex.getMessage();
        }
    }
    return mensaje;
}

    
    //Metodo para asignar el siguiente id------------------------------------------------------------------------------------
    public int obtenerSiguienteId(){
        String mensaje="";
        int idSiguiente=0;
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se pudo conectar";
        }else{
            try {
            String instruccionSQL="select * from usuario order by id desc limit 1;";
                PreparedStatement comando = conexion.getConex().prepareStatement(instruccionSQL);
                ResultSet resultado= comando.executeQuery();
                //desempaquetar o abrir el resultado para sacar la información
                if(resultado.next()){
                    idSiguiente = resultado.getInt("id");
                }else{
                    mensaje= "Codigo de servicio no encontrado";
                }
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error "+ex, "Error", JOptionPane.ERROR_MESSAGE);
            }      
        }
        return idSiguiente+1;
    };
    
    //Metodo para el inicio de sesión---------------------------------------------------------------------------------------------
    public boolean autenticar(String nombreUsuario, String contrasenia) {
    Conexion mysql = new Conexion();
    Connection conex = mysql.conectar();
    String sSQL = "SELECT * FROM usuario WHERE correo = ? AND contrasenia = ?";
    
    try {
        PreparedStatement service = conex.prepareStatement(sSQL);
        service.setString(1, nombreUsuario);
        service.setString(2, contrasenia);
        ResultSet resultado = service.executeQuery();
        
        return resultado.next(); // Retorna true si hay un resultado, es decir, credenciales válidas.
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al autenticar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    
        //Metodo para buscar un usuario----------------------------------------------------------------------------------------------
        public void busquedausuario(String correo){
         String mensaje="";
    
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se pudo conectar";
        }else{
            try {
            String instruccionSQL="select * from usuario where correo=?";
                PreparedStatement comando = conexion.getConex().prepareStatement(instruccionSQL);
                 comando.setString(1, correo);
                ResultSet resultado= comando.executeQuery();
                //desempaquetar o abrir el resultado para sacar la información
                if(resultado.next()){
                    id = resultado.getInt("id");
                    nombre = resultado.getString("nombre");
                    apellidos = resultado.getString("apellidos");
                    
                    contrasenia = resultado.getString("contrasenia");
                }else{
                    mensaje= "Correo de usuario no encontrado";
                 
                }
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error "+ex, "Error", JOptionPane.ERROR_MESSAGE);
            }      
        }
    };
    
}

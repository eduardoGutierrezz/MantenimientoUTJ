package BackEnd;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private String usua, contra, baseDeDatos, url;
    private Connection conex;

    public Connection getConex() {
        return conex;
    }

    public void setConex(Connection conex) {
        this.conex = conex;
    }

    public Connection conectar() {
        baseDeDatos = "area_de_mantenimiento";
        url = "jdbc:mysql://localhost:3306/" + baseDeDatos + "?useSSL=false&serverTimezone=UTC";
        usua = "root";
        contra = "";

        try {
            // El controlador se carga automáticamente
            conex = DriverManager.getConnection(url, usua, contra);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + ex.getMessage());
        }
        return conex;
    }

    public void desconectar() {
        try {
            if (conex != null && !conex.isClosed()) {
                conex.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al desconectar");
        }
    }
    
    public Usuario validarInicioDeSesion(String correo, String contrasenia) {
    Usuario usuario = null; // Variable para almacenar el usuario autenticado
    Conexion conexion = new Conexion(); // Instancia de la clase de conexión
    Connection conn = conexion.conectar(); // Conectar a la base de datos

    if (conn != null) {
        // Simulación de consulta a la base de datos
        String consulta = "SELECT * FROM usuario WHERE correo = ? AND contrasenia = ?";
        
        try (PreparedStatement stmt = conn.prepareStatement(consulta)) {
            stmt.setString(1, correo);
            stmt.setString(2, contrasenia);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                // Si se encuentra un usuario, crea un objeto Usuario con sus datos
                usuario = new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("correo"), rs.getString("contrasenia"));
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores
        } finally {
            conexion.desconectar(); // Desconectar después de la consulta
        }
    }

    return usuario; // Devuelve el usuario o null si no se encontró
}

}

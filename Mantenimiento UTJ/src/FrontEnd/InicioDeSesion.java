/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Usuario;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Arturo Gutiérrez Hernández
 */
public class InicioDeSesion extends javax.swing.JFrame {
    
    //Objeto usuario
    Usuario usuario = new Usuario();
    public static String correo;

    //Declaración de menus para la navegación entre paginas.
    private NuevoUsuario FormRegistrate;
    private MenuPrincipal FormMenuPrincipal;
    
    //Objetos para las imagenes
    private ImageIcon imagen;
    private Icon icono;
    
    public InicioDeSesion() {
        initComponents();
        // Obtener el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Establecer el tamaño del JFrame al tamaño de la pantalla
        this.setSize(screenSize.width, screenSize.height);

        // Opcional: Establecer la posición del JFrame en la esquina superior izquierda
        this.setLocation(0, 0);
        
        //Ajustando el tamaño de las imagenes
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.lblFondoAzul, "src/Imagenes/verdeUtj_1.png");
        this.pintarImagen(this.lblondoMorado, "src/Imagenes/fondoMorado.png");
        this.pintarImagen(this.lblBarraVerdeADM, "src/Imagenes/verdeUtj.png");
        
        lblRegistrateAqui.setText("<html><u>Si no tienes cuenta, registrate aquí</u></html>");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        pnlBlanco = new javax.swing.JPanel();
        pnlBlancoSuperiror = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        tgbOjo = new javax.swing.JToggleButton();
        txtContraseña = new javax.swing.JPasswordField();
        lblAreaMantenimiento = new javax.swing.JLabel();
        lblBarraVerdeADM = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFondoAzul = new javax.swing.JLabel();
        lblondoMorado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLogoUtj = new javax.swing.JLabel();
        lblRegistrateAqui = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio-de-sesion-de-usuario.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlBlanco.setBackground(new java.awt.Color(255, 255, 255));
        pnlBlanco.setPreferredSize(new java.awt.Dimension(1970, 960));
        pnlBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBlancoSuperiror.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/area-restringida (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlBlancoSuperirorLayout = new javax.swing.GroupLayout(pnlBlancoSuperiror);
        pnlBlancoSuperiror.setLayout(pnlBlancoSuperirorLayout);
        pnlBlancoSuperirorLayout.setHorizontalGroup(
            pnlBlancoSuperirorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlancoSuperirorLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(707, Short.MAX_VALUE))
        );
        pnlBlancoSuperirorLayout.setVerticalGroup(
            pnlBlancoSuperirorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlancoSuperirorLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBlanco.add(pnlBlancoSuperiror, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        pnlBlanco.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, 350, -1));

        lblUsuario.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario:");
        pnlBlanco.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña:");
        pnlBlanco.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Calibri", 1, 34)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        btnIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        pnlBlanco.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 760, 270, 110));

        tgbOjo.setBackground(new java.awt.Color(255, 255, 255));
        tgbOjo.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        tgbOjo.setForeground(new java.awt.Color(0, 0, 0));
        tgbOjo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486564721-eye_81533.png"))); // NOI18N
        tgbOjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbOjoActionPerformed(evt);
            }
        });
        pnlBlanco.add(tgbOjo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 650, 40, 50));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 0, 0));
        pnlBlanco.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 650, 320, -1));

        lblAreaMantenimiento.setFont(new java.awt.Font("Calibri", 1, 72)); // NOI18N
        lblAreaMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblAreaMantenimiento.setText("Área de mantenimiento CCD");
        pnlBlanco.add(lblAreaMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 860, 90));

        lblBarraVerdeADM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeUtj.png"))); // NOI18N
        pnlBlanco.add(lblBarraVerdeADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 2010, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1-94_icon-icons.com_65652.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        pnlBlanco.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 250, 270));

        lblFondoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeUtj_1.png"))); // NOI18N
        lblFondoAzul.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pnlBlanco.add(lblFondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 1030, 550));

        lblondoMorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMorado.png"))); // NOI18N
        lblondoMorado.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        pnlBlanco.add(lblondoMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 1070, 590));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("¡Bienvenido!");
        pnlBlanco.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        lblLogoUtj.setBackground(new java.awt.Color(255, 255, 255));
        lblLogoUtj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoUTJ.png"))); // NOI18N
        pnlBlanco.add(lblLogoUtj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 30, 515, 73));

        lblRegistrateAqui.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblRegistrateAqui.setForeground(new java.awt.Color(0, 0, 255));
        lblRegistrateAqui.setText("Si no tienes cuenta, registrate aquí");
        lblRegistrateAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrateAquiMouseClicked(evt);
            }
        });
        pnlBlanco.add(lblRegistrateAqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 960, 360, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1970, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        pnlBlanco.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 1970, 142));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBlanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBlanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String nombreUsuario = txtUsuario.getText();
        String contrasenia = new String(txtContraseña.getPassword()); // Obtener la contraseña correctamente
     
        // Llama al método de autenticación
        if (usuario.autenticar(nombreUsuario, contrasenia)) {
            dispose(); // Cierra la ventana de inicio de sesión
            FormMenuPrincipal = new MenuPrincipal();
            FormMenuPrincipal.setVisible(true); // Muestra la ventana principal
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado:\nPor favor ingrese un usuario y/o contraseña correctos", 
                    "", JOptionPane.ERROR_MESSAGE);
            txtContraseña.setText("");
            txtUsuario.setText("");
        }
        correo=nombreUsuario;
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        //evento para que solo se permitan entredas de letras en el txtUsuario
        char caracter = evt.getKeyChar();
        if(!Character.isLetter(caracter)){
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void tgbOjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbOjoActionPerformed
        if (tgbOjo.isSelected()) {
        txtContraseña.setEchoChar((char) 0); // Mostrar las letras
    } else {
        txtContraseña.setEchoChar('*'); // Ocultar las letras
    }
    }//GEN-LAST:event_tgbOjoActionPerformed

    private void lblRegistrateAquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrateAquiMouseClicked
        dispose();
        FormRegistrate = new NuevoUsuario();
        FormRegistrate.setVisible(true);
    }//GEN-LAST:event_lblRegistrateAquiMouseClicked

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
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeSesion().setVisible(true);
            }
        });
    }
    
    //Metodo para cambiar de tamaño las imagenes
        private void pintarImagen(JLabel lblPBU, String root){
            this.imagen = new ImageIcon(root);
            this.icono = new ImageIcon(
                    this.imagen.getImage().getScaledInstance(
                            lblPBU.getWidth(), 
                            lblPBU.getHeight(), 
                            Image.SCALE_DEFAULT)
            );
            lblPBU.setIcon(this.icono);
            this.repaint();
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAreaMantenimiento;
    private javax.swing.JLabel lblBarraVerdeADM;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondoAzul;
    private javax.swing.JLabel lblLogoUtj;
    private javax.swing.JLabel lblRegistrateAqui;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblondoMorado;
    private javax.swing.JPanel pnlBlanco;
    private javax.swing.JPanel pnlBlancoSuperiror;
    private javax.swing.JToggleButton tgbOjo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

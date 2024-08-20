/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.ServiciosPendientes;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.nio.file.Path;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Arturo Gutiérrez Hernández
 */
public class TareasPendientes extends javax.swing.JFrame {
    
    //Frame para la navegacion entre páginas
    private MenuTareasPendientes FormMenuTareasPendientes;
    
    //Objeto ServiciosPendientes
    ServiciosPendientes serviciosPendientes = new ServiciosPendientes();
    
    //Objetos para las imagenes
    private ImageIcon imagen;
    private Icon icono;

    /**
     * Creates new form TareasPendientes
     */
    public TareasPendientes() {
        initComponents();
        
        // Obtener el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Establecer el tamaño del JFrame al tamaño de la pantalla
        this.setSize(screenSize.width, screenSize.height);

        // Opcional: Establecer la posición del JFrame en la esquina superior izquierda
        this.setLocation(0, 0);
        
        //
        this.setLocationRelativeTo(this);
        //this.pintarImagen(this.lblLogoUtj, "src/Imagenes/pbuno.png");
        this.pintarImagen(this.lblBarraVerde, "src/Imagenes/verdeUtj.png");
        this.pintarImagen(this.lblondoMorado, "src/Imagenes/fondoMorado.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCocinas = new javax.swing.JLabel();
        lblBarraVerde = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblEscribeElElemento = new javax.swing.JLabel();
        lblEscribeElTipoDeServicio = new javax.swing.JLabel();
        lblEscribeElPiso = new javax.swing.JLabel();
        lblAgregaUnaDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAgregaUnaDescripcion = new javax.swing.JTextArea();
        lblSeleccionaUnArea1 = new javax.swing.JLabel();
        lblEscribeTuNombre = new javax.swing.JLabel();
        txtEscribeTuNombre = new javax.swing.JTextField();
        txtEscribeElElemento = new javax.swing.JTextField();
        txtEscribeElPiso = new javax.swing.JTextField();
        txtEscribeElArea = new javax.swing.JTextField();
        txtEscribeElServicio = new javax.swing.JTextField();
        btnGuardar2 = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        lblondoMorado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1970, 968));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCocinas.setFont(new java.awt.Font("Calibri", 1, 72)); // NOI18N
        lblCocinas.setForeground(new java.awt.Color(255, 255, 255));
        lblCocinas.setText("Agrega una tarea pendiente");
        jPanel1.add(lblCocinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 870, 110));

        lblBarraVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeUtj.png"))); // NOI18N
        jPanel1.add(lblBarraVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1970, 130));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1970, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 1970, 142));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/area-restringida (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoUTJ.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, -1, -1));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 870, 121, 98));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        lblEscribeElElemento.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblEscribeElElemento.setForeground(new java.awt.Color(255, 255, 255));
        lblEscribeElElemento.setText("Escribe el elemento:");

        lblEscribeElTipoDeServicio.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblEscribeElTipoDeServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblEscribeElTipoDeServicio.setText("Escribe el tipo de servicio:");

        lblEscribeElPiso.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblEscribeElPiso.setForeground(new java.awt.Color(255, 255, 255));
        lblEscribeElPiso.setText("Escribe el piso:");

        lblAgregaUnaDescripcion.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblAgregaUnaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregaUnaDescripcion.setText("Agrega una descripción del servicio:");
        lblAgregaUnaDescripcion.setMaximumSize(new java.awt.Dimension(950, 455));
        lblAgregaUnaDescripcion.setMinimumSize(new java.awt.Dimension(950, 455));
        lblAgregaUnaDescripcion.setPreferredSize(new java.awt.Dimension(950, 455));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 51));

        taAgregaUnaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        taAgregaUnaDescripcion.setColumns(20);
        taAgregaUnaDescripcion.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        taAgregaUnaDescripcion.setForeground(new java.awt.Color(0, 0, 51));
        taAgregaUnaDescripcion.setLineWrap(true);
        taAgregaUnaDescripcion.setRows(5);
        taAgregaUnaDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taAgregaUnaDescripcion);

        lblSeleccionaUnArea1.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblSeleccionaUnArea1.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccionaUnArea1.setText("Escribe área:");

        lblEscribeTuNombre.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblEscribeTuNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblEscribeTuNombre.setText("Escribe tu nombre:");

        txtEscribeTuNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtEscribeTuNombre.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        txtEscribeTuNombre.setForeground(new java.awt.Color(0, 0, 51));

        txtEscribeElElemento.setBackground(new java.awt.Color(255, 255, 255));
        txtEscribeElElemento.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        txtEscribeElElemento.setForeground(new java.awt.Color(0, 0, 51));

        txtEscribeElPiso.setBackground(new java.awt.Color(255, 255, 255));
        txtEscribeElPiso.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        txtEscribeElPiso.setForeground(new java.awt.Color(0, 0, 51));

        txtEscribeElArea.setBackground(new java.awt.Color(255, 255, 255));
        txtEscribeElArea.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        txtEscribeElArea.setForeground(new java.awt.Color(0, 0, 51));

        txtEscribeElServicio.setBackground(new java.awt.Color(255, 255, 255));
        txtEscribeElServicio.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        txtEscribeElServicio.setForeground(new java.awt.Color(0, 0, 51));

        btnGuardar2.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnGuardar2.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar2.setText("Guardar");
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEscribeElPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscribeElElemento)
                    .addComponent(lblSeleccionaUnArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEscribeTuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscribeTuNombre)
                    .addComponent(txtEscribeElPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEscribeElArea, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEscribeElElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblEscribeElTipoDeServicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEscribeElServicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgregaUnaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(636, 636, 636))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAgregaUnaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblEscribeElPiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEscribeElPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSeleccionaUnArea1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEscribeElArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblEscribeElTipoDeServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEscribeElServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEscribeElElemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEscribeElElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblEscribeTuNombre))
                    .addComponent(btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEscribeTuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 1060, 590));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 430, 510, 420));

        lblondoMorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMorado.png"))); // NOI18N
        lblondoMorado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblondoMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 1080, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1966, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        FormMenuTareasPendientes = new MenuTareasPendientes();
        FormMenuTareasPendientes.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        Path destino =null;
        //Condicion para guardar la información
        if(!txtEscribeElPiso.getText().isEmpty() &&
            !txtEscribeElArea.getText().isEmpty() &&
            !txtEscribeElElemento.getText().isEmpty() &&
            !txtEscribeElServicio.getText().isEmpty() &&
            !taAgregaUnaDescripcion.getText().isEmpty() &&
            !txtEscribeTuNombre.getText().isEmpty()
            ){

            //Seteo de información al objeto
            serviciosPendientes.setPiso(txtEscribeElPiso.getText());
            serviciosPendientes.setArea(txtEscribeElArea.getText());
            serviciosPendientes.setElemento(txtEscribeElElemento.getText());
            serviciosPendientes.setServicio(txtEscribeElServicio.getText());
            serviciosPendientes.setFecha(LocalDate.EPOCH);
            serviciosPendientes.setDescripcion(taAgregaUnaDescripcion.getText());
            serviciosPendientes.setOperador(txtEscribeTuNombre.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione todos los campos");
        }

        //llamada del metodo para insertar en la base de datos
        serviciosPendientes.GuardarServicio();

        //Restablecer parametros iniciales de los comboBox y el TextArea
        txtEscribeTuNombre.setText("");
        taAgregaUnaDescripcion.setText("");
        txtEscribeElPiso.setText("");
        txtEscribeElArea.setText("");
        txtEscribeElElemento.setText("");
        txtEscribeElServicio.setText("");
    }//GEN-LAST:event_btnGuardar2ActionPerformed

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
            java.util.logging.Logger.getLogger(TareasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TareasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TareasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TareasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TareasPendientes().setVisible(true);
            }
        });
    }
    
    //Metodo para cambiar de tamaño las imagenes
        private void pintarImagen(JLabel lblBarraVerde, String root){
            this.imagen = new ImageIcon(root);
            this.icono = new ImageIcon(
                    this.imagen.getImage().getScaledInstance(
                            lblBarraVerde.getWidth(), 
                            lblBarraVerde.getHeight(), 
                            Image.SCALE_DEFAULT)
            );
            lblBarraVerde.setIcon(this.icono);
            this.repaint();
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregaUnaDescripcion;
    private javax.swing.JLabel lblBarraVerde;
    private javax.swing.JLabel lblCocinas;
    private javax.swing.JLabel lblEscribeElElemento;
    private javax.swing.JLabel lblEscribeElPiso;
    private javax.swing.JLabel lblEscribeElTipoDeServicio;
    private javax.swing.JLabel lblEscribeTuNombre;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSeleccionaUnArea1;
    private javax.swing.JLabel lblondoMorado;
    private javax.swing.JTextArea taAgregaUnaDescripcion;
    private javax.swing.JTextField txtEscribeElArea;
    private javax.swing.JTextField txtEscribeElElemento;
    private javax.swing.JTextField txtEscribeElPiso;
    private javax.swing.JTextField txtEscribeElServicio;
    private javax.swing.JTextField txtEscribeTuNombre;
    // End of variables declaration//GEN-END:variables
}

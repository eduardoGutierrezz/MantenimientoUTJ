/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Servicio;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Eduardo Arturo Gutiérrez Hernández
 */
public class Consultas extends javax.swing.JFrame {
    

    //Declaración de menus para la navegación entre paginas.
    private MenuPrincipal FormMenuPrincipal; 
    
    //Objetos para las imagenes
    private ImageIcon imagen;
    private Icon icono;
    
    public Consultas() {
        initComponents();
 
        // Obtener el tamaño de la pantalla
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // Establecer el tamaño del JFrame al tamaño de la pantalla
    this.setSize(screenSize.width, screenSize.height);

    // Opcional: Establecer la posición del JFrame en la esquina superior izquierda
    this.setLocation(0, 0);
    
    this.setLocationRelativeTo(null);
    //this.pintarImagen(this.lblLogoUtj, "src/Imagenes/pbuno.png");
    this.pintarImagen(this.lblBarraVerde, "src/Imagenes/verdeUtj.png");
    
    // Asegúrate de inicializar el modelo de la tabla antes de usarlo
    DefaultTableModel modeloTabla = new DefaultTableModel();
    String[] etiquetas = {"Id", "Tipo de Servicio", "Piso", "Área", "Elemento", "Descripción", "Fecha", "Operador", "Ruta imagen"};
    modeloTabla.setColumnIdentifiers(etiquetas);
    tableServicios.setModel(modeloTabla);

    // Luego llama al método de la clase Servicio para llenar la tabla
    Servicio servicio = new Servicio();
    String mensaje = servicio.ConsultarServicio(modeloTabla);
    
    tableServicios.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int filaSeleccionada = tableServicios.rowAtPoint(evt.getPoint());
            if (filaSeleccionada >= 0) {
                // Obtén el ID y la ruta de la imagen
                int id = Integer.parseInt(tableServicios.getValueAt(filaSeleccionada, 0).toString());
                String rutaImagen = tableServicios.getValueAt(filaSeleccionada, 8).toString();
                mostrarImagen(id, rutaImagen);
            }
        }
    });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBarraVerde = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableServicios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1970, 1020));
        jPanel1.setPreferredSize(new java.awt.Dimension(1970, 1016));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, -1, -1));

        lblBarraVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeUtj.png"))); // NOI18N
        jPanel1.add(lblBarraVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1970, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/area-restringida (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoUTJ.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(238, 248, 247));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1689, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 890, 1980, 130));

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N

        tableServicios.setBackground(new java.awt.Color(0, 0, 51));
        tableServicios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tableServicios.setForeground(new java.awt.Color(255, 255, 255));
        tableServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Piso", "Lugar", "Servicio", "Elemento", "Usuario", "Fecha"
            }
        ));
        tableServicios.setGridColor(new java.awt.Color(0, 102, 153));
        tableServicios.setRowHeight(28);
        tableServicios.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableServicios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableServicios.setShowGrid(true);
        jScrollPane1.setViewportView(tableServicios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 1270, 580));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 1970, 142));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 313, 420, 577));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        FormMenuPrincipal = new MenuPrincipal();
        FormMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
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
        }//fin metodo pintarImagen
        
       // Método para escalar imagen
            private ImageIcon escalarImagen(ImageIcon icono, int alto) {
                // Obtener las dimensiones originales de la imagen
                Image imagen = icono.getImage();
                int anchoOriginal = imagen.getWidth(null);
                int altoOriginal = imagen.getHeight(null);

                // Calcular el nuevo ancho manteniendo la proporción
                int nuevoAncho = (alto * anchoOriginal) / altoOriginal;

                // Escalar la imagen a las nuevas dimensiones
                Image imagenEscalada = imagen.getScaledInstance(nuevoAncho, alto, Image.SCALE_SMOOTH);
                return new ImageIcon(imagenEscalada);
            }

            // Ejemplo de uso
            private void mostrarImagen(int id, String rutaImagen) {
                // Cargar la imagen desde la ruta
                ImageIcon iconoImagen = new ImageIcon(rutaImagen);

                // Definir el nuevo alto
                int nuevoAlto = 600;

                // Escalar la imagen
                ImageIcon imagenEscalada = escalarImagen(iconoImagen, nuevoAlto);

                // Mostrar la imagen escalada en un JLabel
                lblImagen.setIcon(imagenEscalada);
        
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarraVerde;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTable tableServicios;
    // End of variables declaration//GEN-END:variables
}

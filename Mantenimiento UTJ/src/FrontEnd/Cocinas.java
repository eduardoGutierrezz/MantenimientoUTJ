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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Eduardo Arturo Gutiérrez Hernández
 */
public class Cocinas extends javax.swing.JFrame {
    
    //Objeto de la clase Servivio
    Servicio servicio = new Servicio();

    //Declaración de menus para la navegación entre paginas.
    private MenuPrincipal FormMenuPrincipal;
    
    //Objetos para las imagenes
    private ImageIcon imagen;
    private Icon icono;
    
    public Cocinas() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblCocinas = new javax.swing.JLabel();
        lblBarraVerde = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        cbSeleccionaUnElemento = new javax.swing.JComboBox<>();
        lblSeleccionaUNElemento = new javax.swing.JLabel();
        cbSeleccionaUnServicio = new javax.swing.JComboBox<>();
        lblSeleccionaUnServicio = new javax.swing.JLabel();
        cbSeleccionaElPiso = new javax.swing.JComboBox<>();
        lblSeleccionaElPiso = new javax.swing.JLabel();
        lblAgregaUnaDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAgregaUnaDescripcion = new javax.swing.JTextArea();
        lblSeleccionaUnArea1 = new javax.swing.JLabel();
        cbSeleccionaUnArea1 = new javax.swing.JComboBox<>();
        lblEscribeTuNombre = new javax.swing.JLabel();
        txtEscribeTuNombre = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblondoMorado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRutaImagen = new javax.swing.JTextField();
        btnSeleccionarArchivo = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCocinas.setFont(new java.awt.Font("Calibri", 1, 72)); // NOI18N
        lblCocinas.setForeground(new java.awt.Color(255, 255, 255));
        lblCocinas.setText("Cocinas");
        jPanel1.add(lblCocinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 171, 250, 110));

        lblBarraVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verdeUtj.png"))); // NOI18N
        jPanel1.add(lblBarraVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1970, 130));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoUTJ.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbSeleccionaUnElemento.setBackground(new java.awt.Color(255, 255, 255));
        cbSeleccionaUnElemento.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        cbSeleccionaUnElemento.setForeground(new java.awt.Color(0, 0, 51));
        cbSeleccionaUnElemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puertas", "Paredes", "Ventanas", "Pisos", "Extintores", "Mesas", "Sillas", "Aire acondicionado", "Electricidad", "Camaras", "Agua", "otros", " " }));

        lblSeleccionaUNElemento.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblSeleccionaUNElemento.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccionaUNElemento.setText("Selecciona un elemento");

        cbSeleccionaUnServicio.setBackground(new java.awt.Color(255, 255, 255));
        cbSeleccionaUnServicio.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        cbSeleccionaUnServicio.setForeground(new java.awt.Color(0, 0, 51));
        cbSeleccionaUnServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Revisión de equipo", "Mantenimiento", "Reparación", "sustitución", "Otro" }));

        lblSeleccionaUnServicio.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblSeleccionaUnServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccionaUnServicio.setText("Selecciona un servicio");

        cbSeleccionaElPiso.setBackground(new java.awt.Color(255, 255, 255));
        cbSeleccionaElPiso.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        cbSeleccionaElPiso.setForeground(new java.awt.Color(0, 0, 51));
        cbSeleccionaElPiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piso 1", "Piso 2", "Piso 3", "Piso 4", "Piso 5" }));

        lblSeleccionaElPiso.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblSeleccionaElPiso.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccionaElPiso.setText("Selecciona el piso");

        lblAgregaUnaDescripcion.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblAgregaUnaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregaUnaDescripcion.setText("Agrega una descripción del servicio");

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
        lblSeleccionaUnArea1.setText("Selecciona un área");

        cbSeleccionaUnArea1.setBackground(new java.awt.Color(255, 255, 255));
        cbSeleccionaUnArea1.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        cbSeleccionaUnArea1.setForeground(new java.awt.Color(0, 0, 51));
        cbSeleccionaUnArea1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina" }));

        lblEscribeTuNombre.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lblEscribeTuNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblEscribeTuNombre.setText("Escribe tu nombre");

        txtEscribeTuNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtEscribeTuNombre.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        txtEscribeTuNombre.setForeground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeleccionaElPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeleccionaUnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeleccionaUNElemento)
                    .addComponent(cbSeleccionaUnElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSeleccionaElPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeleccionaUnArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbSeleccionaUnServicio, javax.swing.GroupLayout.Alignment.LEADING, 0, 320, Short.MAX_VALUE)
                        .addComponent(cbSeleccionaUnArea1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtEscribeTuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscribeTuNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAgregaUnaDescripcion)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(171, 171, 171))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAgregaUnaDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSeleccionaElPiso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSeleccionaElPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(lblSeleccionaUnArea1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSeleccionaUnArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSeleccionaUnServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSeleccionaUnServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSeleccionaUNElemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSeleccionaUnElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEscribeTuNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEscribeTuNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 1060, 590));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 870, 121, 98));

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

        lblondoMorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMorado.png"))); // NOI18N
        lblondoMorado.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel1.add(lblondoMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 1080, 610));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Sube una imagen");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 340, 230, -1));

        txtRutaImagen.setBackground(new java.awt.Color(255, 255, 255));
        txtRutaImagen.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtRutaImagen.setForeground(new java.awt.Color(0, 0, 51));
        txtRutaImagen.setEnabled(false);
        jPanel1.add(txtRutaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 380, 370, -1));

        btnSeleccionarArchivo.setBackground(new java.awt.Color(255, 255, 255));
        btnSeleccionarArchivo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnSeleccionarArchivo.setForeground(new java.awt.Color(0, 0, 51));
        btnSeleccionarArchivo.setText("Seleccionar");
        btnSeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 380, 150, -1));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 430, 510, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1966, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        FormMenuPrincipal = new MenuPrincipal();
        FormMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       Path destino =null;    
    //Condicion para guardar la información
        if(cbSeleccionaElPiso.getSelectedIndex()>=0 && 
                cbSeleccionaUnArea1.getSelectedIndex()>=0 && 
                cbSeleccionaUnElemento.getSelectedIndex()>=0 && 
                cbSeleccionaUnServicio.getSelectedIndex()>=0 && 
                !taAgregaUnaDescripcion.getText().isEmpty() &&
                !txtEscribeTuNombre.getText().isEmpty()&&
                !txtRutaImagen.getText().isEmpty()){
            
            //Seteo de información al objeto
            servicio.setPiso(cbSeleccionaElPiso.getSelectedItem().toString());
            servicio.setArea(cbSeleccionaUnArea1.getSelectedItem().toString());
            servicio.setElemento(cbSeleccionaUnElemento.getSelectedItem().toString());
            servicio.setTipoServicio(cbSeleccionaUnServicio.getSelectedItem().toString());
            servicio.setFecha(LocalDate.EPOCH);
            servicio.setDescripcion(taAgregaUnaDescripcion.getText());
            servicio.setOperador(txtEscribeTuNombre.getText());
           
          
            //Mensaje de confirmación al usuario
            //JOptionPane.showMessageDialog(null, "Información guardada con exito");
            
       
            
             // Validar si existe la carpeta de imágenes en los documentos del sistema y si no, crearla
            String userHome = System.getProperty("user.home");
            File documentosCarpeta = new File(userHome, "Documents"); // "Documents" para sistemas en inglés
            File imagenesCarpeta = new File(documentosCarpeta, "Imagenes");
            if (!imagenesCarpeta.exists()) {
                if (imagenesCarpeta.mkdirs()) {
                    System.out.println("Carpeta creada: " + imagenesCarpeta.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear la carpeta: " + imagenesCarpeta.getAbsolutePath());
                }
            }

            // Guardar la imagen seleccionada en la carpeta
            Path origen = Path.of(txtRutaImagen.getText());
            destino = Path.of(imagenesCarpeta.getAbsolutePath(), origen.getFileName().toString());
            System.out.println("Destino"+destino+" Origen:" +origen);
            try {
                Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Imagen guardada en: " + destino.toString());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al copiar la imagen: " + e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione todos los campos");
    }
    servicio.setRutaImagen(String.valueOf(destino));
            
    
    //llamada del metodo para insertar en la base de datos
      servicio.GuardarServicio();
            
    //Restablecer parametros iniciales de los comboBox y el TextArea
    txtRutaImagen.setText("");
    txtEscribeTuNombre.setText("");
    taAgregaUnaDescripcion.setText("");
    cbSeleccionaElPiso.setSelectedIndex(-1);
    cbSeleccionaUnArea1.setSelectedIndex(-1);
    cbSeleccionaUnElemento.setSelectedIndex(-1);
    cbSeleccionaUnServicio.setSelectedIndex(-1);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArchivoActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de archivos JPEG(*.JPG;*.JPEG)","jpg","jpeg");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir archivo");
        File ruta = new File("D:/Documentos");
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = archivo.getSelectedFile();
            txtRutaImagen.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txtRutaImagen.getText());

            // Obtener las dimensiones originales de la imagen
            ImageIcon icono = new ImageIcon(foto);
            int width = icono.getIconWidth();
            int height = icono.getIconHeight();

            // Definir el ancho y calcular el alto manteniendo la proporción
            int nuevoAlto = 510;
            int nuevoAncho = (nuevoAlto * height) / width;

            // Escalar la imagen a las nuevas dimensiones
            foto = foto.getScaledInstance(nuevoAlto, nuevoAncho, Image.SCALE_DEFAULT);
            lblFoto.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_btnSeleccionarArchivoActionPerformed

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
            java.util.logging.Logger.getLogger(Cocinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cocinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cocinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cocinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cocinas().setVisible(true);
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSeleccionarArchivo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbSeleccionaElPiso;
    private javax.swing.JComboBox<String> cbSeleccionaUnArea1;
    private javax.swing.JComboBox<String> cbSeleccionaUnElemento;
    private javax.swing.JComboBox<String> cbSeleccionaUnServicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregaUnaDescripcion;
    private javax.swing.JLabel lblBarraVerde;
    private javax.swing.JLabel lblCocinas;
    private javax.swing.JLabel lblEscribeTuNombre;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSeleccionaElPiso;
    private javax.swing.JLabel lblSeleccionaUNElemento;
    private javax.swing.JLabel lblSeleccionaUnArea1;
    private javax.swing.JLabel lblSeleccionaUnServicio;
    private javax.swing.JLabel lblondoMorado;
    private javax.swing.JTextArea taAgregaUnaDescripcion;
    private javax.swing.JTextField txtEscribeTuNombre;
    private javax.swing.JTextField txtRutaImagen;
    // End of variables declaration//GEN-END:variables
}

package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Persona;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class VenAdminEditarU extends javax.swing.JFrame {
    
    Controlador control;
    short id_user;
    Persona person;

    public VenAdminEditarU(short id_user, Controlador control) {
        initComponents();
        this.id_user = id_user;
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cmbRol = new javax.swing.JComboBox<>();
        lblRol = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        lblNumeroDoc = new javax.swing.JLabel();
        txtNumeroDoc = new javax.swing.JTextField();
        cmbTipoDoc = new javax.swing.JComboBox<>();
        lblTipoDoc = new javax.swing.JLabel();
        lblNombreApellido = new javax.swing.JLabel();
        txtNombreApellido = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        lblContrasena = new javax.swing.JLabel();
        lblNombreUser = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        lblEdicionUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbRol.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "empleado" }));
        cmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolActionPerformed(evt);
            }
        });

        lblRol.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblRol.setText("Rol:");

        lblTelefono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblTelefono.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtCorreo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        lblCorreo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblCorreo.setText("Correo:");

        lblNumeroDoc.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblNumeroDoc.setText("Numero de Documento:");

        txtNumeroDoc.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        cmbTipoDoc.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cmbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadania", "Cedula de Extranjeria", "Pasaporte" }));

        lblTipoDoc.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblTipoDoc.setText("Tipo de Documento:");

        lblNombreApellido.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblNombreApellido.setText("Nombres y Apellidos:");

        txtNombreApellido.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        txtContrasena.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        lblContrasena.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblContrasena.setText("Contraseña:");

        lblNombreUser.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblNombreUser.setText("Nombre de Usuario:");

        txtNombreUser.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        lblEdicionUser.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblEdicionUser.setText("Edicion de Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEdicionUser)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblContrasena)
                                    .addComponent(lblNombreUser)
                                    .addComponent(lblNombreApellido)
                                    .addComponent(lblTipoDoc)
                                    .addComponent(lblNumeroDoc)
                                    .addComponent(lblCorreo)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblRol))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtContrasena)
                                .addComponent(cmbTipoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumeroDoc)
                                .addComponent(txtNombreApellido)
                                .addComponent(txtCorreo)
                                .addComponent(txtTelefono)
                                .addComponent(cmbRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreUser))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblEdicionUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtNombreUser.setText("");
        txtContrasena.setText("");
        txtNombreApellido.setText("");
        txtNumeroDoc.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        String nombreUser = txtNombreUser.getText();
        String contra = txtContrasena.getText();
        String nombresApellidos = txtNombreApellido.getText();
        String tipoDoc = (String) cmbTipoDoc.getSelectedItem();
        String numeroDoc = txtNumeroDoc.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String rol = (String) cmbRol.getSelectedItem();
        
        control.editarUsuario(person, nombreUser, contra, nombresApellidos, tipoDoc, numeroDoc, correo, telefono, rol);
        mostrarMensaje("Usuario editado correctamente", "Info", "Edicion Exitosa");
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        person = control.traerUsuario(id_user);
        
        txtNombreUser.setText(person.getNombreUsuario());
        txtContrasena.setText(person.getContrasena());
        txtNombreApellido.setText(person.getNombre());
        cmbTipoDoc.setSelectedItem(person.getTipoDocumento());
        txtNumeroDoc.setText(String.valueOf(person.getNumeroDocumento()));
        txtCorreo.setText(person.getCorreo());
        txtTelefono.setText(String.valueOf(person.getTelefono()));
        cmbRol.setSelectedItem(person.getRol());
                
    }//GEN-LAST:event_formWindowOpened

    public void mostrarMensaje (String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
           optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> cmbTipoDoc;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEdicionUser;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblNombreUser;
    private javax.swing.JLabel lblNumeroDoc;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoDoc;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreApellido;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JTextField txtNumeroDoc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

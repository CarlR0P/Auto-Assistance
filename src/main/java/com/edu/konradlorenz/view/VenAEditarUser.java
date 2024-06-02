package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.EmpleadoVacioException;
import com.edu.konradlorenz.model.ExageradosException;
import com.edu.konradlorenz.model.NoLeenException;
import com.edu.konradlorenz.model.Persona;
import com.edu.konradlorenz.model.YaExisteException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.*;

public class VenAEditarUser extends javax.swing.JFrame {

    Controlador control;
    short id_user;
    Persona person;

    public VenAEditarUser(short id_user, Controlador control) {
        initComponents();
        this.id_user = id_user;
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel lblContrasena = new javax.swing.JLabel();
        javax.swing.JButton btnVolver = new javax.swing.JButton();
        javax.swing.JLabel lblEdicionUser = new javax.swing.JLabel();
        javax.swing.JLabel lblNombreUser = new javax.swing.JLabel();
        javax.swing.JLabel lblNombreApellido = new javax.swing.JLabel();
        javax.swing.JLabel lblTipoDoc = new javax.swing.JLabel();
        javax.swing.JLabel lblNumeroDoc = new javax.swing.JLabel();
        javax.swing.JLabel lblCorreo = new javax.swing.JLabel();
        javax.swing.JLabel lblTelefono = new javax.swing.JLabel();
        javax.swing.JLabel lblRol = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        txtNombreApellido = new javax.swing.JTextField();
        cmbTipoDoc = new javax.swing.JComboBox<>();
        txtNumeroDoc = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cmbRol = new javax.swing.JComboBox<>();
        javax.swing.JButton btnResetearContrasena = new javax.swing.JButton();
        javax.swing.JButton btnLimpiar = new javax.swing.JButton();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JButton btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 214, 250));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jPanel2.setBackground(new java.awt.Color(192, 214, 250));

        lblContrasena.setFont(new java.awt.Font("sansserif", Font.PLAIN, 18)); // NOI18N

        btnVolver.setBackground(new java.awt.Color(108, 152, 197));
        btnVolver.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(177, 216, 255), null, null));
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        lblEdicionUser.setFont(new java.awt.Font("sansserif", Font.BOLD, 24)); // NOI18N
        lblEdicionUser.setText("Edicion de Usuario");

        lblNombreUser.setFont(new java.awt.Font("sansserif", Font.PLAIN, 18)); // NOI18N
        lblNombreUser.setText("Nombre de Usuario:");

        lblNombreApellido.setFont(new java.awt.Font("sansserif", Font.PLAIN, 18)); // NOI18N
        lblNombreApellido.setText("Nombres y Apellidos:");

        lblTipoDoc.setFont(new java.awt.Font("sansserif", Font.PLAIN, 18)); // NOI18N
        lblTipoDoc.setText("Tipo de Documento:");

        lblNumeroDoc.setFont(new java.awt.Font("sansserif", Font.PLAIN, 18)); // NOI18N
        lblNumeroDoc.setText("Numero de Documento:");

        lblCorreo.setFont(new java.awt.Font("sansserif", Font.PLAIN, 18)); // NOI18N
        lblCorreo.setText("Correo:");

        lblTelefono.setFont(new java.awt.Font("sansserif", Font.PLAIN, 18)); // NOI18N
        lblTelefono.setText("Telefono:");

        lblRol.setFont(new java.awt.Font("sansserif", Font.PLAIN, 18)); // NOI18N
        lblRol.setText("Rol:");

        txtNombreUser.setBackground(new java.awt.Color(228, 235, 247));
        txtNombreUser.setFont(new java.awt.Font("Century Gothic", Font.PLAIN, 18)); // NOI18N
        txtNombreUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtNombreApellido.setBackground(new java.awt.Color(228, 235, 247));
        txtNombreApellido.setFont(new java.awt.Font("Century Gothic", Font.PLAIN, 18)); // NOI18N
        txtNombreApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cmbTipoDoc.setBackground(new java.awt.Color(228, 235, 247));
        cmbTipoDoc.setEditable(true);
        cmbTipoDoc.setFont(new java.awt.Font("Century Gothic", Font.PLAIN, 18)); // NOI18N
        cmbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadania", "Cedula de Extranjeria", "Pasaporte" }));
        cmbTipoDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtNumeroDoc.setBackground(new java.awt.Color(228, 235, 247));
        txtNumeroDoc.setFont(new java.awt.Font("Century Gothic", Font.PLAIN, 18)); // NOI18N
        txtNumeroDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtCorreo.setBackground(new java.awt.Color(228, 235, 247));
        txtCorreo.setFont(new java.awt.Font("Century Gothic", Font.PLAIN, 18)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtTelefono.setBackground(new java.awt.Color(228, 235, 247));
        txtTelefono.setFont(new java.awt.Font("Century Gothic", Font.PLAIN, 18)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cmbRol.setBackground(new java.awt.Color(228, 235, 247));
        cmbRol.setFont(new java.awt.Font("Century Gothic", Font.PLAIN, 18)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "empleado" }));
        cmbRol.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnResetearContrasena.setBackground(new java.awt.Color(108, 152, 197));
        btnResetearContrasena.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        btnResetearContrasena.setForeground(new java.awt.Color(255, 255, 255));
        btnResetearContrasena.setText("Resetear Contraseña");
        btnResetearContrasena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(183, 216, 249), null, null));
        btnResetearContrasena.addActionListener(this::btnResetearContrasenaActionPerformed);

        btnLimpiar.setBackground(new java.awt.Color(108, 152, 197));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 20)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(186, 217, 248), null, null));
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnGuardar.setBackground(new java.awt.Color(108, 152, 197));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(186, 217, 249), null, null));
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRol)
                            .addComponent(lblTelefono)
                            .addComponent(lblCorreo)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNumeroDoc)
                                .addComponent(lblTipoDoc, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNombreApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNombreUser, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroDoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipoDoc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreApellido)
                            .addComponent(txtNombreUser))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEdicionUser)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnResetearContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(274, 274, 274)
                    .addComponent(lblContrasena)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblEdicionUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnResetearContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(304, 304, 304)
                    .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened() {//GEN-FIRST:event_formWindowOpened

        person = control.traerUsuario(id_user);

        txtNombreUser.setText(person.getNombreUsuario());
        txtNombreApellido.setText(person.getNombre());
        cmbTipoDoc.setSelectedItem(person.getTipoDocumento());
        txtNumeroDoc.setText(String.valueOf(person.getNumeroDocumento()));
        txtCorreo.setText(person.getCorreo());
        txtTelefono.setText(String.valueOf(person.getTelefono()));
        cmbRol.setSelectedItem(person.getRol());

    }//GEN-LAST:event_formWindowOpened

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtNombreUser.setText("");
        txtNombreApellido.setText("");
        txtNumeroDoc.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombreUser = txtNombreUser.getText();
        String nombresApellidos = txtNombreApellido.getText();
        String tipoDoc = (String) cmbTipoDoc.getSelectedItem();
        String numeroDoc = txtNumeroDoc.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String rol = (String) cmbRol.getSelectedItem();

        try {
            // Validación de campos vacíos
            EmpleadoVacioException.validarCampos(nombreUser, nombresApellidos, numeroDoc, correo, telefono);
            boolean usuarioExiste = YaExisteException.usuarioYaExiste(nombreUser, person.getId()); // Validación de existencia de usuario

            if (usuarioExiste) {
                mostrarMensaje("El nombre de usuario ya está en uso", "Error", "Error al editar usuario");
            } else {
                // Validaciones de los campos con reglas específicas
                NoLeenException.validarTextos(nombresApellidos);
                NoLeenException.validarCorreo(correo);
                NoLeenException.validarNumeros(numeroDoc);
                NoLeenException.validarNumeros(telefono);
                ExageradosException.validarTelefono(telefono);
                ExageradosException.validarNumeroDocumento(numeroDoc);
                // Edición del usuario
                control.editarUsuario(person, nombreUser, nombresApellidos, tipoDoc, numeroDoc, correo, telefono, rol);
                mostrarMensaje("Usuario editado correctamente", "Info", "Edición Exitosa");
                this.dispose();
            }
        } catch (EmpleadoVacioException e) {
            mostrarMensaje("Todos los campos son obligatorios.", "Error", "Error al guardar");
        } catch (YaExisteException e) {
            mostrarMensaje("El nombre de usuario ya fue asignado previamente.", "Error", "Error al guardar");
        } catch (NoLeenException | ExageradosException e) {
            mostrarMensaje(e.getMessage(), "Error", "Error al guardar");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnResetearContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearContrasenaActionPerformed

        String contrasena = "Colombia123";

        Object[] options = {"Sí", "No"};
        int confirmacion = JOptionPane.showOptionDialog(this, "¿Está seguro de que desea cambiar su contraseña?", "Cambio Contraseña",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);

        if (confirmacion == JOptionPane.YES_OPTION) {
            control.cambiarContra(person, contrasena);
            mostrarMensaje("Se reseteo la contraseña correctamente", "Info", "Cambio de Contraseña");
            this.dispose();
        } else {
            mostrarMensaje("No se reseteo la contraseña", "Info", "Cambio de Contraseña");
        }
    }//GEN-LAST:event_btnResetearContrasenaActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
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

    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> cmbTipoDoc;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreApellido;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JTextField txtNumeroDoc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

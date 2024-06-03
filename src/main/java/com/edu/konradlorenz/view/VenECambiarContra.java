package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.ExageradosException;
import com.edu.konradlorenz.model.Persona;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.*;

public class VenECambiarContra extends javax.swing.JFrame {

    Controlador control;
    short id_user;
    Persona person;

    public VenECambiarContra(Controlador control, short id_user) {
        initComponents();
        this.control = control;
        this.id_user = id_user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCambioContrasena = new javax.swing.JLabel();
        lblNuevaContrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));

        lblCambioContrasena.setBackground(new java.awt.Color(10, 10, 10));
        lblCambioContrasena.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        lblCambioContrasena.setForeground(new java.awt.Color(10, 10, 10));
        lblCambioContrasena.setText("Cambio de Contraseña");

        lblNuevaContrasena.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        lblNuevaContrasena.setForeground(new java.awt.Color(10, 10, 10));
        lblNuevaContrasena.setText("Nueva Contraseña:");

        txtContrasena.setBackground(new java.awt.Color(228, 235, 247));
        txtContrasena.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(10, 10, 10));
        txtContrasena.setText("jPa");
        txtContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnCancelar.setBackground(new java.awt.Color(108, 152, 197));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(166, 207, 249), null, null));
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        btnGuardar.setBackground(new java.awt.Color(108, 152, 197));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(164, 209, 253), null, null));
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNuevaContrasena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCambioContrasena)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCambioContrasena)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened() {//GEN-FIRST:event_formWindowOpened
        person = control.traerUsuario(id_user);
        txtContrasena.setText(person.getContrasena());
    }//GEN-LAST:event_formWindowOpened

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {

        String contrasena = txtContrasena.getText();

        try {
            ExageradosException.validarContrasena(contrasena);

            Object[] options = {"Sí", "No"};
            int confirmacion = JOptionPane.showOptionDialog(this, "¿Está seguro de que desea cambiar su contraseña?", "Cambio Contraseña",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);
            if (confirmacion == JOptionPane.YES_OPTION) {
                control.cambiarContra(person, contrasena);
                mostrarMensaje("Se modificó la contraseña correctamente", "Info", "Cambio de Contraseña");
                this.dispose();
            } else {
                mostrarMensaje("No se modificó la contraseña", "Info", "Cambio de Contraseña");
            }

        } catch (ExageradosException ex) {
            mostrarMensaje(ex.getMessage(), "Error", "Cambio de Contraseña");
        }

    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCambioContrasena;
    private javax.swing.JLabel lblNuevaContrasena;
    private javax.swing.JPasswordField txtContrasena;
    // End of variables declaration//GEN-END:variables
}

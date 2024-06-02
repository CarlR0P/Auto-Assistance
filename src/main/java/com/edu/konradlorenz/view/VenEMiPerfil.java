package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Persona;

import java.awt.*;

public class VenEMiPerfil extends javax.swing.JFrame {

    Controlador control;
    short id_user;
    Persona person;

    public VenEMiPerfil(short id_user, Controlador control) {
        initComponents();
        this.id_user = id_user;
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lblMisDatos = new javax.swing.JLabel();
        javax.swing.JLabel lblCorreo = new javax.swing.JLabel();
        javax.swing.JLabel lblNombreUsuario = new javax.swing.JLabel();
        javax.swing.JLabel lblNombresApellidos = new javax.swing.JLabel();
        javax.swing.JLabel lblTipoDoc = new javax.swing.JLabel();
        javax.swing.JLabel lblNumeDoc = new javax.swing.JLabel();
        javax.swing.JLabel lblTelefono = new javax.swing.JLabel();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JButton btnCambiarContrasena = new javax.swing.JButton();
        javax.swing.JButton btnMenuPrincipal = new javax.swing.JButton();
        txtTipoDoc = new javax.swing.JTextField();
        txtNumDoc = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtNombreApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));

        lblMisDatos.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 36)); // NOI18N
        lblMisDatos.setForeground(new java.awt.Color(10, 10, 10));
        lblMisDatos.setText("Mis datos");

        lblCorreo.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(10, 10, 10));
        lblCorreo.setText("Correo:");

        lblNombreUsuario.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(10, 10, 10));
        lblNombreUsuario.setText("Nombre de Usuario:");

        lblNombresApellidos.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        lblNombresApellidos.setForeground(new java.awt.Color(10, 10, 10));
        lblNombresApellidos.setText("Nombres y Apellidos:");

        lblTipoDoc.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        lblTipoDoc.setForeground(new java.awt.Color(10, 10, 10));
        lblTipoDoc.setText("Tipo de Documento:");

        lblNumeDoc.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        lblNumeDoc.setForeground(new java.awt.Color(10, 10, 10));
        lblNumeDoc.setText("Numero de Documento:");

        lblTelefono.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(10, 10, 10));
        lblTelefono.setText("Telefono:");

        btnCambiarContrasena.setBackground(new java.awt.Color(108, 152, 197));
        btnCambiarContrasena.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        btnCambiarContrasena.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarContrasena.setText("Cambiar mi Contraseña");
        btnCambiarContrasena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(173, 213, 253), null, null));
        btnCambiarContrasena.addActionListener(this::btnCambiarContrasenaActionPerformed);

        btnMenuPrincipal.setBackground(new java.awt.Color(108, 152, 197));
        btnMenuPrincipal.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 18)); // NOI18N
        btnMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(169, 210, 250), null, null));
        btnMenuPrincipal.addActionListener(this::btnMenuPrincipalActionPerformed);

        txtTipoDoc.setEditable(false);
        txtTipoDoc.setBackground(new java.awt.Color(228, 235, 247));
        txtTipoDoc.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        txtTipoDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtNumDoc.setEditable(false);
        txtNumDoc.setBackground(new java.awt.Color(228, 235, 247));
        txtNumDoc.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        txtNumDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtNombreUsuario.setEditable(false);
        txtNombreUsuario.setBackground(new java.awt.Color(228, 235, 247));
        txtNombreUsuario.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtNombreApellido.setEditable(false);
        txtNombreApellido.setBackground(new java.awt.Color(228, 235, 247));
        txtNombreApellido.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        txtNombreApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtCorreo.setEditable(false);
        txtCorreo.setBackground(new java.awt.Color(228, 235, 247));
        txtCorreo.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(228, 235, 247));
        txtTelefono.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblCorreo)
                                    .addComponent(lblNumeDoc)
                                    .addComponent(lblTipoDoc)
                                    .addComponent(lblNombresApellidos)
                                    .addComponent(lblNombreUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(txtNumDoc)
                                    .addComponent(txtTipoDoc)
                                    .addComponent(txtNombreApellido)
                                    .addComponent(txtNombreUsuario)
                                    .addComponent(txtTelefono)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(btnCambiarContrasena))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lblMisDatos)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenuPrincipal)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblMisDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombresApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnCambiarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened() {//GEN-FIRST:event_formWindowOpened

        person = control.traerUsuario(id_user);

        txtNombreUsuario.setText(person.getNombreUsuario());
        txtNombreApellido.setText(person.getNombre());
        txtTipoDoc.setText(person.getTipoDocumento());
        txtNumDoc.setText(String.valueOf(person.getNumeroDocumento()));
        txtCorreo.setText(person.getCorreo());
        txtTelefono.setText(String.valueOf(person.getTelefono()));

    }//GEN-LAST:event_formWindowOpened

    private void btnCambiarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContrasenaActionPerformed

        VenECambiarContra venCambiarContra = new VenECambiarContra(control, id_user);
        venCambiarContra.setVisible(true);
        venCambiarContra.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnCambiarContrasenaActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed

        VentanaEmpleado venEmple = new VentanaEmpleado(control, person);
        venEmple.setVisible(true);
        venEmple.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreApellido;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNumDoc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoDoc;
    // End of variables declaration//GEN-END:variables
}

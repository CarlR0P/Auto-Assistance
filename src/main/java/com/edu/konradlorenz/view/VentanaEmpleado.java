package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.HistorialHorario;
import com.edu.konradlorenz.model.Persona;
import javax.swing.JFrame;

public class VentanaEmpleado extends javax.swing.JFrame {

    Controlador control;
    Persona person;
    HistorialHorario historialHorario = new HistorialHorario();

    public VentanaEmpleado(Controlador control, Persona person) {
        initComponents();
        this.control = control;
        this.person = person;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSistEmpleado = new javax.swing.JLabel();
        lblUserLogged = new javax.swing.JLabel();
        btnMiHorario = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnMiPerfil1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));

        lblSistEmpleado.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblSistEmpleado.setForeground(new java.awt.Color(10, 10, 10));
        lblSistEmpleado.setText("Sistema Empleado");

        lblUserLogged.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUserLogged.setForeground(new java.awt.Color(10, 10, 10));
        lblUserLogged.setText("jLabel1");

        btnMiHorario.setBackground(new java.awt.Color(108, 152, 197));
        btnMiHorario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnMiHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnMiHorario.setText("Mi horario");
        btnMiHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(165, 206, 246), null, null));
        btnMiHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiHorarioActionPerformed(evt);
            }
        });

        btnSalir1.setBackground(new java.awt.Color(108, 152, 197));
        btnSalir1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("Salir");
        btnSalir1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(163, 209, 255), null, null));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        btnMiPerfil1.setBackground(new java.awt.Color(108, 152, 197));
        btnMiPerfil1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnMiPerfil1.setForeground(new java.awt.Color(255, 255, 255));
        btnMiPerfil1.setText("Mi perfil");
        btnMiPerfil1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(165, 208, 250), null, null));
        btnMiPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiPerfil1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSistEmpleado)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUserLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnMiPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMiHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSistEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMiPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMiHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMiHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiHorarioActionPerformed
        
        VenEHorarioOpc venEHorarioOpc = new VenEHorarioOpc(control, person, historialHorario,person.getId());
        venEHorarioOpc.setVisible(true);
        venEHorarioOpc.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnMiHorarioActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnMiPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfil1ActionPerformed

        short id_user = person.getId();
        VenEMiPerfil venPerfil = new VenEMiPerfil(id_user, control);
        venPerfil.setVisible(true);
        venPerfil.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnMiPerfil1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.lblUserLogged.setText(person.getNombreUsuario());
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMiHorario;
    private javax.swing.JButton btnMiPerfil1;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSistEmpleado;
    private javax.swing.JLabel lblUserLogged;
    // End of variables declaration//GEN-END:variables
}

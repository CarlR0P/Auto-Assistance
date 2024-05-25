package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Persona;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class VenEHorarioOpc extends javax.swing.JFrame {

    Controlador control;
    Persona person;
    short id_user;

    public VenEHorarioOpc(Controlador control, Persona person, short id_user) {
        initComponents();
        this.control = control;
        this.person = person;
        this.id_user = id_user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSistEmple = new javax.swing.JLabel();
        btnRegistrarSalida = new javax.swing.JButton();
        btnRegistrarLlegada = new javax.swing.JButton();
        btnRegistrarLabores = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRegistroLabores = new javax.swing.JTextArea();
        lblRegistrarLabores = new javax.swing.JLabel();
        lblUserLogged = new javax.swing.JLabel();
        btnVerHorario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblSistEmple.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblSistEmple.setText("Sistema Empleado");

        btnRegistrarSalida.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegistrarSalida.setText("Registrar Salida");
        btnRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSalidaActionPerformed(evt);
            }
        });

        btnRegistrarLlegada.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegistrarLlegada.setText("Registrar Llegada");
        btnRegistrarLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLlegadaActionPerformed(evt);
            }
        });

        btnRegistrarLabores.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegistrarLabores.setText("Registrar Labores");
        btnRegistrarLabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLaboresActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        txtRegistroLabores.setColumns(20);
        txtRegistroLabores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRegistroLabores.setRows(5);
        jScrollPane1.setViewportView(txtRegistroLabores);

        lblRegistrarLabores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistrarLabores.setText("Registro de Labores:");

        lblUserLogged.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUserLogged.setForeground(new java.awt.Color(10, 10, 10));
        lblUserLogged.setText("jLabel1");

        btnVerHorario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVerHorario.setText("Ver mi Horario");
        btnVerHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSistEmple)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUserLogged)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegistrarLabores)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrarLlegada)
                                .addGap(89, 89, 89)
                                .addComponent(btnRegistrarSalida))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnVerHorario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnRegistrarLabores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenuPrincipal)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserLogged)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSistEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblRegistrarLabores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarLabores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed

        VentanaEmpleado ventanaEmpleado = new VentanaEmpleado(control, person);
        ventanaEmpleado.setVisible(true);
        ventanaEmpleado.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnRegistrarLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLlegadaActionPerformed

        LocalDateTime llegada = LocalDateTime.now();

        Object[] options = {"Sí", "No"};
        int confirmacion = JOptionPane.showOptionDialog(this,
                "¿Está seguro de que desea registrar la llegada en "
                + llegada.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "?",
                "Registro Llegada",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (confirmacion == JOptionPane.YES_OPTION) {
            control.registrarLlegada(person, llegada);
            mostrarMensaje("Se registró la llegada exitosamente", "Info", "Registro Llegada");
        } else {
            mostrarMensaje("No se guardó la hora de llegada", "Info", "Registro Llegada");
        }

    }//GEN-LAST:event_btnRegistrarLlegadaActionPerformed

    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed
        LocalDateTime salida = LocalDateTime.now();

        Object[] options = {"Sí", "No"};
        int confirmacion = JOptionPane.showOptionDialog(this,
                "¿Está seguro de que desea registrar la salida en "
                + salida.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "?",
                "Registro Salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (confirmacion == JOptionPane.YES_OPTION) {
            control.registrarSalida(id_user, salida);
            mostrarMensaje("Se registró la salida exitosamente", "Info", "Registro Salida");
        } else {
            mostrarMensaje("No se guardó la hora de salida", "Info", "Registro Salida");
        }
    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed

    private void btnRegistrarLaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLaboresActionPerformed

        String labores = txtRegistroLabores.getText();

        Object[] options = {"Sí", "No"};
        int confirmacion = JOptionPane.showOptionDialog(this, "¿Está seguro de que desea registrar las labores?", "Registro Labores",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);
        if (confirmacion == JOptionPane.YES_OPTION) {
            control.registrarLabores(labores);
            mostrarMensaje("Se registraron las labores exitosamente", "Info", "Registro Labores");
        } else {
            mostrarMensaje("No se registraron labores", "Info", "Registro Labores");
        }

    }//GEN-LAST:event_btnRegistrarLaboresActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        person = control.traerUsuario(id_user);
        this.lblUserLogged.setText(person.getNombreUsuario());
    }//GEN-LAST:event_formWindowOpened

    private void btnVerHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHorarioActionPerformed

        VenEVerHorario venEVerHorario = new VenEVerHorario();
        venEVerHorario.setVisible(true);
        venEVerHorario.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnVerHorarioActionPerformed

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
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegistrarLabores;
    private javax.swing.JButton btnRegistrarLlegada;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JButton btnVerHorario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRegistrarLabores;
    private javax.swing.JLabel lblSistEmple;
    private javax.swing.JLabel lblUserLogged;
    private javax.swing.JTextArea txtRegistroLabores;
    // End of variables declaration//GEN-END:variables
}

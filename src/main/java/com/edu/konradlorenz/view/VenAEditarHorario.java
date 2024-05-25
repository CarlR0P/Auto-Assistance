package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class VenAEditarHorario extends javax.swing.JFrame {

    Controlador control;
    short id_user;

    public VenAEditarHorario(Controlador control, short id_user) {
        initComponents();
        this.control = control;
        this.id_user = id_user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEditarHor = new javax.swing.JLabel();
        lblHoraEnt = new javax.swing.JLabel();
        lblHoraSal = new javax.swing.JLabel();
        cmbHoraSal = new javax.swing.JComboBox<>();
        cmbHoraEnt = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jdcFechaIni = new com.toedter.calendar.JDateChooser();
        lblFechaIni = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEditarHor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEditarHor.setText("Editar Horario");

        lblHoraEnt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoraEnt.setText("Hora entrada:");

        lblHoraSal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoraSal.setText("Hora Salida:");

        cmbHoraSal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbHoraSal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", " " }));

        cmbHoraEnt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbHoraEnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jdcFechaIni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblFechaIni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaIni.setText("Fecha Inicial:");

        lblFechaFin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFechaFin.setText("Fecha Final:");

        jdcFechaFin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaIni)
                    .addComponent(lblFechaFin)
                    .addComponent(lblHoraEnt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHoraSal)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHoraSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEditarHor)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblEditarHor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraSal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHoraSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        // Obtener la fecha inicial
        Date fechaInicial = jdcFechaIni.getDate();
        if (fechaInicial == null) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha inicial.");
            return;
        }
        long fechaIni = fechaInicial.getTime();
        java.sql.Date fecha_sqlIni = new java.sql.Date(fechaIni);

        // Obtener la fecha final
        Date fechaFinal = jdcFechaFin.getDate();
        if (fechaFinal == null) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha final.");
            return;
        }
        long fechaFin = fechaFinal.getTime();
        java.sql.Date fecha_sqlFin = new java.sql.Date(fechaFin);

        // Obtener la hora de entrada
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaEntrada = LocalTime.parse((String) cmbHoraEnt.getSelectedItem(), formatter);

        // Obtener la hora de salida
        LocalTime horaSalida = LocalTime.parse((String) cmbHoraSal.getSelectedItem(), formatter);

        control.crearHorario(id_user, fecha_sqlIni, fecha_sqlFin, horaEntrada, horaSalida);

        /*Mostrar un mensaje con la hora de entrada para prueba
        JOptionPane.showMessageDialog(null, "Hora de Entrada: " + horaEntrada + "\nHora de Salida: " + horaSalida
            + "\nFecha Inicial (SQL): " + fecha_sqlIni + "\nFecha Final (SQL): " + fecha_sqlFin);*/

    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbHoraEnt;
    private javax.swing.JComboBox<String> cmbHoraSal;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaIni;
    private javax.swing.JLabel lblEditarHor;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaIni;
    private javax.swing.JLabel lblHoraEnt;
    private javax.swing.JLabel lblHoraSal;
    // End of variables declaration//GEN-END:variables
}

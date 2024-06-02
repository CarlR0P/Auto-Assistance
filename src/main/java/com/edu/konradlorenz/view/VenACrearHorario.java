package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Persona;
import com.edu.konradlorenz.model.ViajesEnElTiempoException;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class VenACrearHorario extends javax.swing.JFrame {

    Controlador control;
    short id_user;
    Persona person;

    public VenACrearHorario(Controlador control, short id_user, Persona person) {
        initComponents();
        this.control = control;
        this.id_user = id_user;
        this.person = person;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lblCreacionHor = new javax.swing.JLabel();
        javax.swing.JLabel lblHoraEnt = new javax.swing.JLabel();
        javax.swing.JLabel lblHoraSal = new javax.swing.JLabel();
        cmbHoraSal = new javax.swing.JComboBox<>();
        cmbHoraEnt = new javax.swing.JComboBox<>();
        javax.swing.JButton btnVolver = new javax.swing.JButton();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JButton btnGuardar = new javax.swing.JButton();
        jdcFechaIni = new com.toedter.calendar.JDateChooser();
        javax.swing.JLabel lblFechaIni = new javax.swing.JLabel();
        javax.swing.JLabel lblFechaFin = new javax.swing.JLabel();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));

        lblCreacionHor.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        lblCreacionHor.setText("Crear Horario");

        lblHoraEnt.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        lblHoraEnt.setText("Hora entrada:");
        lblHoraEnt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblHoraSal.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        lblHoraSal.setText("Hora Salida:");
        lblHoraSal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        cmbHoraSal.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        cmbHoraSal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));

        cmbHoraEnt.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        cmbHoraEnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));

        btnVolver.setBackground(new java.awt.Color(108, 152, 197));
        btnVolver.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(175, 210, 246), null, null));
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        btnGuardar.setBackground(new java.awt.Color(108, 152, 197));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(175, 210, 246), null, null));
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        jdcFechaIni.setBackground(new java.awt.Color(228, 235, 247));
        jdcFechaIni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jdcFechaIni.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N

        lblFechaIni.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        lblFechaIni.setText("Fecha Inicial:");

        lblFechaFin.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 14)); // NOI18N
        lblFechaFin.setText("Fecha Final:");
        lblFechaFin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jdcFechaFin.setBackground(new java.awt.Color(228, 235, 247));
        jdcFechaFin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jdcFechaFin.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblFechaIni)
                                .addComponent(lblFechaFin)
                                .addComponent(lblHoraEnt)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblHoraSal)
                                    .addGap(8, 8, 8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbHoraSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCreacionHor)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCreacionHor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened() {//GEN-FIRST:event_formWindowOpened
        person = control.traerUsuario(id_user);
    }//GEN-LAST:event_formWindowOpened

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        // Obtener la fecha inicial
        Date fechaInicial = jdcFechaIni.getDate();
        if (fechaInicial == null) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha inicial.");
            return;
        }
        LocalDate fechaIniLocal = fechaInicial.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Obtener la fecha final
        Date fechaFinal = jdcFechaFin.getDate();
        if (fechaFinal == null) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fecha final.");
            return;
        }
        LocalDate fechaFinLocal = fechaFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Obtener la hora de entrada
        String horaEntradaStr = (String) cmbHoraEnt.getSelectedItem();
        LocalTime horaEntrada = LocalTime.parse(horaEntradaStr);

        // Obtener la hora de salida
        String horaSalidaStr = (String) cmbHoraSal.getSelectedItem();
        LocalTime horaSalida = LocalTime.parse(horaSalidaStr);
        
       try {
           
            ViajesEnElTiempoException.viajeAlPasado(fechaInicial, fechaFinal);
            ViajesEnElTiempoException.viajeAlPasado(horaEntradaStr, horaSalidaStr);

            Object[] options = {"Sí", "No"};
            int confirmacion = JOptionPane.showOptionDialog(this, "¿Está seguro de que desea asignar este horario al empleado?", "Asignacion de Horario",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);

            if (confirmacion == JOptionPane.YES_OPTION) {
                control.establecerHorario(person, fechaIniLocal, fechaFinLocal, horaEntrada, horaSalida);
                mostrarMensaje("Se asigno el horario correctamente", "Info", "Asignacion de Horario");
                this.dispose();
            } else {
                mostrarMensaje("No se asigno horario", "Info", "Asignacion de Horario");
            }
        } catch (ViajesEnElTiempoException ex) {
            // Manejar la excepción
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Asignacion de Horario", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Manejar otras posibles excepciones
            mostrarMensaje("Error al asignar el horario: " + ex.getMessage(), "Error", "Asignacion de Horario");
        }
        
        /*Mostrar un mensaje con la hora de entrada para prueba
        JOptionPane.showMessageDialog(null, "Hora de Entrada: " + horaEntrada + "\nHora de Salida: " + horaSalida
                + "\nFecha Inicial: " + fechaIniLocal + "\nFecha Final: " + fechaFinLocal);*/

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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

    private javax.swing.JComboBox<String> cmbHoraEnt;
    private javax.swing.JComboBox<String> cmbHoraSal;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaIni;
    // End of variables declaration//GEN-END:variables
}

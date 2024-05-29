package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Empleado;
import com.edu.konradlorenz.model.Persona;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class VenAEditarHorario extends javax.swing.JFrame {

    Controlador control;
    short id_user;
    Persona person;

    public VenAEditarHorario(Controlador control, short id_user, Persona person) {
        initComponents();
        this.control = control;
        this.id_user = id_user;
        this.person = person;
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));

        lblEditarHor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEditarHor.setText("Editar Horario");

        lblHoraEnt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblHoraEnt.setText("Hora entrada:");

        lblHoraSal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblHoraSal.setText("Hora Salida:");

        cmbHoraSal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmbHoraSal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));

        cmbHoraEnt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmbHoraEnt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));

        btnVolver.setBackground(new java.awt.Color(108, 152, 197));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 220, 250), null, null));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(108, 152, 197));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(189, 220, 250), null, null));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jdcFechaIni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblFechaIni.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblFechaIni.setText("Fecha Inicial:");

        lblFechaFin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblFechaFin.setText("Fecha Final:");

        jdcFechaFin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEditarHor)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFechaIni)
                                    .addComponent(lblFechaFin)
                                    .addComponent(lblHoraEnt)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHoraSal)
                                        .addGap(8, 8, 8)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbHoraSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
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
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, Short.MAX_VALUE)
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

        Object[] options = {"Sí", "No"};
        int confirmacion = JOptionPane.showOptionDialog(this, "¿Está seguro de que desea asignar este horario al empleado?", "Asignacion de Horario",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                control.establecerHorario(person, fechaIniLocal, fechaFinLocal, horaEntrada, horaSalida);
                mostrarMensaje("Se asigno el horario correctamente", "Info", "Asignacion de Horario");
            } catch (Exception ex) {
                mostrarMensaje("Error al asignar el horario" + ex.getMessage(), "Error", "Asignacion de Horario");
            }
        } else {
            mostrarMensaje("No se asigno horario", "Info", "Asignacion de Horario");
        }
        /*Mostrar un mensaje con la hora de entrada para prueba
        JOptionPane.showMessageDialog(null, "Hora de Entrada: " + horaEntrada + "\nHora de Salida: " + horaSalida
                + "\nFecha Inicial: " + fechaIniLocal + "\nFecha Final: " + fechaFinLocal);*/
        this.dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        person = control.traerUsuario(id_user);
        
        if (person instanceof Empleado) {
            Empleado emple;
            emple =  (Empleado) person;
            LocalDate fechaInicial = emple.getFechaInicial();
            Date fechaInicialDate = Date.from(fechaInicial.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdcFechaIni.setDate(fechaInicialDate);
            LocalDate fechaFinal = emple.getFechaFinal();
            Date fechaFinalDate = Date.from(fechaFinal.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdcFechaFin.setDate(fechaFinalDate);
            cmbHoraEnt.setSelectedItem(emple.getHoraEntrada().toString());
            cmbHoraSal.setSelectedItem(emple.getHoraSalida().toString());
            
        } else {
            // Manejar el caso donde la persona no es un Empleado
            JOptionPane.showMessageDialog(this, "El usuario no es un empleado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowOpened

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

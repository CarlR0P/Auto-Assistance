package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Empleado;
import com.edu.konradlorenz.model.Persona;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class VenEVerHorario extends javax.swing.JFrame {
    
    Controlador control;
    short id_user;
    Persona person;
    

    public VenEVerHorario(short id_user, Controlador control) {
        initComponents();
        this.id_user = id_user;
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHorarioAsignado = new javax.swing.JLabel();
        lblDesde = new javax.swing.JLabel();
        txtFechaIni = new javax.swing.JTextField();
        lblHasta = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        lblHoraEnt = new javax.swing.JLabel();
        txtHoraEnt = new javax.swing.JTextField();
        lblHoraSal = new javax.swing.JLabel();
        txtHoraSal = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));

        lblHorarioAsignado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblHorarioAsignado.setText("Horario Asignado");

        lblDesde.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblDesde.setText("Desde el:");

        txtFechaIni.setEditable(false);
        txtFechaIni.setBackground(new java.awt.Color(228, 235, 247));
        txtFechaIni.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtFechaIni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblHasta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblHasta.setText("Hasta el:");

        txtFechaFin.setEditable(false);
        txtFechaFin.setBackground(new java.awt.Color(228, 235, 247));
        txtFechaFin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtFechaFin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblHoraEnt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblHoraEnt.setText("Hora Entrada:");

        txtHoraEnt.setEditable(false);
        txtHoraEnt.setBackground(new java.awt.Color(228, 235, 247));
        txtHoraEnt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtHoraEnt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblHoraSal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblHoraSal.setText("Hora Salida:");

        txtHoraSal.setEditable(false);
        txtHoraSal.setBackground(new java.awt.Color(228, 235, 247));
        txtHoraSal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtHoraSal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnVolver.setBackground(new java.awt.Color(108, 152, 197));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(175, 211, 248), null, null));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHoraEnt)
                            .addComponent(lblDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHoraSal)
                            .addComponent(lblHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraSal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblHorarioAsignado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblHorarioAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoraSal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        person = control.traerUsuario(id_user);
        
        if (person instanceof Empleado) {
            Empleado emple;
            emple =  (Empleado) person;
            txtFechaIni.setText(emple.getFechaInicial().toString());
            txtFechaFin.setText(emple.getFechaFinal().toString());
            txtHoraEnt.setText(emple.getHoraEntrada().toString());
            txtHoraSal.setText(emple.getHoraSalida().toString());
            
        } else {
            // Manejar el caso donde la persona no es un Empleado
            JOptionPane.showMessageDialog(this, "El usuario no es un empleado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblHoraEnt;
    private javax.swing.JLabel lblHoraSal;
    private javax.swing.JLabel lblHorarioAsignado;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaIni;
    private javax.swing.JTextField txtHoraEnt;
    private javax.swing.JTextField txtHoraSal;
    // End of variables declaration//GEN-END:variables
}

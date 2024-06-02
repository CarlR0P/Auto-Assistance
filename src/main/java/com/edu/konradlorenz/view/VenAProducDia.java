package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Empleado;
import com.edu.konradlorenz.model.Persona;
import javax.swing.JOptionPane;
import java.awt.*;

public class VenAProducDia extends javax.swing.JFrame {
    
    Controlador control;
    short id_user;
    Persona person;
    
    public VenAProducDia(Controlador control, short id_user) {
        initComponents();
        this.control = control;
        this.id_user = id_user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lblProductividadEmple = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        txtProductivadDelEmpleado = new javax.swing.JTextArea();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JButton btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));

        lblProductividadEmple.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 16)); // NOI18N
        lblProductividadEmple.setText("Productividad del Empleado");

        txtProductivadDelEmpleado.setColumns(20);
        txtProductivadDelEmpleado.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        txtProductivadDelEmpleado.setRows(5);
        jScrollPane1.setViewportView(txtProductivadDelEmpleado);

        btnVolver.setBackground(new java.awt.Color(108, 152, 197));
        btnVolver.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(187, 218, 249), null, null));
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblProductividadEmple))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblProductividadEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void formWindowOpened() {//GEN-FIRST:event_formWindowOpened

        person = control.traerUsuario(id_user);

        if (person instanceof Empleado) {
            Empleado emple;
            emple =  (Empleado) person;
            txtProductivadDelEmpleado.setText(emple.getRegistroLabor());
        } else {
            // Manejar el caso donde la persona no es un Empleado
            JOptionPane.showMessageDialog(this, "El usuario no es un empleado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowOpened

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private javax.swing.JTextArea txtProductivadDelEmpleado;
    // End of variables declaration//GEN-END:variables
}

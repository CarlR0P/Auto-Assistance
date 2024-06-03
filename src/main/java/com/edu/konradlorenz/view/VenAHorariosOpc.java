package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Empleado;
import com.edu.konradlorenz.model.Persona;
import java.awt.*;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VenAHorariosOpc extends javax.swing.JFrame {

    Controlador control;
    Persona person;

    public VenAHorariosOpc(Controlador control, Persona person) {
        initComponents();
        this.control = control;
        this.person = person;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSistAdmin = new javax.swing.JLabel();
        lblEmpleadosDispo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAEmpleados = new javax.swing.JTable();
        btnEliminarHorario = new javax.swing.JButton();
        btnCrearHorario = new javax.swing.JButton();
        btnEditarHorario = new javax.swing.JButton();
        btnRecargarTabla = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        btnProductividadEmple = new javax.swing.JButton();
        btnHistorialEmple = new javax.swing.JButton();
        lblUserLogged = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));

        lblSistAdmin.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 24)); // NOI18N
        lblSistAdmin.setText("Sistema Administrador");

        lblEmpleadosDispo.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 16)); // NOI18N
        lblEmpleadosDispo.setText("Empleados disponibles:");

        tblAEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAEmpleados);

        btnEliminarHorario.setBackground(new java.awt.Color(108, 152, 197));
        btnEliminarHorario.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 15)); // NOI18N
        btnEliminarHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarHorario.setText("Eliminar Horario");
        btnEliminarHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 217, 249), null, null));
        btnEliminarHorario.addActionListener(this::btnEliminarHorarioActionPerformed);

        btnCrearHorario.setBackground(new java.awt.Color(108, 152, 197));
        btnCrearHorario.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 15)); // NOI18N
        btnCrearHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearHorario.setText("Crear Horario");
        btnCrearHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 217, 249), null, null));
        btnCrearHorario.addActionListener(this::btnCrearHorarioActionPerformed);

        btnEditarHorario.setBackground(new java.awt.Color(108, 152, 197));
        btnEditarHorario.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 15)); // NOI18N
        btnEditarHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarHorario.setText("Editar Horario");
        btnEditarHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 217, 249), null, null));
        btnEditarHorario.addActionListener(this::btnEditarHorarioActionPerformed);

        btnRecargarTabla.setBackground(new java.awt.Color(108, 152, 197));
        btnRecargarTabla.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 15)); // NOI18N
        btnRecargarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnRecargarTabla.setText("Recargar Tabla");
        btnRecargarTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 217, 249), null, null));
        btnRecargarTabla.addActionListener(this::btnRecargarTablaActionPerformed);

        btnMenuPrincipal.setBackground(new java.awt.Color(108, 152, 197));
        btnMenuPrincipal.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 15)); // NOI18N
        btnMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 217, 249), null, null));
        btnMenuPrincipal.addActionListener(this::btnMenuPrincipalActionPerformed);

        btnProductividadEmple.setBackground(new java.awt.Color(108, 152, 197));
        btnProductividadEmple.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 15)); // NOI18N
        btnProductividadEmple.setForeground(new java.awt.Color(255, 255, 255));
        btnProductividadEmple.setText("Productividad del Dia");
        btnProductividadEmple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 217, 249), null, null));
        btnProductividadEmple.addActionListener(this::btnProductividadEmpleActionPerformed);

        btnHistorialEmple.setBackground(new java.awt.Color(108, 152, 197));
        btnHistorialEmple.setFont(new java.awt.Font("Century Gothic", Font.BOLD, 15)); // NOI18N
        btnHistorialEmple.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialEmple.setText("Historial Empleado");
        btnHistorialEmple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(185, 217, 249), null, null));
        btnHistorialEmple.addActionListener(this::btnHistorialEmpleActionPerformed);

        lblUserLogged.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblUserLogged.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSistAdmin)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRecargarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUserLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnEliminarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnCrearHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmpleadosDispo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnHistorialEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProductividadEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblSistAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUserLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblEmpleadosDispo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnCrearHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHistorialEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProductividadEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
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

        this.lblUserLogged.setText(person.getNombreUsuario());
        cargarTablaEmpleados();

    }//GEN-LAST:event_formWindowOpened

    private void btnCrearHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearHorarioActionPerformed

        if (tblAEmpleados.getSelectedRow() != -1) {
            short id_user = (short) Integer.parseInt(String.valueOf(tblAEmpleados.getValueAt(tblAEmpleados.getSelectedRow(), 0)));
            VenACrearHorario venCrearHorario = new VenACrearHorario(control, id_user, person);
            venCrearHorario.setVisible(true);
            venCrearHorario.setLocationRelativeTo(null);

        } else {
            mostrarMensaje("No selecciono ningun registro", "Error", "Error al editar");
        }


    }//GEN-LAST:event_btnCrearHorarioActionPerformed

    private void btnEditarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHorarioActionPerformed

        if (tblAEmpleados.getSelectedRow() != -1) {
            int selectedRow = tblAEmpleados.getSelectedRow();
            Object horaEntrada = tblAEmpleados.getValueAt(selectedRow, 2);
            Object horaSalida = tblAEmpleados.getValueAt(selectedRow, 3);

            if (horaEntrada != null && !horaEntrada.toString().isEmpty()
                    && horaSalida != null && !horaSalida.toString().isEmpty()) {

                short id_user = (short) Integer.parseInt(String.valueOf(tblAEmpleados.getValueAt(selectedRow, 0)));
                VenAEditarHorario venEditarHorario = new VenAEditarHorario(control, id_user, person);
                venEditarHorario.setVisible(true);
                venEditarHorario.setLocationRelativeTo(null);
            } else {
                mostrarMensaje("Horario de entrada y salida vacios, no se ha creado horario para el empleado.", "Error", "Error al editar");
            }
        } else {
            mostrarMensaje("No seleccionó ningún registro", "Error", "Error al editar");
        }

    }//GEN-LAST:event_btnEditarHorarioActionPerformed

    private void btnEliminarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHorarioActionPerformed

        if (tblAEmpleados.getRowCount() > 0) {
            if (tblAEmpleados.getSelectedRow() != -1) {
                int selectedRow = tblAEmpleados.getSelectedRow();
                Object horaEntrada = tblAEmpleados.getValueAt(selectedRow, 2);
                Object horaSalida = tblAEmpleados.getValueAt(selectedRow, 3);

                if (horaEntrada != null && !horaEntrada.toString().isEmpty()
                        && horaSalida != null && !horaSalida.toString().isEmpty()) {

                    short id_empleado = Short.parseShort(String.valueOf(tblAEmpleados.getValueAt(tblAEmpleados.getSelectedRow(), 0)));

                    Object[] options = {"Sí", "No"};
                    int confirmacion = JOptionPane.showOptionDialog(this, "¿Está seguro de que desea eliminar el horario de este empleado?", "Eliminacion de Horario",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null, options, options[0]);

                    if (confirmacion == JOptionPane.YES_OPTION) {
                        try {
                            control.eliminarHorario(id_empleado);
                            mostrarMensaje("Se eliminó el horario correctamente", "Info", "Eliminacion de Horario");
                        } catch (Exception ex) {
                            mostrarMensaje("Error al eliminar el horario: " + ex.getMessage(), "Error", "Eliminacion de Horario");
                        }
                    }
                } else {
                    mostrarMensaje("Horario de entrada y salida vacios, no se ha creado horario para el empleado.", "Error", "Error al eliminar");
                }
            } else {
                mostrarMensaje("No seleccionó ningún registro", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("La tabla está vacía", "Error", "Error al eliminar");
        }

    }//GEN-LAST:event_btnEliminarHorarioActionPerformed

    private void btnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarTablaActionPerformed
        cargarTablaEmpleados();
    }//GEN-LAST:event_btnRecargarTablaActionPerformed

    private void btnHistorialEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialEmpleActionPerformed

        if (tblAEmpleados.getSelectedRow() != -1) {
            short id_user = (short) Integer.parseInt(String.valueOf(tblAEmpleados.getValueAt(tblAEmpleados.getSelectedRow(), 0)));
            VenAHistorialEmple venAHistorialEmple = new VenAHistorialEmple(control, id_user);
            venAHistorialEmple.setVisible(true);
            venAHistorialEmple.setLocationRelativeTo(null);
        } else {
            mostrarMensaje("No selecciono ningun registro", "Error", "Error al Ver campo Seleccionado");
        }

    }//GEN-LAST:event_btnHistorialEmpleActionPerformed

    private void btnProductividadEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductividadEmpleActionPerformed

        if (tblAEmpleados.getSelectedRow() != -1) {
            short id_user = (short) Integer.parseInt(String.valueOf(tblAEmpleados.getValueAt(tblAEmpleados.getSelectedRow(), 0)));
            VenAProducDia venAProducDia = new VenAProducDia(control, id_user);
            venAProducDia.setVisible(true);
            venAProducDia.setLocationRelativeTo(null);
        } else {
            mostrarMensaje("No selecciono ningun registro", "Error", "Error al Ver campo Seleccionado");
        }

    }//GEN-LAST:event_btnProductividadEmpleActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed

        VentanaAdministrador ventaAdmin = new VentanaAdministrador(control, person);
        ventaAdmin.setVisible(true);
        ventaAdmin.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void cargarTablaEmpleados() {

        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] titulos = {"Id", "Usuario", "Horario Entrada", "Horario Salida"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<Persona> listaEmpleados = control.traerEmpleados();

        if (listaEmpleados != null) {
            for (Persona perso : listaEmpleados) {
                Empleado emple = (Empleado) perso;
                Object[] objeto = {emple.getId(), emple.getNombreUsuario(), emple.getHoraEntrada(), emple.getHoraSalida()};
                modeloTabla.addRow(objeto);
            }
        }
        tblAEmpleados.setModel(modeloTabla);

    }

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
    private javax.swing.JButton btnCrearHorario;
    private javax.swing.JButton btnEditarHorario;
    private javax.swing.JButton btnEliminarHorario;
    private javax.swing.JButton btnHistorialEmple;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnProductividadEmple;
    private javax.swing.JButton btnRecargarTabla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpleadosDispo;
    private javax.swing.JLabel lblSistAdmin;
    private javax.swing.JLabel lblUserLogged;
    private javax.swing.JTable tblAEmpleados;
    // End of variables declaration//GEN-END:variables
}

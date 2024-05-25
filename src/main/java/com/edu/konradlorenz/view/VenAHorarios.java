package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.Persona;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VenAHorarios extends javax.swing.JFrame {

    Controlador control;
    Persona person;

    public VenAHorarios(Controlador control, Persona person) {
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
                formWindowOpened(evt);
            }
        });

        lblSistAdmin.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblSistAdmin.setText("Sistema Administrador");

        lblEmpleadosDispo.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
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

        btnEliminarHorario.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        btnEliminarHorario.setText("Eliminar Horario");
        btnEliminarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHorarioActionPerformed(evt);
            }
        });

        btnCrearHorario.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        btnCrearHorario.setText("Crear Horario");
        btnCrearHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearHorarioActionPerformed(evt);
            }
        });

        btnEditarHorario.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        btnEditarHorario.setText("Editar Horario");
        btnEditarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHorarioActionPerformed(evt);
            }
        });

        btnRecargarTabla.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        btnRecargarTabla.setText("Recargar Tabla");
        btnRecargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarTablaActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        btnProductividadEmple.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        btnProductividadEmple.setText("Productividad del Dia");
        btnProductividadEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductividadEmpleActionPerformed(evt);
            }
        });

        btnHistorialEmple.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        btnHistorialEmple.setText("Historial Empleado");
        btnHistorialEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialEmpleActionPerformed(evt);
            }
        });

        lblUserLogged.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

    private void btnEliminarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHorarioActionPerformed


    }//GEN-LAST:event_btnEliminarHorarioActionPerformed

    private void btnCrearHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearHorarioActionPerformed

        if (tblAEmpleados.getSelectedRow() != -1) {
            short id_user = (short) Integer.parseInt(String.valueOf(tblAEmpleados.getValueAt(tblAEmpleados.getSelectedRow(), 0)));
            VenACrearHorario venCrearHorario = new VenACrearHorario(control, id_user);
            venCrearHorario.setVisible(true);
            venCrearHorario.setLocationRelativeTo(null);

        } else {
            mostrarMensaje("No selecciono ningun registro", "Error", "Error al editar");
        }


    }//GEN-LAST:event_btnCrearHorarioActionPerformed

    private void btnEditarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHorarioActionPerformed

        if (tblAEmpleados.getSelectedRow() != -1) {
            short id_user = (short) Integer.parseInt(String.valueOf(tblAEmpleados.getValueAt(tblAEmpleados.getSelectedRow(), 0)));
            VenAEditarHorario venEditarHorario = new VenAEditarHorario(control, id_user);
            venEditarHorario.setVisible(true);
            venEditarHorario.setLocationRelativeTo(null);

        } else {
            mostrarMensaje("No selecciono ningun registro", "Error", "Error al editar");
        }


    }//GEN-LAST:event_btnEditarHorarioActionPerformed

    private void btnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarTablaActionPerformed
        cargarTablaEmpleados();
    }//GEN-LAST:event_btnRecargarTablaActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed

        VentanaAdministrador ventaAdmin = new VentanaAdministrador(control, person);
        ventaAdmin.setVisible(true);
        ventaAdmin.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnProductividadEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductividadEmpleActionPerformed

        VenAProducDia venAProducDia = new VenAProducDia();
        venAProducDia.setVisible(true);
        venAProducDia.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnProductividadEmpleActionPerformed

    private void btnHistorialEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialEmpleActionPerformed

        VenAHistorialEmple venAHistorialEmple = new VenAHistorialEmple();
        venAHistorialEmple.setVisible(true);
        venAHistorialEmple.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnHistorialEmpleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.lblUserLogged.setText(person.getNombreUsuario());
        cargarTablaEmpleados();

    }//GEN-LAST:event_formWindowOpened

    private void cargarTablaEmpleados() {

        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Id", "Usuario", "Horario Entrada", "Horario Salida"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<Persona> listaEmpleados = control.traerEmpleados();

        if (listaEmpleados != null) {
            for (Persona perso : listaEmpleados) {
                Object[] objeto = {perso.getId(), perso.getNombreUsuario()};
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

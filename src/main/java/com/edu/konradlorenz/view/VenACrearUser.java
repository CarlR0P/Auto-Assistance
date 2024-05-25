package com.edu.konradlorenz.view;

import com.edu.konradlorenz.controller.Controlador;
import com.edu.konradlorenz.model.EmpleadoVacioException;
import com.edu.konradlorenz.model.ExageradosException;
import com.edu.konradlorenz.model.NoLeenException;
import com.edu.konradlorenz.model.Persona;
import com.edu.konradlorenz.model.YaExisteException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VenACrearUser extends javax.swing.JFrame {

    Controlador control;
    Persona person;

    public VenACrearUser(Controlador control) {
        this.control = control;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblNombreUser = new javax.swing.JLabel();
        lblCreacionUser = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtNombreUser = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        lblNombreApellido = new javax.swing.JLabel();
        txtNombreApellido = new javax.swing.JTextField();
        lblTipoDoc = new javax.swing.JLabel();
        cmbTipoDoc = new javax.swing.JComboBox<>();
        lblNumeroDoc = new javax.swing.JLabel();
        txtNumeroDoc = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblRol = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();

        jTextField1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(192, 214, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 650));

        lblNombreUser.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombreUser.setForeground(new java.awt.Color(10, 10, 10));
        lblNombreUser.setText("Nombre de Usuario:");

        lblCreacionUser.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblCreacionUser.setForeground(new java.awt.Color(10, 10, 10));
        lblCreacionUser.setText("Creacion de Usuario");

        lblContrasena.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(10, 10, 10));
        lblContrasena.setText("Contraseña:");

        btnGuardar.setBackground(new java.awt.Color(108, 152, 197));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(151, 201, 252), null, null));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(108, 152, 197));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(171, 212, 253), null, null));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(108, 152, 197));
        btnVolver.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(133, 183, 232), null, null));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtNombreUser.setBackground(new java.awt.Color(228, 235, 247));
        txtNombreUser.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombreUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNombreUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUserActionPerformed(evt);
            }
        });

        txtContrasena.setBackground(new java.awt.Color(228, 235, 247));
        txtContrasena.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        lblNombreApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombreApellido.setForeground(new java.awt.Color(10, 10, 10));
        lblNombreApellido.setText("Nombres y Apellidos:");

        txtNombreApellido.setBackground(new java.awt.Color(228, 235, 247));
        txtNombreApellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombreApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreApellidoActionPerformed(evt);
            }
        });

        lblTipoDoc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTipoDoc.setForeground(new java.awt.Color(10, 10, 10));
        lblTipoDoc.setText("Tipo de Documento:");

        cmbTipoDoc.setBackground(new java.awt.Color(228, 235, 247));
        cmbTipoDoc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cmbTipoDoc.setForeground(new java.awt.Color(10, 10, 10));
        cmbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadania", "Cedula de Extranjeria", "Pasaporte" }));
        cmbTipoDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDocActionPerformed(evt);
            }
        });

        lblNumeroDoc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNumeroDoc.setForeground(new java.awt.Color(10, 10, 10));
        lblNumeroDoc.setText("Numero de Documento:");

        txtNumeroDoc.setBackground(new java.awt.Color(228, 235, 247));
        txtNumeroDoc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNumeroDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(10, 10, 10));
        lblCorreo.setText("Correo:");

        txtCorreo.setBackground(new java.awt.Color(228, 235, 247));
        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(10, 10, 10));
        lblTelefono.setText("Telefono:");

        txtTelefono.setBackground(new java.awt.Color(228, 235, 247));
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblRol.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblRol.setForeground(new java.awt.Color(10, 10, 10));
        lblRol.setText("Rol:");

        cmbRol.setBackground(new java.awt.Color(228, 235, 247));
        cmbRol.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cmbRol.setForeground(new java.awt.Color(10, 10, 10));
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "empleado" }));
        cmbRol.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCreacionUser)
                .addGap(123, 123, 123))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContrasena)
                            .addComponent(lblNombreUser)
                            .addComponent(lblNombreApellido)
                            .addComponent(lblTipoDoc)
                            .addComponent(lblNumeroDoc)
                            .addComponent(lblCorreo)
                            .addComponent(lblTelefono)
                            .addComponent(lblRol)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtContrasena)
                                .addComponent(txtNombreUser)
                                .addComponent(cmbTipoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumeroDoc)
                                .addComponent(txtNombreApellido)
                                .addComponent(txtCorreo)
                                .addComponent(txtTelefono))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblCreacionUser, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    }//GEN-LAST:event_formWindowOpened

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombreUser = txtNombreUser.getText();
        String contra = txtContrasena.getText();
        String nombresApellidos = txtNombreApellido.getText();
        String tipoDoc = (String) cmbTipoDoc.getSelectedItem();
        String numeroDoc = txtNumeroDoc.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String rol = (String) cmbRol.getSelectedItem();

        try {
            EmpleadoVacioException.validarCampos(nombreUser, contra, nombresApellidos, numeroDoc, correo, telefono); //Validacion si hay campos vacios 
            boolean usuarioExiste = YaExisteException.usuarioYaExiste(nombreUser); //Validacion el usuario ya existe   

            if (usuarioExiste) {
                mostrarMensaje("El nombre de usuario ya está en uso", "Error", "Error al crear usuario");
            } else {
                NoLeenException.validarTextos(nombresApellidos);
                NoLeenException.validarCorreo(correo);
                NoLeenException.validarNumeros(telefono);
                NoLeenException.validarNumeros(numeroDoc);
                ExageradosException.validarContrasena(contra);
                ExageradosException.validarTelefono(telefono);
                ExageradosException.validarNumeroDocumento(numeroDoc);
                //Creacion de Usuario
                control.crearUsuario(nombreUser, contra, nombresApellidos, tipoDoc, numeroDoc, correo, telefono, rol);
                mostrarMensaje("Usuario creado correctamente", "Info", "Creacion Exitosa");
            }
        } catch (EmpleadoVacioException a) {
            mostrarMensaje("Todos los campos son obligatorios.", "Error", "Error al guardar");
        } catch (YaExisteException e) {
            mostrarMensaje("El nombre de Usuario ya fue asignado previamente.", "Error", "Error al guardar");
        } catch (NoLeenException c) {
            mostrarMensaje(c.getMessage(), "Error", "Error al guardar");
        } catch (ExageradosException d) {
            mostrarMensaje(d.getMessage(), "Error", "Error al guardar");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtNombreUser.setText("");
        txtContrasena.setText("");
        txtNombreApellido.setText("");
        txtNumeroDoc.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreApellidoActionPerformed

    private void cmbTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoDocActionPerformed

    private void txtNombreUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUserActionPerformed

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
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> cmbTipoDoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCreacionUser;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblNombreUser;
    private javax.swing.JLabel lblNumeroDoc;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoDoc;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreApellido;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JTextField txtNumeroDoc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
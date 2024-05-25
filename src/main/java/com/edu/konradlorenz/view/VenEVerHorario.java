package com.edu.konradlorenz.view;

public class VenEVerHorario extends javax.swing.JFrame {

    public VenEVerHorario() {
        initComponents();
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
        lblHoraEnt1 = new javax.swing.JLabel();
        txtHoraEnt1 = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblHorarioAsignado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHorarioAsignado.setText("Horario Asignado");

        lblDesde.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDesde.setText("Desde el:");

        txtFechaIni.setEditable(false);
        txtFechaIni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblHasta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHasta.setText("Hasta el:");

        txtFechaFin.setEditable(false);
        txtFechaFin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblHoraEnt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoraEnt.setText("Hora Entrada:");

        txtHoraEnt.setEditable(false);
        txtHoraEnt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblHoraEnt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoraEnt1.setText("Hora Entrada:");

        txtHoraEnt1.setEditable(false);
        txtHoraEnt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
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
                            .addComponent(lblHoraEnt1)
                            .addComponent(lblHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblHorarioAsignado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnVolver)))
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
                    .addComponent(lblHoraEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JLabel lblHoraEnt;
    private javax.swing.JLabel lblHoraEnt1;
    private javax.swing.JLabel lblHorarioAsignado;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaIni;
    private javax.swing.JTextField txtHoraEnt;
    private javax.swing.JTextField txtHoraEnt1;
    // End of variables declaration//GEN-END:variables
}

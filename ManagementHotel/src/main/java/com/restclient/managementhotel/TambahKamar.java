/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restclient.managementhotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TambahKamar extends javax.swing.JFrame {

    /**
     * Creates new form TambahKamar
     */
    public TambahKamar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        cbTTT = new javax.swing.JComboBox<>();
        cbKamar = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        txtHarga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nomor Kamar");

        jLabel2.setText("Tipe Tempat Tidur");

        jLabel3.setText("Tipe Kamar");

        jLabel4.setText("Status Kamar");

        jLabel5.setText("Harga ");

        jLabel6.setText("Rp.");

        cbTTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Bed", "Double Bed", "Twin Bed", "Family Bed" }));

        cbKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard Room", "Deluxe Room", "Superior Room", "Family Room", "Suite Room", "Presidential Roo", "Junior Suite Roomm" }));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tersedia", "dipesan" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbKamar, 0, 0, Short.MAX_VALUE)
                            .addComponent(txtNo)
                            .addComponent(cbTTT, 0, 151, Short.MAX_VALUE)
                            .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHarga)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnSimpan)
                        .addGap(112, 112, 112)
                        .addComponent(btnKembali)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnKembali))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
          try {
      //Menyebabkan xml injection
            String no = txtNo.getText(), Tttidur = (String) cbTTT.getSelectedItem(), tipekamar = (String) cbKamar.getSelectedItem(), status = (String) cbStatus.getSelectedItem();
            String harga = txtHarga.getText();
            if (!Pattern.matches("[[0-9]]+",no)){
                JOptionPane.showMessageDialog(null, "Format Nomor Kamar Tidak valid");
            } else if 
                  (!Pattern.matches("[[0-9]]+",harga)){
                JOptionPane.showMessageDialog(null, "Format Nomor Kamar Tidak valid");
            }
              else {
                    simpanKamar();
                    Kamar1 formkamar = new Kamar1();
                    formkamar.show();
                    this.hide();
                }
            }
            catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
            // TODO add your handling code here:
        Kamar1 form = null;
        form = new Kamar1();
        form.show();
        this.hide();
    }//GEN-LAST:event_btnKembaliActionPerformed
    private void simpanKamar() throws Exception {
        String pil1 = (String) cbTTT.getSelectedItem();
        String pil2 = (String) cbKamar.getSelectedItem();
        String no = txtNo.getText(); //Meyebabkan unsanitized input
        String status =  (String) cbStatus.getSelectedItem();
        int sts=0;
        if(status.equals("tersedia")){
            sts = 1;
        }else if(status.equals("dipesan")){
            sts = 0;
        };
        int harga =  Integer.parseInt(txtHarga.getText());
        
        try {
            Connection conn = Koneksi.connectDB();  
            String sql = "INSERT INTO kamar (no_kamar, tipe_bed, "
                    + "tipe_kamar, occupied,harga) VALUES "
                    + "('" + no + "', '" + pil1+ "','" + pil2 + "', '"
                    + sts+ "', '" + harga + "');";
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO kamar(no_kamar, tipe_bed, "
                    + "tipe_kamar, occupied,harga) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, no);
            stmt.setString(2, pil1);
            stmt.setString(3, pil2);
            stmt.setInt(4, sts);
            stmt.setInt(5, harga);
            int executeUpdate = stmt.executeUpdate();

        } catch (java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan " + ex);
            return;
        }
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahKamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbKamar;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbTTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}

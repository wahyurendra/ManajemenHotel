/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restclient.managementhotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author prase
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        countReser();
        countPengunjung();
        countKamar();
        countResepsionis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reserPanel = new javax.swing.JPanel();
        header1 = new javax.swing.JLabel();
        lblreser = new javax.swing.JLabel();
        penPanel = new javax.swing.JPanel();
        header2 = new javax.swing.JLabel();
        lblpen = new javax.swing.JLabel();
        kamarPanel = new javax.swing.JPanel();
        header3 = new javax.swing.JLabel();
        lblkamar = new javax.swing.JLabel();
        resepPanel = new javax.swing.JPanel();
        header4 = new javax.swing.JLabel();
        lblresep = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reserPanel.setBackground(new java.awt.Color(182, 151, 215));
        reserPanel.setLayout(new java.awt.BorderLayout());

        header1.setBackground(new java.awt.Color(151, 81, 200));
        header1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        header1.setForeground(new java.awt.Color(254, 254, 254));
        header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header1.setText("header1");
        header1.setOpaque(true);
        reserPanel.add(header1, java.awt.BorderLayout.PAGE_START);

        lblreser.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblreser.setForeground(new java.awt.Color(254, 254, 254));
        lblreser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreser.setText("Jumlah Reservasi");
        reserPanel.add(lblreser, java.awt.BorderLayout.CENTER);
        lblreser.getAccessibleContext().setAccessibleName("Jumlah Reservasi");

        penPanel.setBackground(new java.awt.Color(182, 151, 215));
        penPanel.setLayout(new java.awt.BorderLayout());

        header2.setBackground(new java.awt.Color(151, 81, 200));
        header2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        header2.setForeground(new java.awt.Color(254, 254, 254));
        header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header2.setText("header2");
        header2.setOpaque(true);
        penPanel.add(header2, java.awt.BorderLayout.PAGE_START);
        header2.getAccessibleContext().setAccessibleName("Jumlah Pengunjung");

        lblpen.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblpen.setForeground(new java.awt.Color(254, 254, 254));
        lblpen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpen.setText("Jumlah Pengunjung");
        penPanel.add(lblpen, java.awt.BorderLayout.CENTER);
        lblpen.getAccessibleContext().setAccessibleName("Jumlah Pengunjung");

        kamarPanel.setBackground(new java.awt.Color(182, 151, 215));
        kamarPanel.setLayout(new java.awt.BorderLayout());

        header3.setBackground(new java.awt.Color(151, 81, 200));
        header3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        header3.setForeground(new java.awt.Color(254, 254, 254));
        header3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header3.setText("header3");
        header3.setOpaque(true);
        kamarPanel.add(header3, java.awt.BorderLayout.PAGE_START);

        lblkamar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblkamar.setForeground(new java.awt.Color(254, 254, 254));
        lblkamar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblkamar.setText("Jumlah Kamar");
        kamarPanel.add(lblkamar, java.awt.BorderLayout.CENTER);
        lblkamar.getAccessibleContext().setAccessibleName("Jumlah Kamar");

        resepPanel.setBackground(new java.awt.Color(182, 151, 215));
        resepPanel.setLayout(new java.awt.BorderLayout());

        header4.setBackground(new java.awt.Color(151, 81, 200));
        header4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        header4.setForeground(new java.awt.Color(254, 254, 254));
        header4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header4.setText("header4");
        header4.setOpaque(true);
        resepPanel.add(header4, java.awt.BorderLayout.PAGE_START);

        lblresep.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblresep.setForeground(new java.awt.Color(254, 254, 254));
        lblresep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblresep.setText("Jumlah Reservasi");
        resepPanel.add(lblresep, java.awt.BorderLayout.CENTER);
        lblresep.getAccessibleContext().setAccessibleName("Jumlah Resepsionis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(770, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(penPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(498, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(535, Short.MAX_VALUE)
                    .addComponent(kamarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(266, 266, 266)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(763, Short.MAX_VALUE)
                    .addComponent(resepPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(reserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(203, 203, 203)
                    .addComponent(penPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(266, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addComponent(kamarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(268, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(202, 202, 202)
                    .addComponent(resepPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
     Connection conn = Koneksi.connectDB();
    public void countReser(){
        String query = "SELECT COUNT(reservasi.id_reservasi) AS total FROM reservasi";
        Integer totalItem = 0;
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            totalItem = rs.getInt("total");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        String total = totalItem.toString();
        header1.setText("Jumlah Reservasi");
        lblreser.setText(total);
        lblreser.validate();
    }
    public void countPengunjung(){
        String query = "SELECT COUNT(customer.id_customer) AS total FROM customer";
        Integer totalItem = 0;
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            totalItem = rs.getInt("total");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        String total = totalItem.toString();
        header2.setText("Jumlah Pengunjung");
        lblpen.setText(total);
        lblpen.validate();
    }
    public void countKamar(){
        String query = "SELECT COUNT(kamar.id_kamar) AS total FROM kamar";
        Integer totalItem = 0;
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            totalItem = rs.getInt("total");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        String total = totalItem.toString();
        header3.setText("Jumlah Kamar");
        lblkamar.setText(total);
        lblkamar.validate();
    }
    public void countResepsionis(){
        String query = "SELECT COUNT(receptionist.id_recept) AS total FROM receptionist";
        Integer totalItem = 0;
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            totalItem = rs.getInt("total");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        String total = totalItem.toString();
        header4.setText("Jumlah Kamar");
        lblresep.setText(total);
        lblresep.validate();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel header1;
    private javax.swing.JLabel header2;
    private javax.swing.JLabel header3;
    private javax.swing.JLabel header4;
    private javax.swing.JPanel kamarPanel;
    private javax.swing.JLabel lblkamar;
    private javax.swing.JLabel lblpen;
    private javax.swing.JLabel lblresep;
    private javax.swing.JLabel lblreser;
    private javax.swing.JPanel penPanel;
    private javax.swing.JPanel resepPanel;
    private javax.swing.JPanel reserPanel;
    // End of variables declaration//GEN-END:variables
}

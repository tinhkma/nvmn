/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhanvien;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author xuant
 */
public class NhanVienForm extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienForm
     */

    private double luongThucNhan = 0;
    private DefaultTableModel tableModel = new DefaultTableModel();

    public NhanVienForm() {
        initComponents();
        jt_noti.setVisible(false);
        Object[] title = {"Ho Ten", "Dia Chi", "Gioi Tinh", "Phong Ban", "Luong Thuc Linh"};
        String[] listPhongBan = {"Thiet Bi", "Nhan Su", "R&D", "Kinh Doanh"};
        cb_phongBan.setModel(new javax.swing.DefaultComboBoxModel<>(listPhongBan));
        tableModel.setColumnIdentifiers(title);
        jt_nhanViens.setModel(tableModel);
        getData();
    }

    private void getData() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jt_hoTen = new javax.swing.JTextField();
        jt_diaChi = new javax.swing.JTextField();
        jt_heSoLuong = new javax.swing.JTextField();
        cb_nam = new javax.swing.JCheckBox();
        cb_nu = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_phongBan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jt_thamNien = new javax.swing.JTextField();
        jt_luongCoBan = new javax.swing.JTextField();
        jb_xoa = new javax.swing.JButton();
        jb_ok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_nhanViens = new javax.swing.JTable();
        jt_noti = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Quan Ly Nhan Vien");

        jt_diaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_diaChiActionPerformed(evt);
            }
        });

        jt_heSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_heSoLuongActionPerformed(evt);
            }
        });

        cb_nam.setText("Nam");
        cb_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_namActionPerformed(evt);
            }
        });

        cb_nu.setText("Nu");
        cb_nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nuActionPerformed(evt);
            }
        });

        jLabel2.setText("Gioi Tinh:");

        jLabel3.setText("Ho ten:");

        jLabel4.setText("Dia Chi:");

        jLabel5.setText("Phong ban:");

        cb_phongBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("He so luong:");

        jLabel7.setText("Tham nien:");

        jLabel8.setText("Luong co ban:");

        jb_xoa.setText("Xoa");
        jb_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_xoaActionPerformed(evt);
            }
        });

        jb_ok.setText("Ok");
        jb_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_okActionPerformed(evt);
            }
        });

        jt_nhanViens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jt_nhanViens);

        jt_noti.setText("Noti");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_noti)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb_xoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jb_ok))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cb_nam)
                                        .addGap(33, 33, 33)
                                        .addComponent(cb_nu))
                                    .addComponent(jt_diaChi)
                                    .addComponent(jt_hoTen)
                                    .addComponent(jt_thamNien)
                                    .addComponent(jt_luongCoBan)
                                    .addComponent(cb_phongBan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jt_heSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cb_nam)
                            .addComponent(cb_nu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_phongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_heSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jt_thamNien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jt_luongCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_xoa)
                            .addComponent(jb_ok)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jt_noti)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_diaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_diaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_diaChiActionPerformed

    private void jt_heSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_heSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_heSoLuongActionPerformed

    private void jb_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_xoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_xoaActionPerformed

    private void cb_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_namActionPerformed
        cb_nu.setSelected(false);
    }//GEN-LAST:event_cb_namActionPerformed

    private void cb_nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nuActionPerformed
        cb_nam.setSelected(false);
    }//GEN-LAST:event_cb_nuActionPerformed

    private void jb_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_okActionPerformed
        try {
            double hesoLuong = Double.parseDouble(jt_heSoLuong.getText().toString());
            double thamNien = Double.parseDouble(jt_thamNien.getText().toString());
            double luongCoBan = Double.parseDouble(jt_luongCoBan.getText().toString());
            luongThucNhan = hesoLuong*luongCoBan*(1+thamNien/100);
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Phai la so");
        }
    }//GEN-LAST:event_jb_okActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new NhanVienForm().setVisible(true);
        });
        System.out.println("hhihi");
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_nam;
    private javax.swing.JCheckBox cb_nu;
    private javax.swing.JComboBox<String> cb_phongBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jb_ok;
    private javax.swing.JButton jb_xoa;
    private javax.swing.JTextField jt_diaChi;
    private javax.swing.JTextField jt_heSoLuong;
    private javax.swing.JTextField jt_hoTen;
    private javax.swing.JTextField jt_luongCoBan;
    private javax.swing.JTable jt_nhanViens;
    private javax.swing.JLabel jt_noti;
    private javax.swing.JTextField jt_thamNien;
    // End of variables declaration//GEN-END:variables
}

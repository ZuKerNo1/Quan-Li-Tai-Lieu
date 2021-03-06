/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Service.TaiLieuService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bao;
import model.Sach;
import model.TaiLieu;
import model.TapChi;

/**
 *
 * @author FSC
 */
public class AddFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddFrame
     */
    public AddFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nxbText = new javax.swing.JTextField();
        banPhText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        soPhText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tacgiaText = new javax.swing.JTextField();
        dayPhText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        sachRadio = new javax.swing.JRadioButton();
        tapChiRadio = new javax.swing.JRadioButton();
        baoRadio = new javax.swing.JRadioButton();
        monthPhText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        trangText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("TH??M M???I");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("S??? Ph??t H??nh");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Ng??y Ph??t H??nh");

        nxbText.setColumns(22);
        nxbText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        banPhText.setColumns(22);
        banPhText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("T??n NXB");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("T??n T??c Gi???");

        soPhText.setColumns(22);
        soPhText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Lo???i");

        tacgiaText.setColumns(22);
        tacgiaText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        dayPhText.setColumns(22);
        dayPhText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("S??? B???n Ph??t H??nh");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setText("S??? Trang");

        submitBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        submitBtn.setText("SUBMIT");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(sachRadio);
        sachRadio.setText("S??ch");
        sachRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sachRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(tapChiRadio);
        tapChiRadio.setText("T???p Ch??");
        tapChiRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapChiRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(baoRadio);
        baoRadio.setText("B??o");
        baoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baoRadioActionPerformed(evt);
            }
        });

        monthPhText.setColumns(22);
        monthPhText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        monthPhText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthPhTextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Th??ng Ph??t H??nh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sachRadio)
                            .addGap(27, 27, 27)
                            .addComponent(tapChiRadio)
                            .addGap(32, 32, 32)
                            .addComponent(baoRadio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(banPhText)
                                        .addComponent(tacgiaText)
                                        .addComponent(soPhText)
                                        .addComponent(dayPhText)
                                        .addComponent(monthPhText)
                                        .addComponent(trangText)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nxbText))
                                .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sachRadio)
                        .addComponent(tapChiRadio)
                        .addComponent(baoRadio)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nxbText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(banPhText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tacgiaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trangText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soPhText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthPhText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayPhText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        TaiLieu tailieu = new TaiLieu();
        Sach sach = new Sach();
        TapChi tapchi = new TapChi();
        Bao bao = new Bao();
        String type = "";
        if (sachRadio.isSelected()) {
            type += "Sach";
            sach.setTenNXB(nxbText.getText());
            sach.setSoBanPhatHanh(Integer.valueOf(banPhText.getText()));
            sach.setTenTacGia(tacgiaText.getText());
            sach.setSoTrang(Integer.valueOf(trangText.getText()));
            sach.setLoai(type);
            try {
                TaiLieuService.addSach(sach);
            } catch (SQLException ex) {
                Logger.getLogger(AddFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (tapChiRadio.isSelected()) {
            type += "TapChi";
            tapchi.setTenNXB(nxbText.getText());
            tapchi.setSoBanPhatHanh(Integer.valueOf(banPhText.getText()));
            tapchi.setSoPhatHanh(soPhText.getText());
            tapchi.setThangPhatHanh(Integer.valueOf(monthPhText.getText()));
            tapchi.setLoai(type);
            try {
                TaiLieuService.addTapChi(tapchi);
            } catch (SQLException ex) {
                Logger.getLogger(AddFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if (baoRadio.isSelected()) {
            type += "Bao";
            bao.setTenNXB(nxbText.getText());
            bao.setSoBanPhatHanh(Integer.valueOf(banPhText.getText()));
            bao.setNgayPhatHanh(Integer.valueOf(dayPhText.getText()));
            bao.setLoai(type);
            try {
                TaiLieuService.addBao(bao);
            } catch (SQLException ex) {
                Logger.getLogger(AddFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        

        new mainFrame().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new mainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void sachRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sachRadioActionPerformed
        // TODO add your handling code here:
        if (sachRadio.isSelected()) {
            soPhText.setVisible(false);
            jLabel5.setVisible(false);
            dayPhText.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            monthPhText.setVisible(false);
            jLabel3.setVisible(true);
            tacgiaText.setVisible(true);
            jLabel10.setVisible(true);
            trangText.setVisible(true);
        }
    }//GEN-LAST:event_sachRadioActionPerformed

    private void monthPhTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthPhTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthPhTextActionPerformed

    private void tapChiRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapChiRadioActionPerformed
        // TODO add your handling code here:
        if (tapChiRadio.isSelected()) {
            soPhText.setVisible(true);
            jLabel5.setVisible(true);
            dayPhText.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(true);
            monthPhText.setVisible(true);
            jLabel3.setVisible(false);
            tacgiaText.setVisible(false);
            jLabel10.setVisible(false);
            trangText.setVisible(false);
        }
    }//GEN-LAST:event_tapChiRadioActionPerformed

    private void baoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baoRadioActionPerformed
        // TODO add your handling code here:
        soPhText.setVisible(false);
        jLabel5.setVisible(false);
        dayPhText.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(false);
        monthPhText.setVisible(false);
        jLabel3.setVisible(false);
        tacgiaText.setVisible(false);
        jLabel10.setVisible(false);
        trangText.setVisible(false);
    }//GEN-LAST:event_baoRadioActionPerformed

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
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField banPhText;
    private javax.swing.JRadioButton baoRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField dayPhText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField monthPhText;
    private javax.swing.JTextField nxbText;
    private javax.swing.JRadioButton sachRadio;
    private javax.swing.JTextField soPhText;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField tacgiaText;
    private javax.swing.JRadioButton tapChiRadio;
    private javax.swing.JTextField trangText;
    // End of variables declaration//GEN-END:variables
}

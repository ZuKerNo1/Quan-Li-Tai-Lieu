/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Service.BaoService;
import Service.BaoService;
import Service.BaoService;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bao;

/**
 *
 * @author FSC
 */
public class BaoFrame extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form BaoFrame
     */
    public BaoFrame() throws SQLException {
        initComponents();
        DefaultTableModel defaultTableModel;
        BaoService b = new BaoService();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };
        baoTableList.setModel(defaultTableModel);
        defaultTableModel.addColumn("idTaiLieu");
        defaultTableModel.addColumn("TenNXB");
        defaultTableModel.addColumn("SoBanPhatHanh");
        defaultTableModel.addColumn("TenTacGia");
        defaultTableModel.addColumn("SoTrang");
        setData(b.getAllBao());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        baoTableList = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("BÁO");

        baoTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        baoTableList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(baoTableList);

        backBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteBtn.setText("XÓA");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89)
                        .addComponent(deleteBtn)
                        .addGap(59, 59, 59)
                        .addComponent(refreshBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(deleteBtn)
                        .addComponent(refreshBtn))
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new mainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        BaoService us = new BaoService();
        int row = baoTableList.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(BaoFrame.this, "Vui lòng chọn Báo muốn xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int comfirm = JOptionPane.showConfirmDialog(BaoFrame.this, "Bạn có chắc chắn muốn xóa!");

            if (comfirm == JOptionPane.YES_OPTION) {
                int ID = Integer.valueOf(String.valueOf(baoTableList.getValueAt(row, 0)));

                try {
                    us.deleteBao(ID);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(BaoFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    setData(us.getAllBao());
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(BaoFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        BaoService us = new BaoService();
        try {
            setData(us.getAllBao());
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BaoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed
    
    private void setData(List<Bao> baos) throws SQLException {
        DefaultTableModel defaultTableModel;
        BaoService us = new BaoService();
        defaultTableModel = new DefaultTableModel();
        baoTableList.setModel(defaultTableModel);
        defaultTableModel.addColumn("id Tài Liệu");
        defaultTableModel.addColumn("Tên NXB");
        defaultTableModel.addColumn("Số Bản Phát Hành");
        defaultTableModel.addColumn("Ngày Phát Hành");
        for (Bao sach : baos) {
            defaultTableModel.addRow(new Object[]{sach.getIdTaiLieu(), sach.getTenNXB(), sach.getSoBanPhatHanh(),
                sach.getNgayPhatHanh()});
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable baoTableList;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}
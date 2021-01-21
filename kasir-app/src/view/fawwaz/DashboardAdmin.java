/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.fawwaz;

import database.Koneksi;

/**
 *
 * @author Mojave
 */
public class DashboardAdmin extends javax.swing.JFrame {
    
    Koneksi connection ;
    /** Creates new form dashboard_admin */
    public DashboardAdmin() {
        connection = new Koneksi();
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnSatuanProduk = new javax.swing.JLabel();
        btnProduk = new javax.swing.JLabel();
        btnStokMasuk = new javax.swing.JLabel();
        btnKategoriProduk = new javax.swing.JButton();
        btnStokKeluar = new javax.swing.JLabel();
        btnTransaksi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLaporanPenjualan = new javax.swing.JLabel();
        btnSupplier = new javax.swing.JLabel();
        btnPengaturan = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dpWindowsView = new javax.swing.JPanel();

        jPanel7.setBackground(new java.awt.Color(7, 29, 88));

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("          Logout");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel14.setText("Kasir App");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(248, 249, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(7, 29, 88));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 185, 236));
        jLabel2.setText("Menu Kasir");

        jPanel5.setBackground(new java.awt.Color(7, 29, 88));
        jPanel5.setToolTipText("");

        jPanel6.setBackground(new java.awt.Color(7, 29, 88));
        jPanel6.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        btnSatuanProduk.setBackground(new java.awt.Color(255, 255, 255));
        btnSatuanProduk.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnSatuanProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnSatuanProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Bag 2.png"))); // NOI18N
        btnSatuanProduk.setText("   Satuan Produk");
        btnSatuanProduk.setToolTipText("");
        btnSatuanProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSatuanProdukMouseClicked(evt);
            }
        });

        btnProduk.setBackground(new java.awt.Color(255, 255, 255));
        btnProduk.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Document.png"))); // NOI18N
        btnProduk.setText("   Produk");
        btnProduk.setToolTipText("");
        btnProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdukMouseClicked(evt);
            }
        });

        btnStokMasuk.setBackground(new java.awt.Color(255, 255, 255));
        btnStokMasuk.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnStokMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btnStokMasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Calendar.png"))); // NOI18N
        btnStokMasuk.setText("   Stok Masuk");
        btnStokMasuk.setToolTipText("");
        btnStokMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStokMasukMouseClicked(evt);
            }
        });

        btnKategoriProduk.setBackground(new java.awt.Color(7, 29, 88));
        btnKategoriProduk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKategoriProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnKategoriProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Bag.png"))); // NOI18N
        btnKategoriProduk.setText("   Kategori Poduk");
        btnKategoriProduk.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnKategoriProduk.setBorderPainted(false);
        btnKategoriProduk.setContentAreaFilled(false);
        btnKategoriProduk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKategoriProduk.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnKategoriProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategoriProdukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStokMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnKategoriProduk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSatuanProduk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnKategoriProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSatuanProduk))
                .addGap(18, 18, 18)
                .addComponent(btnProduk)
                .addGap(16, 16, 16)
                .addComponent(btnStokMasuk))
        );

        btnStokKeluar.setBackground(new java.awt.Color(255, 255, 255));
        btnStokKeluar.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnStokKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnStokKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Calendar-1.png"))); // NOI18N
        btnStokKeluar.setText("   Stok Keluar");
        btnStokKeluar.setToolTipText("");
        btnStokKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStokKeluarMouseClicked(evt);
            }
        });

        btnTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        btnTransaksi.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Buy.png"))); // NOI18N
        btnTransaksi.setText("   Transaksi");
        btnTransaksi.setToolTipText("");
        btnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 185, 236));
        jLabel9.setText("Menu Master");

        btnLaporanPenjualan.setBackground(new java.awt.Color(255, 255, 255));
        btnLaporanPenjualan.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnLaporanPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporanPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Activity.png"))); // NOI18N
        btnLaporanPenjualan.setText("   Laporan Penjualan");
        btnLaporanPenjualan.setToolTipText("");
        btnLaporanPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLaporanPenjualanMouseClicked(evt);
            }
        });

        btnSupplier.setBackground(new java.awt.Color(255, 255, 255));
        btnSupplier.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/3 User.png"))); // NOI18N
        btnSupplier.setText("   Supplier");
        btnSupplier.setToolTipText("");
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
        });

        btnPengaturan.setBackground(new java.awt.Color(255, 255, 255));
        btnPengaturan.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnPengaturan.setForeground(new java.awt.Color(255, 255, 255));
        btnPengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Setting.png"))); // NOI18N
        btnPengaturan.setText("   Pengaturan");
        btnPengaturan.setToolTipText("");
        btnPengaturan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPengaturanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLaporanPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnStokKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStokKeluar)
                .addGap(18, 18, 18)
                .addComponent(btnTransaksi)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLaporanPenjualan)
                .addGap(18, 18, 18)
                .addComponent(btnSupplier)
                .addGap(18, 18, 18)
                .addComponent(btnPengaturan)
                .addGap(332, 332, 332))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 840));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(7, 29, 88));

        jLabel15.setFont(new java.awt.Font("Poppins SemiBold", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("          Logout");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel16.setText("Kasir App");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(35, 35, 35))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 700, 110));

        javax.swing.GroupLayout dpWindowsViewLayout = new javax.swing.GroupLayout(dpWindowsView);
        dpWindowsView.setLayout(dpWindowsViewLayout);
        dpWindowsViewLayout.setHorizontalGroup(
            dpWindowsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        dpWindowsViewLayout.setVerticalGroup(
            dpWindowsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jPanel1.add(dpWindowsView, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 700, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSatuanProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSatuanProdukMouseClicked
        SatuanProduk menu = new SatuanProduk();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        menu.closeDatabase();
    }//GEN-LAST:event_btnSatuanProdukMouseClicked

    private void btnProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdukMouseClicked
        Produk menu = new Produk();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        menu.closeDatabase();
    }//GEN-LAST:event_btnProdukMouseClicked

    private void btnStokMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStokMasukMouseClicked
        StokMasuk menu = new StokMasuk();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        menu.closeDatabase();
    }//GEN-LAST:event_btnStokMasukMouseClicked

    private void btnStokKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStokKeluarMouseClicked
        StokKeluar menu = new StokKeluar();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        menu.closeDatabase();
    }//GEN-LAST:event_btnStokKeluarMouseClicked

    private void btnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseClicked
        Transaksi menu = new Transaksi();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        menu.closeDatabase();
    }//GEN-LAST:event_btnTransaksiMouseClicked

    private void btnLaporanPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaporanPenjualanMouseClicked
        LaporanPenjualan menu = new LaporanPenjualan();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        
    }//GEN-LAST:event_btnLaporanPenjualanMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        Supplier menu = new Supplier();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        menu.closeDatabase();
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnPengaturanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengaturanMouseClicked
        Pengaturan menu = new Pengaturan();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        menu.closeDatabase();
    }//GEN-LAST:event_btnPengaturanMouseClicked

    private void btnKategoriProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategoriProdukActionPerformed
        
        KategoriProduk menu = new KategoriProduk();
        dpWindowsView.removeAll();
        dpWindowsView.repaint();
        dpWindowsView.add(menu).setVisible(true);
        menu.closeDatabase();
        
    }//GEN-LAST:event_btnKategoriProdukActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DashboardAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKategoriProduk;
    private javax.swing.JLabel btnLaporanPenjualan;
    private javax.swing.JLabel btnPengaturan;
    private javax.swing.JLabel btnProduk;
    private javax.swing.JLabel btnSatuanProduk;
    private javax.swing.JLabel btnStokKeluar;
    private javax.swing.JLabel btnStokMasuk;
    private javax.swing.JLabel btnSupplier;
    private javax.swing.JLabel btnTransaksi;
    private javax.swing.JPanel dpWindowsView;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables

}

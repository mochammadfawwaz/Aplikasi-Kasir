/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.fawwaz;

import database.Koneksi;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import laporan.PrintLaporanPenjualan;


/**
 *
 * @author Mojave
 */
public class LaporanPenjualan extends javax.swing.JInternalFrame {
    
    ArrayList noIdTable = new ArrayList<String>();
    ArrayList tanggalLaporan = new ArrayList<String>();
    ArrayList namaKasir = new ArrayList<String>();
    ArrayList namaProduk = new ArrayList<String>();
    ArrayList diskon =  new ArrayList<String>();
    ArrayList totalBayar = new ArrayList<String>();
    ArrayList jumlahUang = new ArrayList<String>();

    String noId = "";
    int printLaporan = 0;
    

    Koneksi connection;
    ResultSet resultSet;
    
    /**
     * Creates new form kategori_produk
     */
    public LaporanPenjualan() {
        connection = new Koneksi();
        initComponents();
        getTable();
    }
    
    private void getTable(){

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("No Id");
        model.addColumn("Tanggal");
        model.addColumn("Nama Kasir");
        model.addColumn("Nama Produk");
        model.addColumn("Diskon");
        model.addColumn("Total Bayar");
        model.addColumn("Jumlah Uang");

        String tableName = "laporan_transaksi";
        String[] column = {
            "*"
        };

        resultSet = connection.querySellect(column, tableName);

        try{
            int i = 1;

            while(resultSet.next()){
                model.addRow(new Object[]{
                    i++,
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7)
                });
            }

            connection.closeDatabase();
            tblLaporanPenjualan.setModel(model);
        }catch(SQLException e){
            System.out.println("Error try to poppulate table laporan Penjualan : " 
                    + e.getMessage());
        }
    }

    private void getSearchTableTransaksi(String tanggal){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("No Id");
        model.addColumn("Tanggal");
        model.addColumn("Nama Kasir");
        model.addColumn("Nama Produk");
        model.addColumn("Diskon");
        model.addColumn("Total Bayar");
        model.addColumn("Jumlah Uang");

        String tableName = "laporan_transaksi";
        String[] column = {
            "no_id",
            "tanggal",
            "nama_pengakses",
            "nama_produk",
            "diskon",
            "total_bayar",
            "jumlah_uang"
        };

        String condition = " tanggal = '" + tanggal + "'";

        resultSet = connection.selectCommand(column, tableName, condition);

        try{
            int i = 1;

            while(resultSet.next()){
                model.addRow(new Object[]{
                    i++,
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7)
                });
            }

            connection.closeDatabase();
            tblLaporanPenjualan.setModel(model);
        }catch(SQLException e){
            System.out.println("Error try to poppulate table laporan Penjualan : " 
                    + e.getMessage());
        }
    }

    private void refreshArrayList(){
        noIdTable.clear();
        tanggalLaporan.clear();
        namaProduk.clear();
        diskon.clear();
        totalBayar.clear();
        jumlahUang.clear();
    }

    private void printLaporanFromTableSearch(String tanggal){

        String tableName = "laporan_transaksi";
        String[] column = {
            "no_id",
            "tanggal",
            "nama_pengakses",
            "nama_produk",
            "diskon",
            "total_bayar",
            "jumlah_uang"
        };

        String condition = " tanggal = '" + tanggal + "'";

        resultSet = connection.selectCommand(column, tableName, condition);

        try{

            while(resultSet.next()){
                
                noIdTable.add(resultSet.getString(1));
                tanggalLaporan.add(resultSet.getString(2));
                namaKasir.add(resultSet.getString(3));
                namaProduk.add(resultSet.getString(4));
                diskon.add(resultSet.getString(5));
                totalBayar.add(resultSet.getString(6));
                jumlahUang.add(resultSet.getString(7));

            }

            connection.closeDatabase();
        }catch(SQLException e){
            System.out.println("Error try to get value from "
                    + "table(printLaporanFromTableSearch)" + e.getMessage());
        }
    }

    private void printLaporanFromAllTable(){

        String tableName = "laporan_transaksi";
        String[] column = {
            "no_id",
            "tanggal",
            "nama_pengakses",
            "nama_produk",
            "diskon",
            "total_bayar",
            "jumlah_uang"
        };

        resultSet = connection.querySellect(column, tableName);

        try{

            while(resultSet.next()){

                noIdTable.add(resultSet.getString(1));
                tanggalLaporan.add(resultSet.getString(2));
                namaKasir.add(resultSet.getString(3));
                namaProduk.add(resultSet.getString(4));
                diskon.add(resultSet.getString(5));
                totalBayar.add(resultSet.getString(6));
                jumlahUang.add(resultSet.getString(7));
            }

            connection.closeDatabase();
        }catch(SQLException e){

             System.out.println("Error try to get value from "
                    + "table(printLaporanFromAllTable)" + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCari = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaporanPenjualan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnHapus = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JLabel();
        dcTanggal = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel1.setText("Menu Laporan Penjualan");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Masukkan Kata Kunci");

        jPanel2.setBackground(new java.awt.Color(1, 126, 250));

        btnCari.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("      Cari");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        tblLaporanPenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblLaporanPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLaporanPenjualanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLaporanPenjualan);

        jPanel3.setBackground(new java.awt.Color(255, 36, 36));

        btnHapus.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("    Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(250, 135, 1));

        btnPrint.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("      Print");
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(5, 238, 56));

        btnRefresh.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("   Refresh");
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        dcTanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(80, 80, 80))
                            .addComponent(dcTanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
         
        boolean confirmation = JOptionPane.showConfirmDialog(
                this,
                "Apakah anda yakin ingin menghapus data ini",
                "Peringatan!!!",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION;

        if(confirmation){

            String tableName = "laporan_transaksi";
            String condition = "no_id = " + noId;

            connection.queryDelete(tableName, condition);
            connection.closeDatabase();
        }

        getTable();
        
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        
        if(printLaporan == 1){
            
            SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
            Date date = (Date)this.dcTanggal.getDate();
            String tanggal = formater.format(date);
            
            printLaporanFromTableSearch(tanggal);
        }else{
            
            printLaporanFromAllTable();
            
        }
        
        String pdfFileName;
        PrintLaporanPenjualan printReport = new PrintLaporanPenjualan();
        
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        String tanggal = formater.format(date);
        
        pdfFileName = "laporan" + tanggal;
        printReport.createPdf(
                pdfFileName,
                noIdTable,
                tanggalLaporan,
                namaKasir,
                namaProduk,
                diskon,
                totalBayar,
                jumlahUang
        );
        
        JOptionPane.showMessageDialog(this,"Laporan Berhasil di simpan");
        
        printLaporan = 0;
    }//GEN-LAST:event_btnPrintMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        
        getTable();
        printLaporan = 0;
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void tblLaporanPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLaporanPenjualanMouseClicked
        int baris = tblLaporanPenjualan.getSelectedRow();
        int kolom = 1;

        String kolomId = 
                String.valueOf(tblLaporanPenjualan.getValueAt(baris, kolom));

        noId = kolomId;
    }//GEN-LAST:event_tblLaporanPenjualanMouseClicked

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        
        printLaporan = 1;
        
        if(dcTanggal.getDate() == null){
            JOptionPane.showMessageDialog(this ,"Masukkan tanggal yang ingin di cari");
        }else{

            SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
            Date date = (Date)this.dcTanggal.getDate();
            String tanggal = formater.format(date);

            getSearchTableTransaksi(tanggal);

        }
    }//GEN-LAST:event_btnCariMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCari;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnPrint;
    private javax.swing.JLabel btnRefresh;
    private com.toedter.calendar.JDateChooser dcTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLaporanPenjualan;
    // End of variables declaration//GEN-END:variables
}

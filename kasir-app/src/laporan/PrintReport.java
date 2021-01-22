/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class PrintReport {
    
    public void createPDF(
                String pdfName,
                ArrayList<String> noId,
                ArrayList<String> tanggal,
                ArrayList<String> namaKasir,
                ArrayList<String> namaProduk,
                ArrayList<String> diskon,
                ArrayList<String> totalBayar,
                ArrayList<String> jumlahUang
        ){
        
        Document document = new Document();
        PdfWriter documentWriter = null;
        
        DecimalFormat decimalFormat = new DecimalFormat();
        
        try{
            
              //font size 
            Font bfBold12 = new Font(
                    Font.TIMES_ROMAN,
                    12,
                    Font.BOLD, 
                    Color.BLACK
            );
            
            Font bf12 = new Font(Font.TIMES_ROMAN, 12);
            //file path
            String path = "D:/laporan/" + pdfName +".pdf";
            documentWriter = 
                    PdfWriter.getInstance(document, new FileOutputStream(path));
            
                        //document header atributer
            document.addAuthor("Uwi");
            document.addCreationDate();
            document.addProducer();
            document.addCreator("DosephDoestar");
            document.addTitle("Laporan Table");
            document.setPageSize(PageSize.LETTER);
            
            //open document
            document.open();
            
            //create paragraph
            Paragraph paragraph = new Paragraph();
            
            //menentukan ukuran kolom spesisfik
            float[] columnWidth = {1f, 1.5f, 3f, 2.8f, 5.3f, 1.7f, 3f, 3f};
            
            //membuat table pdf dengan lebar yang di tentukan
            PdfPTable table = new PdfPTable(columnWidth);
            
            //set table width percentage of the ppage width
            table.setWidthPercentage(90f);
            insertCell(table, "**** Laporan Penjualan ****", Element.ALIGN_CENTER, 8, bfBold12);
            //insert column headings
            insertCell(table, "No", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "No Id", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Tanggal", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Nama Kasir", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Nama Produk", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Diskon", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Total Bayar", Element.ALIGN_LEFT, 1, bfBold12);
            insertCell(table, "Jumlah Uang", Element.ALIGN_LEFT, 1, bfBold12);
            table.setHeaderRows(1);
            
            //just some random data to fill 
            for(int i = 0; i < noId.size(); i++){
    
                insertCell(table,"" + (i + 1), Element.ALIGN_LEFT, 1, bf12);
                insertCell(table, noId.get(i), Element.ALIGN_LEFT, 1, bf12);
                insertCell(table, tanggal.get(i), Element.ALIGN_LEFT, 1, bf12);
                insertCell(table, namaKasir.get(i), Element.ALIGN_LEFT, 1, bf12);
                insertCell(
                        table,
                        namaProduk.get(i),
                        Element.ALIGN_LEFT,
                        1,
                        bf12
                );
                insertCell(table, diskon.get(i), Element.ALIGN_LEFT, 1, bf12);
                insertCell(
                        table,
                        totalBayar.get(i),
                        Element.ALIGN_LEFT,
                        1,
                        bf12
                );
                insertCell(
                        table,
                        jumlahUang.get(i),
                        Element.ALIGN_LEFT,
                        1,
                        bf12
                );
            }
            
            //add the PDF table to the paragraph 
            paragraph.add(table);
            // add the paragraph to the document
            document.add(paragraph);
            
        }catch(DocumentException e){
            System.out.println("Error try to make document : " + e.getMessage());
            Logger.getLogger(PrintReport.class.getName())
                    .log(Level.SEVERE, null, e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintReport.class.getName())
                    .log(Level.SEVERE, null, ex);
        }finally{
                //close the document
                document.close();
            
            if (documentWriter != null){
                //close the writer
                documentWriter.close();
            }
        }
        
        
    }
    
    private void insertCell(
            PdfPTable table,
            String text,
            int align,
            int colspan,
            Font font
    ){
        
        //create a new cell with the specified  text and font
        PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
        //set the cell aligment
        cell.setHorizontalAlignment(align);
        //set the cell column span in case you want to merge two or more cell
        cell.setColspan(colspan);
        //in case if you want 
        if(text.trim().equalsIgnoreCase("")){
            cell.setMinimumHeight(10f);
        }
        
        table.addCell(cell);
    }
}

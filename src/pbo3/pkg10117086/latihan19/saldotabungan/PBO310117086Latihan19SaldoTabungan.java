/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan19.saldotabungan;

/**
 *
 * @author Lenovo
 * NAMA                 : RD Muhammad Djulfikar BU
 * KELAS                : IF3
 * NIM                  : 10117086
 * DESKRIPSI PROGRAM    : untuk mengetahui saldo perbulan seseorang
 */
public class PBO310117086Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 0;
        
        while(lama <=5){
            lama = lama + 1;
            saldoAwal = saldoAwal * bunga + saldoAwal;
            System.out.println("Saldo Bulang ke-"+lama+ " Rp. "+saldoAwal);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan56.umurbarangantik;

/**
 *
 * @author Aero
 * NAMA  : Irman Novryansah
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk membuat tampilan umur barang antik.
 */
public class Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   Radio radio = new Radio(234);
        radio.setName("Radio");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
        
    }
    
}
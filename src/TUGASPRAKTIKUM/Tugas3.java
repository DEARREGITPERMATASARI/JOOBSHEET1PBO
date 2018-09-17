/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGASPRAKTIKUM;
import java.util.Scanner;

/**
 *
 * @author Nita
 */
public class Tugas3 {
       public static void main(String[]args) {
         System.out.println("## BIODATA DIRI ##");
         
         String nama,tempatlahir,jeniskelamin,alamatdimalang,mottohidup;
         int nis,tanggallahir,tahun;
         //Deklarasai
         Scanner input = new Scanner (System.in);
         
         //menganalisis objek inputan
         System.out.print("Nama : ");
         nama =input.next();
         
         //tampilkan output lagi
         System.out.print("NIS :");
         nis = input.nextInt();
         
         //tampilkan output lagi
         System.out.print("Tempat Lahir :");
         tempatlahir =input.next();
         
         //tampilkan output lagi
         System.out.print("Tanggal Lahir :");
         tanggallahir =input.nextInt();
      
         //tampilkan output lagi
         System.out.print("Jenis Kelamin :");
         jeniskelamin =input.next();
         
         //tampilkan output lagi
         System.out.print("Alamat di Malang :");
         alamatdimalang =input.next();
         
         //tampilkan output lagi
         System.out.print("Motto Hidup :");
         mottohidup =input.next();
         
         
            //menampilkan apa yang sudah simpan di variabel
             System.out.println("============================");
             System.out.println();
                      System.out.println("Nama              :" +nama);
                      System.out.println("NIS               :"+nis);
                      System.out.println("Tempat Lahir      :"+tempatlahir);
                      System.out.println("Tanggal Lahir     :"+tanggallahir);
                      System.out.println("Jenis Kelamin     :"+jeniskelamin);
                      System.out.println("Alamat di Malang  :"+alamatdimalang);
                      System.out.println("Motto Hidup       :"+mottohidup);
                    


       }
}

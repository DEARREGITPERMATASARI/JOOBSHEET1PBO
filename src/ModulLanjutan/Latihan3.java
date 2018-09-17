/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModulLanjutan;
import java.util.Scanner;

/**
 *
 * @author Nita
 */
public class Latihan3 {
       public static void main (String[] args) {
        String identitas = "DEAR REGITA PERMATASARI/ X RPL 5 / 11";
        System.out.println("Identitas : " +identitas);
        
        Scanner masukan=new Scanner(System.in);
        
        int a, b, c;
        System.out.println("Program Menjumlahkan 2 nilai");
        System.out.println ("Masukkan Nilai a : ");
        a = masukan.nextInt();
        System.out.println ("Masukkan Nilai b : ");
        b = masukan.nextInt();
        System.out.println ("Masukkan Nilai c : ");
        c = masukan.nextInt();
        
        System.out.println();
                System.out.println("Jumlah a + b :" +(jumlah(a,b)));
                System.out.println("Jumlah b + c :" +(jumlah(b,c)));
                System.out.println("Jumlah a + c :" +(jumlah(a,c)));
                }  
       //konstruktor
       private static int jumlah(int a, int b) {
           int hasil = a + b;
           return hasil;
       }
}


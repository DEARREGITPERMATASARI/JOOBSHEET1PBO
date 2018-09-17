/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;
import java.util.Scanner;
/**
 *
 * @author Nita
 */
public class Latihan5 {
    public static void main(String[] args){
        Scanner masukan = new Scanner (System.in);
        
        int nilai;
        System.out.print("Masukkan nilai akhir PBO :");
            nilai = masukan.nextInt();
         
            if(nilai< 70)
                System.out.println("Siswa Tidak Lulus");
            if (nilai > 70)
                System.out.println("Siswa Lulus");
    }
    
}

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
public class Tugas2 {
   public static void main(String[]args) {
        System.out.println("##KONVERENSI SUUHU ##");
       
       double fahrenheit,celcius,reamur,kelvin;
       
       //Deklarasi
       Scanner input = new Scanner (System.in);
       
       //menganalisis objek inputan
       
       //tampilkan output
       System.out.print("Masukkan suhu dalam Celcius ke Farenheit :");
       celcius = input.nextInt();
       fahrenheit = celcius *9/5 + 32;
       
       //tampilkan output
        System.out.print("Masukkan suhu dalam Celcius ke Reamur :");
       celcius = input.nextInt();
       reamur = celcius *4/5 ;
       
       //tampilkan output
       System.out.print("Masukkan suhu dalam Celcius ke Kelvin :");
       celcius = input.nextInt();
       kelvin = celcius + 273 *15 ;
              
       //menampilkan apa yang sudah simpan di variabel
       System.out.println("-------------------------------------");
       System.out.println("Hasil Konverensi Suhu dari Celcius ke Fahrenheit :" + fahrenheit);
       System.out.println("Masukkan suhu dalam Celcius ke Reamur :" +reamur);
       System.out.println("Masukkan suhu dalam Celcius ke Kelvin :" +kelvin);
       System.out.println("-------------------------------------");
   }
    
}

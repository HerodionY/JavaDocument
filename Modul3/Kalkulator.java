/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Kalkulator {
     static double a,b;

    
     static int pilihan ;    
    public Kalkulator(){}
   
   
    


    public static void getKalkulator() {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Angka Pertama : ");
        a=input.nextDouble();
        System.out.print("Masukan angka Kedua : ");
        b=input.nextDouble();
       
        System.out.println("1.Penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        System.out.print("Masukan Perintah Operasi Penjumlahan : ");
        pilihan=input.nextInt();
       double hasil=0;
       
       
      
        
        switch(pilihan){
            case 1: 
            hasil=a+b;
            break;
            case 2:
                hasil=a-b;
             break;
            case 3:
                hasil=a*b;
            break; 
            case 4:
                hasil=a/b;}
         System.out.println("Hasil perhitungan adalah : "+hasil);
         
    

    
    
    
       
    
    
    
    }
    
    
}

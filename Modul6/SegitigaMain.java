/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class SegitigaMain {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 // membentuk obyek seg1 dari class Segitiga
 Segitiga seg = new Segitiga();double totalLuas=0;
 SegitigaThisSetGet[] daftarSegitiga=new SegitigaThisSetGet[100];
 SegitigaThisSetGet segitiga1=new SegitigaThisSetGet();
int jumlahSegitiga=0;
 int jumlahSegitigaBaru=0;
        System.out.println("Masukan jumlah segitiga yang akan dimasukan : ");
        jumlahSegitigaBaru=input.nextInt();
        for (int i = 0; i <jumlahSegitigaBaru  ; i++) {
            
            System.out.println("Masukan Absis Pertama : ");
            double x1 =input.nextDouble();
            System.out.println("Masukan Ordinat titik Pertama : ");
            double y1=input.nextDouble();
            System.out.println("Masukan Absis Titik Kedua : ");
            double x2=input.nextDouble(); 
            System.out.println("Masukan Ordinat Titik  Kedua : ");
            double y2=input.nextDouble();
            System.out.println("Masukan absis titik ketiga : ");
            double x3=input.nextDouble(); 
            System.out.println("Masukan Ordinat Titik keempat : ");
            double y3=input.nextDouble();
            double sisi1=seg.hitungSisi(x1, y1, x2, y2);
            double sisi2=seg.hitungSisi(x2, y2, x3, y3);
            double sisi3=seg.hitungSisi(x3, y3, x1, y1);
            double keliling= seg.hitungKeliling(sisi1, sisi2, sisi3);
            double luas= seg.hitungLuas(sisi1, sisi2, sisi3, keliling);
            
             totalLuas=totalLuas+luas;
             SegitigaThisSetGet segitiga=new SegitigaThisSetGet( x1,  y1,  x2,  y2,  x3,  y3,  sisi1,  sisi2,  sisi3,  keliling,  luas);
             daftarSegitiga[jumlahSegitiga]=segitiga;
          jumlahSegitiga++;
        }
        double ratarata=segitiga1.getRata2(totalLuas, jumlahSegitiga);
      
//        
        for (int i = 0; i < jumlahSegitiga; i++) {
            System.out.println("Segitiga Dengan panjang sisi : "+daftarSegitiga[i].getSisi1()+" , "+daftarSegitiga[i].getSisi2()+" Dan "+daftarSegitiga[i].getSisi3()+"MemPunyai Keliling : "+daftarSegitiga[i].getHitungKeliling()+" dan Mempunyai luas : "+daftarSegitiga[i].getHitungLuas());
        }
        System.out.println("Rata - rata Segitiga adalah : "+ratarata);
        System.out.println("Segitiga terluas adalah : "+segitiga1.cariSegitigaTerluas(daftarSegitiga, jumlahSegitiga));
           System.out.println("Segitiga terkecil adalah : "+segitiga1.cariSegitigaTerkecil(daftarSegitiga, jumlahSegitiga));
         
 //pengisian data 3 titik segitiga
 
 //menghitung & menampilkan luas segitiga
    }

  
}

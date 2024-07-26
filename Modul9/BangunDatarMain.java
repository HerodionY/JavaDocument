package Modul9;

import java.util.Scanner;

public class BangunDatarMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyak = 0, pilihan;

        System.out.println("Masukan Banyaknya Bangun datar : ");
        banyak = input.nextInt();

        BangunDatar[] bangunDatar = new BangunDatar[banyak];
        for (int i = 0; i < banyak; i++) {
            System.out.println("1. SegiEmpat ");
            System.out.println("2. Segitiga ");
            System.out.println("3. Lingkaran ");
            System.out.println("Masukan Jenis Bangun datar : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Input Segi Empat
                   
                    System.out.print("Masukkan panjang segi empat: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar segi empat: ");
                    double lebar = input.nextDouble();
                    bangunDatar[i] = new SegiEmpat(panjang, lebar);
                    break;
                case 2:
                    // Input Segitiga
                    
                    System.out.print("Masukkan sisi 1 segitiga: ");
                    double sisi1 = input.nextDouble();
                    System.out.print("Masukkan sisi 2 segitiga: ");
                    double sisi2 = input.nextDouble();
                    System.out.print("Masukkan sisi 3 segitiga: ");
                    double sisi3 = input.nextDouble();
                    bangunDatar[i] = new Segitiga(sisi1, sisi2, sisi3);
                    break;
                case 3:
                    // Input Lingkaran
                    
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = input.nextDouble();
                    bangunDatar[i] = new Lingkaran(jariJari);
                    break;
                default:
                    System.out.println("Tidak Ditemukan");
            }
        }
         System.out.println("================================================================================");
        System.out.printf("%-7s", "No : ");
        System.out.printf("%-25s", "Jenis Bangun Datar  : ");
        System.out.printf("%-25s", "Keliling  : ");
        System.out.printf("%-25s", "Luas : ");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println();
        for (int i = 0; i < banyak; i++) {
            System.out.printf("%-7s", i + 1);
            System.out.printf("%-25s", bangunDatar[i].nama());
            System.out.printf("%-25s", bangunDatar[i].hitungKeliling());
            System.out.printf("%-25s", bangunDatar[i].hitungLuas());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}

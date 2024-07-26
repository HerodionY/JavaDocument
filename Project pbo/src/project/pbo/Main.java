/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pbo;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    DompetKu dompet = new DompetKu();

    DompetKu[] akun = new DompetKu[10];
    int banyak = 0;
    akun[banyak] = new DompetKu();
    akun[banyak].setUsername("herod");
    akun[banyak].setPassword("123456");

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ Selamat Datang Di DompetKu ~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.print("Apakah Sudah memiliki Akun S/B ?? (y/n) : ");
    String hasAccount = scanner.nextLine();

    if (hasAccount.equalsIgnoreCase("y")) {
        banyak = dompet.login(akun, scanner);
    } else {
        dompet.register(akun, scanner, banyak);
    }

    while (dompet.isLoggedIn()) {
        System.out.println("~~~~~~~~~~~~~~~ Selamat Datang ~~~~~~~~~~~~~~~");
        System.out.println("Username : " + akun[banyak].getUsername());
        System.out.println("Password : " + akun[banyak].getPassword());
        System.out.println("Login Berhasil\n");

        System.out.println(akun[banyak].getUsername());
        System.out.println("~~~~~~~~~~~~~~~ Selamat Datang ~~~~~~~~~~~~~~~");
        System.out.println("1. TopUP");
        System.out.println("2. Pembayaran");
        System.out.println("3. Tampil");
        System.out.println("4. Lihat Saldo");
        System.out.println("5. Edit Akun");
        System.out.println("6. LogOut");

        System.out.print("Pilih (1-6) : ");
        int menu = scanner.nextInt();
        scanner.nextLine();

        switch (menu) {
            case 1:
                dompet.topUp(akun, scanner, banyak);
                break;
            case 2:
                dompet.pembayaran(scanner);
                break;
            case 3:
                dompet.tampil(scanner);
                break;
            case 4:
                dompet.lihatSaldo();
                break;
            case 5:
                dompet.editAkun(scanner);
                break;
            case 6:
                dompet.setLoggedIn(false);
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    }

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ Terima Kasih ~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
}



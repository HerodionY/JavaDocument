/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DompetKu dompet = new DompetKu();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ Selamat Datang Di DompetKu ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Apakah Sudah memiliki Akun S/B ?? (y/n) : ");
        String hasAccount = scanner.nextLine();

        if (hasAccount.equalsIgnoreCase("y")) {
            login(scanner);
        } else {
            register(scanner);
        }

        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("~~~~~~~~~~~~~~~ Selamat Datang ~~~~~~~~~~~~~~~");
            System.out.println("Username : " +dompet.getUsername());
            System.out.println("Password : " + dompet.getPassword());
            System.out.println("Login Berhasil\n");

            System.out.println(username);
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
                    topUp(scanner);
                    break;
                case 2:
                    pembayaran(scanner);
                    break;
                case 3:
                    tampil(scanner);
                    break;
                case 4:
                    lihatSaldo();
                    break;
                case 5:
                    editAkun(scanner);
                    break;
                case 6:
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ Terima Kasih ~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

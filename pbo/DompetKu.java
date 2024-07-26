/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author ACER
 */

    import java.util.Scanner;

public class DompetKu {
    private  String username;
    private  String password;
    private  double saldo = 0;
    private topUp 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public DompetKu() {
    }
    
    

    

    
    private static void register(Scanner scanner) {
        System.out.print("Nama Lengkap: ");
        String namaLengkap = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("NIK: ");
        String nik = scanner.nextLine();
        System.out.print("No Telpon: ");
        String noTelpon = scanner.nextLine();
        System.out.print("Username: ");
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();
    }

    private static void topUp(Scanner scanner) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ TopUP ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Metode pembayaran :");
        System.out.println("1. Minimarket (Indomaret, Alfamidi)");
        System.out.println("2. Mobile Banking");
        System.out.print("Pilih Metode (1-2) : ");
        int metode = scanner.nextInt();
        scanner.nextLine();

        switch (metode) {
            case 1:
                System.out.println("~~~~~~~~~~~~~ Minimarket ~~~~~~~~~~~~~");
                System.out.println("1. Indomaret");
                System.out.println("2. Alfamart");
                System.out.print("Pilih (1-2) : ");
                int minimarket = scanner.nextInt();
                scanner.nextLine();

                switch (minimarket) {
                    case 1:
                        System.out.print("Nama Minimarket: Indomaret");
                        break;
                    case 2:
                        System.out.print("Nama Minimarket: Alfamart");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        return;
                }
                break;
            case 2:
                System.out.print("Metode pembayaran: Mobile Banking");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Metode Yang dipilih\t: Minimarket");
        System.out.println("Biaya Admin\t\t: 3000.0");
        System.out.println("Minimal Topup\t\t: 12000.0");
        System.out.print("Nominal Top Up\t\t: ");
        double topUpAmount = scanner.nextDouble();
        scanner.nextLine();

        saldo += topUpAmount;
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Saldo Berhasil Ditambahkan");
        System.out.println("Saldo Saat Ini: " + saldo);
    }

    private static void pembayaran(Scanner scanner) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ Pembelian ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Pulsa dan Paket Data");
        System.out.println("2. Token Listrik");
        System.out.println("3. Makanan / Barang");
        System.out.println("4. Keluar");
        System.out.print("Pilih (1-4) : ");
        int pembelian = scanner.nextInt();
        scanner.nextLine();

        switch (pembelian) {
            case 1:
                System.out.println("Gunakan Nomor HandPhonemu Y/N ?? (y/n) : ");
                String usePhoneNumber = scanner.nextLine();

                if (usePhoneNumber.equalsIgnoreCase("y")) {
                    // Perform action for using phone number
                }

                System.out.println("~~~~~~~ Pulsa dan Paket Data ~~~~~~~~");
                System.out.println("1. Pulsa");
                System.out.println("2. Paket Data");
                System.out.println("3. Keluar");
                System.out.print("Pilih (1-3) : ");
                int pulsaPaketData = scanner.nextInt();
                scanner.nextLine();

                switch (pulsaPaketData) {
                    case 1:
                        // Perform action for pulsa
                        break;
                    case 2:
                        System.out.println("\nNama Kartumu : Tri");
                        System.out.println("1\tInternet Volume 6 GB 30 hari\t19000.0");
                        System.out.println("2\tInternet Volume 10 GB 30 hari\t29000.0");
                        System.out.println("3\tInternet Volume 16 GB 30 hari\t39500.0");
                        System.out.println("4\tInternet Volume 60 GB 30 hari\t59000.0");
                        System.out.print("Pilih (1-4) : ");
                        int paketData = scanner.nextInt();
                        scanner.nextLine();

                        switch (paketData) {
                            case 1:
                                // Perform action for paket data
                                break;
                            case 2:
                                // Perform action for paket data
                                break;
                            case 3:
                                // Perform action for paket data
                                break;
                            case 4:
                                // Perform action for paket data
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                        break;
                    case 3:
                        // Perform action for keluar
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                break;
            case 2:
                System.out.print("Masukkan No Listrik : ");
                String noListrik = scanner.nextLine();

                System.out.println("1\t20.000\t20500.0");
                System.out.println("2\t50.000\t50500.0");
                System.out.println("3\t100.000\t100500.0");
                System.out.println("4\t500.000\t500500.0");
                System.out.print("Pilih (1-4) : ");
                int tokenListrik = scanner.nextInt();
                scanner.nextLine();

                switch (tokenListrik) {
                    case 1:
                        // Perform action for token listrik
                        break;
                    case 2:
                        // Perform action for token listrik
                        break;
                    case 3:
                        // Perform action for token listrik
                        break;
                    case 4:
                        // Perform action for token listrik
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                break;
            case 3:
                // Perform action for makanan/barang
                break;
            case 4:
                // Perform action for keluar
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private static void tampil(Scanner scanner) {
        System.out.println("~~~~~~~~~~~~~ Tampil ~~~~~~~~~~~~~");
        System.out.println("1. Akun");
        System.out.println("2. Riwayat Transaksi");
        System.out.print("Pilih menu (1-2) : ");
        int tampilMenu = scanner.nextInt();
        scanner.nextLine();

        switch (tampilMenu) {
            case 1:
                System.out.println("Pemilik Dompet");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("NIK\t\t: 3404090596859485");
                System.out.println("Nama\t\t: dion");
                System.out.println("No Telp\t\t: 0895391616312");
                System.out.println("Alamat\t\t: sleman");
                break;
            case 2:
                System.out.println("~~~~~~~~~~~~~ Tampil ~~~~~~~~~~~~~");
                System.out.println("1. Cetak Data TopUp");
                System.out.println("2. Cetak Data Pembelian");
                System.out.print("Pilih menu (1-2) : ");
                int riwayatMenu = scanner.nextInt();
                scanner.nextLine();

                switch (riwayatMenu) {
                    case 1:
                        System.out.println("No\tMetode Pembayaran\tNama\t\tNominal\t\tTanggal\t\tWaktu");
                        System.out.println("2\tMinimarket\t\tAlfamart\t5000000\t23/ 6/2022\t10: 0");
                        System.out.println("3\tMinimarket\t\tAlfamart\t5000000\t17/ 5/2022\t17:15");
                        break;
                    case 2:
                        System.out.println("No\tJenis\t\t\tNama\t\tHarga\t\tTanggal\t\tWaktu");
                        System.out.println("1\tPulsaPaketData\tInternet Volume 60 GB 30 hari\t59000\t17/ 5/2022\t17:15");
                        System.out.println("2\tToken Listrik\tPulsa Listrik\t\t100500\t17/ 5/2022\t17:15");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private static void lihatSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }

    private static void editAkun(Scanner scanner) {
        System.out.println("~~~~~~~~~~~~~ Edit Akun ~~~~~~~~~~~~~");
        System.out.println("1. Nama");
        System.out.println("2. Alamat");
        System.out.println("3. NIK");
        System.out.println("4. No Telpon");
        System.out.print("Pilih data yang ingin diedit (1-4) : ");
        int editMenu = scanner.nextInt();
        scanner.nextLine();

        switch (editMenu) {
            case 1:
                System.out.print("Nama Lengkap baru: ");
                String newNamaLengkap = scanner.nextLine();
                // Update Nama Lengkap
                break;
            case 2:
                System.out.print("Alamat baru: ");
                String newAlamat = scanner.nextLine();
                // Update Alamat
                break;
            case 3:
                System.out.print("NIK baru: ");
                String newNik = scanner.nextLine();
                // Update NIK
                break;
            case 4:
                System.out.print("No Telpon baru: ");
                String newNoTelpon = scanner.nextLine();
                // Update No Telpon
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}


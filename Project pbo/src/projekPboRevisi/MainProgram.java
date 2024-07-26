/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekPboRevisi;

/**
 *
 * @author ACER
 */


import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pemilik pemilik = null;
        Dompet dompet = null;
        TopUp topUp = null;
        Pembelian pembelianObj = null;
        Barang barang = null;
        TokenListrik tokenListrik = null;
        PulsaPaketData pulsaPaketData = null;

        // Pilihan Login atau Daftar
        System.out.println("Selamat datang!");
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            // Login
            System.out.print("Username: ");
            String username = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();

            // Menggunakan username dan password untuk melakukan login
            // Anda dapat menambahkan logika autentikasi di sini

            // Inisialisasi objek Pemilik dan Dompet
            pemilik = new Dompet();
            dompet = new Dompet();
        } else if (pilihan == 2) {
            // Daftar
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Alamat: ");
            String alamat = scanner.next();
            System.out.print("NIK: ");
            String nik = scanner.next();
            System.out.print("Nomor Telepon: ");
            String noTelp = scanner.next();

            // Membuat objek Pemilik dan Dompet baru
            pemilik = new Dompet();
            pemilik.setNama(nama);
            pemilik.setAlamat(alamat);
            pemilik.setNik(nik);
            pemilik.setNoTelp(noTelp);
            dompet = new Dompet();
        } else {
            System.out.println("Pilihan tidak valid. Program berakhir.");
            return;
        }

        // Mengisi data Dompet
        System.out.println("\n===== Data Dompet =====");
        System.out.print("ID: ");
        String idDompet = scanner.next();
        System.out.print("Username: ");
        String usernameDompet = scanner.next();
        System.out.print("Password: ");
        String passwordDompet = scanner.next();
        System.out.print("Saldo: ");
        double saldoDompet = scanner.nextDouble();

        dompet.setId(idDompet);
        dompet.setUsername(usernameDompet);
        dompet.setPassword(passwordDompet);
        dompet.setSaldo(saldoDompet);

        // Mengisi data TopUp
        System.out.println("\n===== Data TopUp =====");
        System.out.print("Metode TopUp: ");
        String metodeTopUp = scanner.next();
        System.out.print("Tanggal: ");
        int tanggalTopUp = scanner.nextInt();
        System.out.print("Bulan: ");
        int bulanTopUp = scanner.nextInt();
        System.out.print("Tahun: ");
        int tahunTopUp = scanner.nextInt();
        System.out.print("Jam: ");
        int jamTopUp = scanner.nextInt();
        System.out.print("Menit: ");
        int menitTopUp = scanner.nextInt();
        System.out.print("Nominal: ");
        double nominalTopUp = scanner.nextDouble();
        System.out.print("Biaya Admin: ");
        double biayaAdminTopUp = scanner.nextDouble();
        System.out.print("Minimal Transfer: ");
        double minimalTransferTopUp = scanner.nextDouble();

        topUp = new TopUp();
        topUp.setMetodeTopUp(metodeTopUp);
        topUp.setTanggal(tanggalTopUp);
        topUp.setBulan(bulanTopUp);
        topUp.setTahun(tahunTopUp);
        topUp.setJam(jamTopUp);
        topUp.setMenit(menitTopUp);
        topUp.setNominal(nominalTopUp);
        topUp.setBiayaAdmin(biayaAdminTopUp);
        topUp.setMinimalTransfer(minimalTransferTopUp);

        // Mengisi data Pembelian
        System.out.println("\n===== Data Pembelian =====");
        System.out.print("Pembelian: ");
        String jenisPembelian = scanner.next();
        System.out.print("Kode Pembayaran: ");
        String kodePembayaran = scanner.next();
        System.out.print("Tanggal: ");
        int tanggalPembelian = scanner.nextInt();
        System.out.print("Bulan: ");
        int bulanPembelian = scanner.nextInt();
        System.out.print("Tahun: ");
        int tahunPembelian = scanner.nextInt();
        System.out.print("Jam: ");
        int jamPembelian = scanner.nextInt();
        System.out.print("Menit: ");
        int menitPembelian = scanner.nextInt();
        System.out.print("Total Bayar: ");
        double totalBayar = scanner.nextDouble();

        pembelianObj = new Pembelian();
        pembelianObj.setPembelian(jenisPembelian);
        pembelianObj.setKodePembayaran(kodePembayaran);
        pembelianObj.setTanggal(tanggalPembelian);
        pembelianObj.setBulan(bulanPembelian);
        pembelianObj.setTahun(tahunPembelian);
        pembelianObj.setJam(jamPembelian);
        pembelianObj.setMenit(menitPembelian);
        pembelianObj.setTotalBayar(totalBayar);

        // Mengisi data Barang
        System.out.println("\n===== Data Barang =====");
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.next();
        System.out.print("Nama Toko: ");
        String namaToko = scanner.next();
        System.out.print("Harga: ");
        double hargaBarang = scanner.nextDouble();

        barang = new Barang();
        barang.setNama(namaBarang);
        barang.setNamaToko(namaToko);
        barang.setHarga(hargaBarang);

        // Mengisi data Token Listrik
        System.out.println("\n===== Data Token Listrik =====");
        System.out.print("Nomor Listrik: ");
        String nomorListrik = scanner.next();
        System.out.print("Daftar Harga: ");
        String daftarHarga = scanner.next();
        System.out.print("Harga: ");
        double hargaToken = scanner.nextDouble();

        tokenListrik = new TokenListrik();
        tokenListrik.setNoListrik(nomorListrik);
        tokenListrik.setDaftarHarga(daftarHarga);
        tokenListrik.setHarga(hargaToken);

        // Mengisi data Pulsa Paket Data
        System.out.println("\n===== Data Pulsa Paket Data =====");
        System.out.print("Data: ");
        String dataPulsa = scanner.next();
        System.out.print("Pulsa: ");
        String pulsa = scanner.next();
        System.out.print("Nomor HP: ");
        String nomorHp = scanner.next();
        System.out.print("Nama Kartu: ");
        String namaKartu = scanner.next();
        System.out.print("Jenis: ");
        String jenisPulsa = scanner.next();
        System.out.print("Harga: ");
        double hargaPulsa = scanner.nextDouble();

        pulsaPaketData = new PulsaPaketData();
        pulsaPaketData.setData(dataPulsa);
        pulsaPaketData.setPulsa(pulsa);
        pulsaPaketData.setNomorHp(nomorHp);
        pulsaPaketData.setNamaKartu(namaKartu);
        pulsaPaketData.setJenis(jenisPulsa);
        pulsaPaketData.setHarga(hargaPulsa);

        // Menampilkan hasil input data
        System.out.println("\n===== Hasil Input Data =====");
        System.out.println("Data Pemilik: ");
        System.out.println("Nama: " + pemilik.getNama());
        System.out.println("Alamat: " + pemilik.getAlamat());
        System.out.println("NIK: " + pemilik.getNik());
        System.out.println("Nomor Telepon: " + pemilik.getNoTelp());

        System.out.println("\nData Dompet: ");
        System.out.println("ID: " + dompet.getId());
        System.out.println("Username: " + dompet.getUsername());
        System.out.println("Password: " + dompet.getPassword());
        System.out.println("Saldo: " + dompet.getSaldo());

        System.out.println("\nData TopUp: ");
        System.out.println("Metode TopUp: " + topUp.getMetodeTopUp());
        System.out.println("Tanggal: " + topUp.getTanggal() + "-" + topUp.getBulan() + "-" + topUp.getTahun());
        System.out.println("Waktu: " + topUp.getJam() + ":" + topUp.getMenit());
        System.out.println("Nominal: " + topUp.getNominal());
        System.out.println("Biaya Admin: " + topUp.getBiayaAdmin());
        System.out.println("Minimal Transfer: " + topUp.getMinimalTransfer());

        System.out.println("\nData Pembelian: ");
        System.out.println("Jenis Pembelian: " + pembelianObj.getPembelian());
        System.out.println("Kode Pembayaran: " + pembelianObj.getKodePembayaran());
        System.out.println("Tanggal: " + pembelianObj.getTanggal() + "-" + pembelianObj.getBulan() + "-" + pembelianObj.getTahun());
        System.out.println("Waktu: " + pembelianObj.getJam() + ":" + pembelianObj.getMenit());
        System.out.println("Total Bayar: " + pembelianObj.getTotalBayar());

        System.out.println("\nData Barang: ");
        System.out.println("Nama Barang: " + barang.getNama());
        System.out.println("Nama Toko: " + barang.getNamaToko());
        System.out.println("Harga: " + barang.getHarga());

        System.out.println("\nData Token Listrik: ");
        System.out.println("Nomor Listrik: " + tokenListrik.getNoListrik());
        System.out.println("Daftar Harga: " + tokenListrik.getDaftarHarga());
        System.out.println("Harga: " + tokenListrik.getHarga());

        System.out.println("\nData Pulsa Paket Data: ");
        System.out.println("Data: " + pulsaPaketData.getData());
        System.out.println("Pulsa: " + pulsaPaketData.getPulsa());
        System.out.println("Nomor HP: " + pulsaPaketData.getNomorHp());
        System.out.println("Nama Kartu: " + pulsaPaketData.getNamaKartu());
        System.out.println("Jenis: " + pulsaPaketData.getJenis());
        System.out.println("Harga: " + pulsaPaketData.getHarga());
    }
}
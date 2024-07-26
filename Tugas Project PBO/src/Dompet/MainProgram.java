/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dompet;

/**
 *
 * @author Michael
 */

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek-objek yang diperlukan
        Dompet pemilik = new Dompet();
        Dompet[] Pemilik = new Dompet[1];
        Dompet[] dompetku = new Dompet[1];
        Dompet dompet = new Dompet();
        TopUp topUp = new TopUp();
        Pembelian pembelianObj = new Pembelian();
        Barang barang = new Barang();
        TokenListrik tokenListrik = new TokenListrik();
        PulsaPaketData pulsaPaketData = new PulsaPaketData();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ Selamat Datang Di DompetKu ~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String opsi;

        do {
            System.out.print("Apakah Sudah memiliki Akun S/B ??");
            opsi = scanner.next();

            if (opsi.equalsIgnoreCase("S")) {
                // Login
                System.out.println("Opsi tidak valid, silahkan melakukan pendaftaran");
            } else if (opsi.equalsIgnoreCase("B")) {
                // Daftar
                System.out.print("Nama Lengkap\t: ");
                String nama = scanner.next();
                System.out.print("Alamat\t\t: ");
                String alamat = scanner.next();
                System.out.print("NIK\t\t: ");
                String nik = scanner.next();
                System.out.print("no Telpon\t: ");
                String noTelp = scanner.next();
                System.out.print("Username\t: ");
                String username = scanner.next();
                System.out.print("Password\t: ");
                String password = scanner.next();

                Pemilik[1].setNama(nama);
                Pemilik[1].setAlamat(alamat);
                Pemilik[1].setNik(nik);
                Pemilik[1].setNoTelp(noTelp);

                dompetku[1].setUsername(username);
                dompetku[1].setPassword(password);

                System.out.println("\n~~~~~~~~~~~~~~~ Selamat Datang ~~~~~~~~~~~~~~~");
                System.out.println("Username : " + dompetku[1].getUsername());
                System.out.println("Password : " + dompetku[1].getPassword());
                System.out.println("Pendaftaran Berhasil\n");
            } else {
                System.out.println("Opsi tidak valid");
            }
        } while (!opsi.equalsIgnoreCase("B"));

        boolean isLoggedOut = false;
        while (!isLoggedOut) {
            System.out.println(Pemilik[1].getNama());
            System.out.println("\n~~~~~~~~~~~~~~~ Selamat Datang ~~~~~~~~~~~~~~~");
            System.out.println("1. TopUP");
            System.out.println("2. Pembayaran");
            System.out.println("3. Tampil");
            System.out.println("4. Lihat Saldo");
            System.out.println("5. Edit Akun");
            System.out.println("6. LogOut");
            System.out.print("Pilih (1-6) : ");
            int pilihanMenuUtama = scanner.nextInt();
            dompetku[1]=new TopUp();
            switch (pilihanMenuUtama) {
                case 1:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ TopUP ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Metode pembayaran :");
                    System.out.println("1. Minimarket (Indomaret, Alfamidi)");
                    System.out.println("2. Mobile Banking");
                    System.out.print("Pilih Metode (1-2) : ");
                    int MetodeTopUp = scanner.nextInt();

                    if (MetodeTopUp == 1) {
                        System.out.println("~~~~~~~~~~~~~ Minimarket ~~~~~~~~~~~~~");
                        System.out.println("1. Indomaret");
                        System.out.println("2. Alfamart");
                        System.out.print("Pilih : ");
                        int pilihanMinimarket = scanner.nextInt();

                        if (pilihanMinimarket == 1) {
                            topUp.setMetodeTopUp("Minimarket");
                            topUp.setNamaMiniMarket("Indomaret");
                        } else if (pilihanMinimarket == 2) {
                            topUp.setMetodeTopUp("Minimarket");
                            topUp.setNamaMiniMarket("Alfamart");
                        }
                    } else if (MetodeTopUp == 2) {
                        topUp.setMetodeTopUp("Mobile Banking");
                    }

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Metode Yang dipilih\t: " + topUp.getMetodeTopUp());
                    System.out.println("Biaya Admin\t\t: " + topUp.getBiayaAdmin());
                    System.out.println("Minimal Topup\t\t: " + topUp.getMinTransfer());
                    System.out.print("Nominal Top Up\t\t: ");
                    double nominalTopUp = scanner.nextDouble();

//                    topUp.setNominalTopUp(nominalTopUp);
                    topUp.setNominal(nominalTopUp);
                    topUp.tambahSaldo(dompet);

                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Saldo Berhasil Ditambahkan");
                    System.out.println("Saldo Saat Ini : " + dompet.getSaldo());
                    break;

                case 2:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ Pembelian ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("1. Pulsa dan Paket Data");
                    System.out.println("2. Token Listrik");
                    System.out.println("3. Makanan / Barang");
                    System.out.println("4. Keluar");
                    System.out.print("Pilih (1-4) : ");
                    int pilihanPembelian = scanner.nextInt();

                    if (pilihanPembelian == 1) {
                        System.out.println("Gunakan Nomor HandPhonemu Y/N ??");
                        String gunakanNomorHp = scanner.next();

                        if (gunakanNomorHp.equalsIgnoreCase("Y")) {
                            pulsaPaketData.setNomorHp(pemilik.getNoTelp());

                        } else if (gunakanNomorHp.equalsIgnoreCase("N")) {
                            System.out.print("Masukkan Nomor HnadPhonemu : ");
                            String NoHp = scanner.next();
                            pulsaPaketData.setNomorHp(NoHp);
                        }

                        //REVISI HARUSNYA NOMOR
                        System.out.println("~~~~~~~ Pulsa dan Paket Data ~~~~~~~~");
                        System.out.println("1. Pulsa");
                        System.out.println("2. Paket Data");
                        System.out.println("3. Keluar");
                        System.out.print("Pilih (1-3) : ");
                        int pilihanPulsaPaketData = scanner.nextInt();

                        if (pilihanPulsaPaketData == 1) {
                            System.out.println("\nNoHP : " + pulsaPaketData.getNomorHp());

                            System.out.println("1\t10.000\t10500.0");
                            System.out.println("2\t20.000\t20500.0");
                            System.out.println("3\t50.000\t50500.0");
                            System.out.println("4\t100.000\t100500.0");
                            System.out.println("5\t200.000\t200500.0");

                            System.out.print("Pilih (1-5) : ");
                            int pilihanPulsa = scanner.nextInt();

                            if (pilihanPulsa >= 1 && pilihanPulsa <= 5) {
                                double hargaPulsa = pulsaPaketData.getPulsa(pilihanPulsa);
                                if (dompet.getSaldo() >= hargaPulsa) {
                                    pulsaPaketData.setJenis("Pulsa");
                                    pulsaPaketData.setNominal(hargaPulsa);
                                    pulsaPaketData.namaPembelian(dompet);
                                    dompet.setSaldo(dompet.getSaldo() - hargaPulsa);
                                    System.out.println("Pulsa Berhasil dibeli");
                                    System.out.println("Saldo Anda saat ini: Rp " + dompet.getSaldo());
                                } else {
                                    System.out.println("Saldo tidak mencukupi");
                                }
                            } else {
                                System.out.println("Pilihan tidak valid");
                            }
                        } else if (pilihanPulsaPaketData == 2) {
                            System.out.println("\nNoHP : " + pulsaPaketData.getNomorHp());

                            System.out.println("1\tInternet Volume 6 GB 30 hari\t19000.0");
                            System.out.println("2\tInternet Volume 10 GB 30 hari\t29000.0");
                            System.out.println("3\tInternet Volume 16 GB 30 hari\t39500.0");
                            System.out.println("4\tInternet Volume 60 GB 30 hari\t59000.0");

                            System.out.print("Pilih (1-4) : ");
                            int pilihanPaketData = scanner.nextInt();

                            if (pilihanPaketData >= 1 && pilihanPaketData <= 4) {
                                double hargaPaketData = pulsaPaketData.getPaketData(pilihanPaketData);
                                if (dompet.getSaldo() >= hargaPaketData) {
                                    pulsaPaketData.setJenis("Paket Data");
                                    pulsaPaketData.setNominal(hargaPaketData);
                                    pulsaPaketData.namaPembelian(dompet);
                                    dompet.setSaldo(dompet.getSaldo() - hargaPaketData);
                                    System.out.println("Paket Data Berhasil dibeli");
                                    System.out.println("Saldo Anda saat ini: Rp " + dompet.getSaldo());
                                } else {
                                    System.out.println("Saldo tidak mencukupi");
                                }
                            } else {
                                System.out.println("Pilihan tidak valid");
                            }
                        } else if (pilihanPulsaPaketData == 3) {
                            break;
                        } else {
                            System.out.println("Pilihan tidak valid");
                        }
                    } else if (pilihanPembelian == 2) {
                        System.out.print("Masukkan No Listrik : ");
                        String noListrik = scanner.next();

                        System.out.println("1\t20.000\t20500.0");
                        System.out.println("2\t50.000\t50500.0");
                        System.out.println("3\t100.000\t100500.0");
                        System.out.println("4\t500.000\t500500.0");

                        System.out.print("Pilih (1-4) : ");
                        int pilihanTokenListrik = scanner.nextInt();

                        if (pilihanTokenListrik >= 1 && pilihanTokenListrik <= 4) {
                            double hargaToken = tokenListrik.getTokenListrik(pilihanTokenListrik);
                            if (dompet.getSaldo() >= hargaToken) {
                                tokenListrik.setNoListrik(noListrik);
                                tokenListrik.setNominal(hargaToken);
                                tokenListrik.namaPembelian(dompet);
                                dompet.setSaldo(dompet.getSaldo() - hargaToken);
                                System.out.println("No Listrik : " + tokenListrik.getNoListrik());
                                System.out.println("Token Listrik Berhasil dibeli");
                                System.out.println("Saldo Anda saat ini: Rp " + dompet.getSaldo());
                            } else {
                                System.out.println("Saldo tidak mencukupi");
                            }
                        } else {
                            System.out.println("Pilihan tidak valid");
                        }

                    } else if (pilihanPembelian == 3) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ Makanan / Barang ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        // Membuat objek RumahMakan
                        RumahMakan rumahMakan = new RumahMakan();

                        // Menyimpan daftar makanan/barang dan harga ke objek RumahMakan
                        rumahMakan.setDaftarMakanan(new String[]{"Makanan Ringan", "Minuman Botol", "Permen", "Coklat"});
                        rumahMakan.setHargaMakanan(new double[]{5000.0, 7000.0, 2000.0, 10000.0});

                        for (int i = 0; i < rumahMakan.getDaftarMakanan().length; i++) {
                            System.out.println((i + 1) + ". " + rumahMakan.getDaftarMakanan()[i] + " - Rp " + rumahMakan.getHargaMakanan()[i]);
                        }
                        System.out.println((rumahMakan.getDaftarMakanan().length + 1) + ". Keluar");

                        System.out.print("Pilih (1-" + (rumahMakan.getDaftarMakanan().length + 1) + "): ");
                        int pilihanMakananBarang = scanner.nextInt();

                        if (pilihanMakananBarang >= 1 && pilihanMakananBarang <= rumahMakan.getDaftarMakanan().length) {
                            double hargaMakanan = rumahMakan.getHargaMakanan()[pilihanMakananBarang - 1];
                            if (dompet.getSaldo() >= hargaMakanan) {
                                dompet.setSaldo(dompet.getSaldo() - hargaMakanan);
                                System.out.println("Anda membeli " + rumahMakan.getDaftarMakanan()[pilihanMakananBarang - 1] + " dengan harga Rp " + hargaMakanan);
                                System.out.println("Saldo Anda saat ini: Rp " + dompet.getSaldo());
                            } else {
                                System.out.println("Saldo tidak mencukupi");
                            }
                        } else if (pilihanMakananBarang == rumahMakan.getDaftarMakanan().length + 1) {
                            System.out.println("Keluar");
                        } else {
                            System.out.println("Pilihan tidak valid");
                        }
                        break;
//                        System.out.println("Fitur ini belum tersedia");
                    } else if (pilihanPembelian == 4) {
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                    break;

                case 3:
                    System.out.println("\n~~~~~~~~~~~~~ Tampil ~~~~~~~~~~~~~");
                    System.out.println("1. Akun");
                    System.out.println("2. Riwayat Transaksi");
                    System.out.print("Pilih menu(1-2) : ");
                    int pilihanTampil = scanner.nextInt();

                    switch (pilihanTampil) {
                        case 1:
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ Tampil ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("Tampilan saat ini");
                            System.out.println("Nama Lengkap\t: " + pemilik.getNama());
                            System.out.println("Alamat\t\t: " + pemilik.getAlamat());
                            System.out.println("No HP\t\t: " + pemilik.getNoTelp());
                            System.out.println("Username\t: " + dompet.getUsername());
                            System.out.println("Saldo\t\t: " + dompet.getSaldo());
                            break;

                        case 2:
                            System.out.println("\n~~~~~~~~~~~~~ Tampil ~~~~~~~~~~~~~");
                            System.out.println("1. Cetak Data TopUp");
                            System.out.println("2. Cetak Data Pembelian");
                            System.out.print("Pilih menu(1-2) : ");
                            int pilihanRiwayatTransaksi = scanner.nextInt();

                            switch (pilihanRiwayatTransaksi) {
                                case 1:
                                    // Logika Cetak Data TopUp
                                    break;
                                case 2:
                                    // Logika Cetak Data Pembelian
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid");
                            }
                            break;
                        default:
                            System.out.println("Pilihan tidak valid");
                    }
                    break;
                case 4:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ Lihat Saldo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Saldo Anda : " + dompet.getSaldo());
                    break;

                case 5:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ Edit Akun ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.print("Nama Lengkap\t: ");
                    pemilik.setNama(scanner.next());
                    System.out.print("Alamat\t\t: ");
                    pemilik.setAlamat(scanner.next());
                    System.out.print("NIK\t\t: ");
                    pemilik.setNik(scanner.next());
                    System.out.print("no Telpon\t: ");
                    pemilik.setNoTelp(scanner.next());
                    System.out.print("Username\t: ");
                    dompet.setUsername(scanner.next());
                    System.out.print("Password\t: ");
                    dompet.setPassword(scanner.next());
                    break;

                case 6:
                    System.out.println("Anda telah logout");
                    isLoggedOut = true;
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }

        System.out.println(
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~ Terima Kasih Telah Menggunakan DompetKu ~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}
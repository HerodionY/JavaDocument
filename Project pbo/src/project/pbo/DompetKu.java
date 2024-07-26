/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.pbo;

/**
 *
 * @author ACER
 */


  
import java.util.*;

public class DompetKu implements Pemilik {

    Scanner user = new Scanner(System.in);
    private int jumlahTopUpIndex, jumlahPembelianIndex = 0, jumlahAkunIndex;
    private TokenListrik[] daftar;
    private TopUp_Minimarket[] mini = new TopUp_Minimarket[2];
    private TopUp_M_Banking[] mBanking = new TopUp_M_Banking[100];
    private Barang[] barang;
    private TopUp[] topup = new TopUp[100];
    
    private  boolean loggedIn;
    
    
    String id;
     private String Username;
    private String Password;
    private Double saldo;
    private String nama;
    private String alamat;
    private String nik;
    private String noTelp; 

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    
 

    public void setTopup(TopUp[] topup) {
        this.topup = topup;
    }

    public TopUp[] getTopup() {
        return topup;
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUser(Scanner user) {
        this.user = user;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    

 
   
  

  

   public int login(DompetKu[] akun, Scanner scanner) {
    boolean loggedIn = false; // Initialize loggedIn variable
    int index = -1; // Initialize index variable to indicate no match
    
    while (!loggedIn) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        for (int i = 0; i < akun.length; i++) {
            if (akun[i] != null && username.equals(akun[i].getUsername()) && password.equals(akun[i].getPassword())) {
                loggedIn = true;
                index = i;
                setLoggedIn(true);
                break; // Exit the loop if a match is found
            }
        }
        
        if (!loggedIn) {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
    
    return index;
}



    public void register(DompetKu[] akun,Scanner scanner,int banyak) {
        
        akun[banyak]=new DompetKu();
        System.out.print("Nama Lengkap: ");
        akun[banyak].setNama(scanner.nextLine());
        System.out.print("Alamat: ");
         akun[banyak].setAlamat( scanner.nextLine());
        System.out.print("NIK: ");
         akun[banyak].setNik(scanner.nextLine());
        System.out.print("No Telpon: ");
         akun[banyak].setNoTelp(scanner.nextLine());
        System.out.print("Username: ");
         akun[banyak].setUsername(scanner.nextLine());
        System.out.print("Password: ");
         akun[banyak].setPassword(scanner.nextLine());
         akun[banyak].setSaldo(0.0);
         
        setLoggedIn(true);
    }

 public void topUp(DompetKu[] akun, Scanner scanner, int banyak) {
    int i = banyak;
    akun[i] = new DompetKu();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ TopUP ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Metode pembayaran :");
    System.out.println("1. Mobile Banking");
    System.out.println("2. Minimarket (Indomaret, Alfamart)");
    System.out.print("Pilih Metode (1-2) : ");
    int metode = scanner.nextInt();
    scanner.nextLine();

    switch (metode) {
        case 1:
            System.out.println("Metode pembayaran: Mobile Banking");
            break;
        case 2:
            System.out.println("~~~~~~~~~~~~~ Minimarket ~~~~~~~~~~~~~");
            System.out.println("1. Indomaret");
            System.out.println("2. Alfamart");
            System.out.print("Pilih (1-2) : ");
            int minimarket = scanner.nextInt();
            scanner.nextLine();

            switch (minimarket) {
                case 1:
                    System.out.println("Nama Minimarket: Indomaret");
                    break;
                case 2:
                    System.out.println("Nama Minimarket: Alfamart");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }
            break;
        default:
            System.out.println("Pilihan tidak valid.");
            return;
    }

    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    double adminFee = 0.0;
    double minTopUp = 0.0;

    if (metode == 1) {
        // Mobile Banking
        adminFee = 0.0;
        minTopUp = 50000.0;
    } else if (metode == 2) {
        // Minimarket
        adminFee = 3000.0;
        minTopUp = 12000.0;
    }

    System.out.println("Metode Yang dipilih\t: " + ((metode == 1) ? "Mobile Banking" : "Minimarket"));
    System.out.println("Biaya Admin\t\t: " + adminFee);
    System.out.println("Minimal Topup\t\t: " + minTopUp);
    System.out.print("Nominal Top Up\t\t: ");
    double topUpAmount = scanner.nextDouble();
    scanner.nextLine();

    if (topUpAmount < minTopUp) {
        System.out.println("Jumlah top up tidak mencapai batas minimum.");
        return;
    }

    akun[i].setSaldo(akun[i].getSaldo() + topUpAmount - adminFee);
    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Saldo Berhasil Ditambahkan");
    System.out.println("Saldo Saat Ini: " + akun[i].getSaldo());
}




    public void pembayaran(Scanner scanner) {
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

    public void tampil(Scanner scanner) {
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

    public  void lihatSaldo() {
        System.out.println("Saldo saat ini: " + getSaldo());
    }

    public void editAkun(Scanner scanner) {
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

    @Override
    public String getNama() {
         return nama;
}

   public  void barang() {
       System.out.println("");
        barang = new Barang[];
        barang[0] = new Barang();
        barang[0].setNamaToko("Pemesinan Antok");
        barang[0].setNama("Mesin Spinner");
        barang[0].setHarga(250000);
        barang[0].setPembelian("Barang");
        barang[0].setKodePembayaran("2133322222111321");
        barang[1] = new Barang();
        barang[1].setNamaToko("Surga Sepatu");
        barang[1].setNama("Ventela Public High");
        barang[1].setHarga(250000);
        barang[1].setPembelian("Barang");
        barang[1].setKodePembayaran("2133221112133123");
    }

   
    public void paketData() {
    data = new PaketData[4];
    String[] voucher = new String[4];
    double[] harga = new double[4];
    voucher[0] = "Freedom U 5.5 GB 30 hari";
    harga[0] = 26900;
    voucher[1] = "Freedom U 10 GB 30 hari";
    harga[1] = 46900;
    voucher[2] = "Freedom U 20 GB 30 hari";
    harga[2] = 96900;
    voucher[3] = "Freedom U 30 GB 30 hari";
    harga[3] = 146900;
    
    for (int i = 0; i < data.length; i++) {
        data[i] = new PaketData();
        data[i].setVoucher(voucher[i]);
        data[i].setHarga(harga[i]);
    }
}
   

    public void daftarHarga() {
        daftar = new TokenListrik[4];
        daftar[0] = new TokenListrik();
        daftar[0].setDaftarHarga("20.000");
        daftar[0].setHarga(20500);
        daftar[1] = new TokenListrik();
        daftar[1].setDaftarHarga("50.000");
        daftar[1].setHarga(50500);
        daftar[2] = new TokenListrik();
        daftar[2].setDaftarHarga("100.000");
        daftar[2].setHarga(100500);
        daftar[3] = new TokenListrik();
        daftar[3].setDaftarHarga("500.000");
        daftar[3].setHarga(500500);
    }

   

}


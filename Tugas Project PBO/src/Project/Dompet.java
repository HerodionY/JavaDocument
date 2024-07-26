/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;


public class Dompet implements Pemilik {

    private String id;
    private String nama;
    private String alamat;
    private String nik;
    private String noTelp;
    private String username;
    private String password;
    double saldo;
    public TopUp[] Top;
    public TopUp topup;
    private Pembelian[] bell;
    private Pembelian[] riwayatPembelian;
    private int jumlahPembelian;
    private TopUp[] riwayatTopUp;
    private int jumlahTopUp;

    
    
    public Dompet(double saldo) {
        this.saldo = saldo;
        riwayatTopUp = new TopUp[100];
        riwayatPembelian = new Pembelian[100];
        jumlahTopUp = 0;
        jumlahPembelian = 0;
    }

    Dompet() {
    }

    public void tambahTopUp(TopUp topUp) {
        if (jumlahTopUp < riwayatTopUp.length) {
            riwayatTopUp[jumlahTopUp] = topUp;
            jumlahTopUp++;
        } else {
            System.out.println("Riwayat top up penuh. Tidak dapat menambahkan top up baru.");
        }
    }

    public void cetakRiwayatTopUp() {
        System.out.println("\nRiwayat Top Up:");
        System.out.println("No\tMetode Pembayaran\tNama\t\tNominal\tTanggal\t\tWaktu");

        for (int i = 0; i < jumlahTopUp; i++) {
            TopUp topUp = riwayatTopUp[i];
            System.out.println((i + 1) + "\t" + topUp.getMetodeTopUp() + "\t\t"
                    + topUp.getNamaMiniMarket() + "\t" + topUp.getNominal() + "\t"
                    + topUp.getTanggal() + "\t" + topUp.getJam());
        }
    }

    public TopUp[] getTop() {
        return Top;
    }

    public void setTop(TopUp[] Top) {
        this.Top = Top;
    }

    public double getSaldo() {
        return saldo;
    }

    public double tambahSaldo(double jumlah) {
        saldo += jumlah;
        return saldo;
    }

    public void kurangSaldo(double jumlah) {
        saldo -= jumlah;
    }

    public void tambahPembelian(Pembelian pembelian) {
        if (jumlahPembelian < riwayatPembelian.length) {
            riwayatPembelian[jumlahPembelian] = pembelian;
            jumlahPembelian++;
        } else {
            System.out.println("Riwayat pembelian penuh. Tidak dapat menambahkan pembelian baru.");
        }
    }

    public Pembelian[] getBell() {
        return bell;
    }

    public void setBell(Pembelian[] bell) {
        this.bell = bell;
    }

    public void cetakRiwayatPembelian() {
        System.out.println("\nRiwayat Pembelian:");
        System.out.println("No\tJenis\t\tNama\t\tHarga\t\tTanggal");

        for (int i = 0; i < jumlahPembelian; i++) {
            Pembelian pembelian = riwayatPembelian[i];
            System.out.println((i + 1) + "\t" + pembelian.getJenis() + "\t\t"
                    + pembelian.getNama() + "\t\t" + pembelian.getHarga() + "\t\t"
                    + pembelian.getTanggal());
        }

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public void setTopup(TopUp topup) {
        this.topup = topup;
    }

    public TopUp getTopup() {
        return topup;
    }

    public Pembelian[] getRiwayatPembelian() {
        return riwayatPembelian;
    }

    public void setRiwayatPembelian(Pembelian[] riwayatPembelian) {
        this.riwayatPembelian = riwayatPembelian;
    }

    public int getJumlahPembelian() {
        return jumlahPembelian;
    }

    public void setJumlahPembelian(int jumlahPembelian) {
        this.jumlahPembelian = jumlahPembelian;
    }

    @Override
    public String getNama() {
        return nama;  // implementasi sesuai kebutuhan
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;// implementasi sesuai kebutuhan
    }

    @Override
    public String getAlamat() {
        return alamat;  // implementasi sesuai kebutuhan
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;// implementasi sesuai kebutuhan
    }

    @Override
    public String getNik() {
        return nik;  // implementasi sesuai kebutuhan
    }

    @Override
    public void setNik(String nik) {
        this.nik = nik;// implementasi sesuai kebutuhan
    }

    @Override
    public String getNoTelp() {
        return noTelp;  // implementasi sesuai kebutuhan
    }

    @Override
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;// implementasi sesuai kebutuhan
    }

       
}
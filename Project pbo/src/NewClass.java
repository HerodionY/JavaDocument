/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author Michael
 */
public class Dompet implements Pemilik {
    private String id;
    private String nama;
    private String alamat;
    private String nik;
            private String noTelp;
    private String username;
    private String password;
    private double saldo;
    private TopUp topup;
    private Pembelian[] bell;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
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

    public void setBell(Pembelian[] pembelian) {
        this.bell = pembelian;
    }

    public Pembelian[] getBell() {
        return bell;
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
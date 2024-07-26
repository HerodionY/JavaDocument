/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekPboRevisi;

/**
 *
 * @author ACER
 */
public class Dompet implements Pemilik {
    private String id;
    private String username;
    private String password;
    private double saldo;
    private TopUp topup;
    private Pembelian[] bell;

    Dompet(String idDompet, String usernameDompet, String passwordDompet, double saldoDompet) {
            }

    Dompet() {
       }

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
        return null;  // implementasi sesuai kebutuhan
    }

    @Override
    public void setNama(String nama) {
        // implementasi sesuai kebutuhan
    }

    @Override
    public String getAlamat() {
        return null;  // implementasi sesuai kebutuhan
    }

    @Override
    public void setAlamat(String alamat) {
        // implementasi sesuai kebutuhan
    }

    @Override
    public String getNik() {
        return null;  // implementasi sesuai kebutuhan
    }

    @Override
    public void setNik(String nik) {
        // implementasi sesuai kebutuhan
    }

    @Override
    public String getNoTelp() {
        return null;  // implementasi sesuai kebutuhan
    }

    @Override
    public void setNoTelp(String noTelp) {
        // implementasi sesuai kebutuhan
    }
}

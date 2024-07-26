/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

/**
 *
 * @author ACER
 */
public class RekeningBank {
    private String nomorRekening;
private int saldo;



 public RekeningBank(String nomor)
 { nomorRekening = nomor;
saldo = 0;}
 public int cekSaldo()
 {
 return saldo;
 }
 public void tabung(int jumlah)
 {
 saldo = saldo + jumlah;
 }
 public void ambil(int jumlah)
 {
saldo = saldo -jumlah;
 }

}

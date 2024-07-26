/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.Modul_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class PersegiMain {//class
    public static void main(String[] args) {//metode main
Persegi objPersegi=new Persegi();//membuat objek objpersegi 

objPersegi.panj=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));//membuat panel untuk menginput variabel panj dengan memunculkan input dialog dengan tulisan masukan panjang 

objPersegi.lebar=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));//membuat panel untuk menginput variabel lebar dengan memunculkan input dialog dengan tulisan masukan lebar
JOptionPane.showMessageDialog(null, "Luas dari persegidengan panjang="+objPersegi.panj+" dan lebar = "+objPersegi.lebar+"adalah "+objPersegi.luas());
 }//memunculkan panel dialog dengan tulisan Luas dari persegi dengan 0panjang ditambah dengan isi variable panj dari objek objpersegi ditambah dengan tulisan "dan lebar =" ditambah dengan isi variabel lebar dari objek objpersegi fitambah dengan tulisan "adalah" ditambah dengan metode luas dari objek objpersegi
}

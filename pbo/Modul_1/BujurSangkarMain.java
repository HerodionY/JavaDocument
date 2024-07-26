/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.Modul_1;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class BujurSangkarMain {
    public static void main(String[] args) {//metode main
BujurSangkar bujur1=new BujurSangkar();//objek bujur satu adalah konstruktor bujurSangkar
BujurSangkar bujur2=new BujurSangkar();//objek bujur dua adalah konstruktor bujurSangkar
Scanner tombol = new Scanner(System.in);//membuat scanner dengan nama tombol
System.out.print("Masukkan sisi bujur sangkar I :");//mencetak tulisan "MAsukan sis bujur sangkar 1"
bujur1.sisi = tombol.nextInt();//
System.out.print("Masukkan sisi bujur sangkar II:");
bujur1.sisi = tombol.nextInt();
System.out.println("Luas Bujur Sangkar dengan sisi="+bujur1.sisi+" adalah "+bujur1.luas());
System.out.println("Luas Bujur Sangkar dengan sisi="+bujur2.sisi+" adalah "+bujur2.luas());
 }
}

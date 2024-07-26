/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul4;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MahasiswaMain {
    public static void main (String[] args) {
        Scanner user=new Scanner(System.in);
        int N;
        System.out.println("Masukan Banyak data yang akan diproses : ");
        N=user.nextInt();
 //--------- Mendeklarasikan dan mengalokasikan array ---------//
 MahasiswaNim[] mhs;
mhs = new MahasiswaNim[N];
String name, nimm, tglLahi;
double uts1 = 0,uts2 = 0,uas = 0,nilaiTotal=0;



for (int i = 0; i < mhs.length; i++) {

//----------- Membaca data dari keyboard-------------------//
System.out.println("Masukan NIM : ");
    nimm =MahasiswaNim.user();
    System.out.println("Masukan Nama anda : ");
name = MahasiswaNim.user();
    System.out.println("Masukan tanggal lahir anda : ");
tglLahi =MahasiswaNim.user();
mhs[i].setNim(nimm);
mhs[i].setNama(name);
mhs[i].setTglLahir(tglLahi);

//----Membuat obyek baru bertipe Mahasiswa dan mengisikan nilainya----//
mhs[i] = new MahasiswaNim(nimm,name,tglLahi);
//uts1=Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan Nilai Uts Pertama "));
//uts2=Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan Nilai Uts Kedua "));
//uas=Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan Nilai UAS "));
mhs[i].setUts1(uts1);
mhs[i].setUts2(uts2);
mhs[i].setUas(uas);
mhs[i].nilaiFinal(uts1, uts2, uas);

mhs[i].tandaNilai(mhs[i].getNilaiFinal());

 }
        System.out.println("Daftar Mahasiswa Informatika Peserta PBO");
        System.out.println("____________________________________________________________________________________________________________-");
        System.out.println("No.   NIM           Nama           Tgl Lahir          Uts1           Uts2             Uas                 Final Nilai");
        for (int i = 0; i < mhs.length; i++) {
            System.out.printf("%d0",i+1);
            System.out.printf("%d6",mhs[i].getNim());
            System.out.printf("%s14",mhs[i].getNama());
            System.out.printf("%d16",mhs[i].getTglLahir());
            System.out.printf("%d19",mhs[i].getUts1());
            System.out.printf("%d15",mhs[i].getUts2());
            System.out.printf("%d17",mhs[i].getUas());
            System.out.printf("%d20",mhs[i].getNilaiFinal());
            System.out.println();
            
            
        }



 
 }
}

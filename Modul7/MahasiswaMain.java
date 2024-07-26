/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul7;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user=new Scanner(System.in);
        int banyakMahasiswa,uts1,uts2,uas;
        String nama,nim,tglLahir;
        Mahasiswa[] mhs=new Mahasiswa[100];
        Mahasiswa m=new Mahasiswa();
        S1[] mhsS1=new S1[100];
        S2[] mhsS2=new S2[100];
        S1 mahasiswaS1=new S1();
        S2 mahasiswaS2=new S2();
        String jenisMahasiswa;
        int banyakS1=0;
        int banyakS2=0;
        System.out.println("Masukan Daftar Mahasiswa Informatika Peserta PBO");
        System.out.println("____________________________________________________________________");
        System.out.println("Masukan Banyak Mahasiswa Yang akan Dimasukan : ");
        banyakMahasiswa=user.nextInt();
        for (int i = 0; i < banyakMahasiswa; i++) { 
            System.out.println("Masukan NIM : ");
            nim=m.ketik();
            System.out.print("Masukan Nama : ");
            nama=m.ketik();
            System.out.println("Masukan Tanggal Lahir : ");
            tglLahir=m.ketik();
            System.out.println("Masukan Nilai UTS1 : ");
            uts1=user.nextInt();
            System.out.println("Masukan Nilai UTS2 : ");
            uts2=user.nextInt();
            System.out.println("Masukan Nilai UAS : ");
            uas=user.nextInt();
            System.out.println("Masukan Jenis Mahasiswa : ");
            jenisMahasiswa=m.ketik().toUpperCase();
           double nilaiFinal=m.nilaiFinal(uts1, uts2, uas);
            if (jenisMahasiswa.equalsIgnoreCase("S1")) {
                 int k=0;
                    String namaHuruf=mahasiswaS1.nilaiHuruf1(nilaiFinal);
                    mhsS1[k]=new S1( nama,  nim,  tglLahir,  namaHuruf, uts1, uts2,  uas,  nilaiFinal );
                    banyakS1++;
                    k++;
            }else if (jenisMahasiswa.equalsIgnoreCase("S2")) {
                int j=0;
                String namaHuruf2=mahasiswaS2.nilaiHuruf2(nilaiFinal);
                     mhsS2[j]=new S2( nama,  nim,  tglLahir,  namaHuruf2, uts1, uts2,  uas,  nilaiFinal );
                banyakS2++;
                j++;
            }
            
           
           
      }
        System.out.println("Daftar Mahasiswa Informatika Peserta PBO S1 : ");
       System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.printf("%-4s","No. ");
        System.out.printf("%-15s","NIM");
        System.out.printf("%-18s","Nama");
        System.out.printf("%-15s","Tgl Lahir ");
        System.out.printf("%-15s","Uts 1");
        System.out.printf("%-15s","Uts 2");
        System.out.printf("%-15s","UAS");
        System.out.printf("%-15s","Final");
        System.out.printf("%-15s","Nilai");
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < banyakS1; i++) {
         System.out.printf("%-4s",i+1);
        System.out.printf("%-15s",mhsS1[i].getNim());
        System.out.printf("%-18s",mhsS1[i].getNama());
        System.out.printf("%-15s",mhsS1[i].getTglLahir());
        System.out.printf("%-15s",mhsS1[i].getUts1());
        System.out.printf("%-15s",mhsS1[i].getUts2());
        System.out.printf("%-15s",mhsS1[i].getUas());
        System.out.printf("%-15s",mhsS1[i].getNilaiFinal());
        System.out.printf("%-15s",mhsS1[i].getNilaiHuruf());
        System.out.println("");
            
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Daftar Mahasiswa Informatika Peserta PBO S2 : ");
      System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.printf("%-4s","No. ");
        System.out.printf("%-15s","NIM");
        System.out.printf("%-18s","Nama");
        System.out.printf("%-15s","Tgl Lahir ");
        System.out.printf("%-15s","Uts 1");
        System.out.printf("%-15s","Uts 2");
        System.out.printf("%-15s","UAS");
        System.out.printf("%-15s","Final");
        System.out.printf("%-15s","Nilai");
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < banyakS2; i++) {
         System.out.printf("%-4s",i+1);
        System.out.printf("%-15s",mhsS2[i].getNim());
        System.out.printf("%-18s",mhsS2[i].getNama());
        System.out.printf("%-15s",mhsS2[i].getTglLahir());
        System.out.printf("%-15s",mhsS2[i].getUts1());
        System.out.printf("%-15s",mhsS2[i].getUts2());
        System.out.printf("%-15s",mhsS2[i].getUas());
        System.out.printf("%-15s",mhsS2[i].getNilaiFinal());
        System.out.printf("%-15s",mhsS2[i].getNilaiHuruf());
        System.out.println("");
            
        }
         System.out.println("-________________________________________________________________________________________________________________________________________________________________________________________________________________");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Daftar mahasiswa S1 Nilai Tertinggi : ");
        System.out.println("-________________________________________________________________________________________________________________________________________________________________________________________________________________");
        double nilaiMahasiswaS1Tinggi = Integer.MAX_VALUE;
    int indeksMahasiswaS1Tinggi= -1;
    for (int i = 0; i < banyakS1; i++) {
        if (mhsS1[i].getNilaiFinal() < nilaiMahasiswaS1Tinggi) {
            nilaiMahasiswaS1Tinggi = mhsS1[i].getNilaiFinal();
            indeksMahasiswaS1Tinggi = i;
        }
    }
    if (indeksMahasiswaS1Tinggi  != -1) {
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS1Tinggi].getNim());
        System.out.printf("%-18s",mhsS1[indeksMahasiswaS1Tinggi].getNama());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS1Tinggi].getTglLahir());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS1Tinggi].getUts1());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS1Tinggi].getUts2());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS1Tinggi].getUas());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS1Tinggi].getNilaiFinal());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS1Tinggi].getNilaiHuruf());
        System.out.println("");
    } else {
        System.out.println("Tidak ada mahasiswa yang ditemukan.");
    }
    System.out.println("-________________________________________________________________________________________________________________________________________________________________________________________________________________");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Daftar mahasiswa S2 Nilai Tertinggi : ");
        System.out.println("-________________________________________________________________________________________________________________________________________________________________________________________________________________");
        double nilaiMahasiswaS2Tinggi = Integer.MAX_VALUE;
    int indeksMahasiswaS2Tinggi= -1;
    for (int i = 0; i < banyakS2; i++) {
        if (mhsS2[i].getNilaiFinal() < nilaiMahasiswaS2Tinggi) {
            nilaiMahasiswaS2Tinggi = mhsS2[i].getNilaiFinal();
            indeksMahasiswaS2Tinggi = i;
        }
    }
    if (indeksMahasiswaS2Tinggi  != -1) {
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS2Tinggi].getNim());
        System.out.printf("%-18s",mhsS1[indeksMahasiswaS2Tinggi].getNama());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS2Tinggi].getTglLahir());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS2Tinggi].getUts1());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS2Tinggi].getUts2());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS2Tinggi].getUas());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS2Tinggi].getNilaiFinal());
        System.out.printf("%-15s",mhsS1[indeksMahasiswaS2Tinggi].getNilaiHuruf());
        System.out.println("");
    } else {
        System.out.println("Tidak ada mahasiswa yang ditemukan.");
    }
    }
   

    
}

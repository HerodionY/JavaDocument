/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.kelompok;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class TugasKelompok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner THR=new Scanner(System.in);
        int gP,tK,tF,tS,pM,hK,code,dosenPNS,dosenYayasan;
        double calonDosen;
        String nama;
        System.out.println("Masukan Nama Anda : ");
        nama=THR.nextLine();
        System.out.println("Masukan Code Anda : ");
        code=THR.nextInt();
        
        
        if(code==1){//Dosen Pegawai Negeri Sipil dipekerjakan(dpk)
                System.out.println("Masukan Gaji Pokok Anda : ");
                gP=THR.nextInt();
                System.out.print("Masukan Tunjangan Keluarga anda : ");
                tK=THR.nextInt();
                System.out.print("Masukan Tunjangan Fungsional anda : ");
                tF=THR.nextInt();
                System.out.print("Masukan Tunjangan Struktural : ");
                tS=THR.nextInt();
                System.out.print("Masukan THR dari pemerintah : ");
                pM=THR.nextInt();
                dosenPNS=gP+tK+tF+tS-pM;
                System.out.println("Nama "+nama);
                System.out.println("Status : Dosen Pegawai Negeri Sipil dipekerjakan(dpk) ");
                System.out.println("Tunjangan "+dosenPNS);
        }       
        else if(code==2){//Dosen dalam Dinas Tetap Yayasan
                      System.out.println("Masukan Gaji Pokok Anda : ");
                      gP=THR.nextInt();
                      System.out.print("Masukan Tunjangan Keluarga anda : ");
                      tK=THR.nextInt();
                      System.out.print("Masukan Tunjangan Fungsional anda : ");
                      tF=THR.nextInt();
                      System.out.print("Masukan Tunjangan Struktural : ");
                      tS=THR.nextInt();
                      dosenYayasan=gP+tK+tF+tS;
                      System.out.println("Nama "+nama);
                      System.out.println("Status : Dosen dalam Dinas Tetap Yayasan ");
                      System.out.println("Tunjangan "+dosenYayasan);
            }
            else if(code==3){//Calon Pegawai (Dosen)
                          System.out.println("Masukan Gaji Pokok Anda : ");
                          gP=THR.nextInt();
                          System.out.print("Masukan Tunjangan Keluarga anda : ");
                          tK=THR.nextInt();
                          System.out.print("Masukan Tunjangan Fungsional anda (bagi yang memiliki jika tidak tolong tulis angka 0 ) : ");
                          tF=THR.nextInt();
                          System.out.print("Masukan Tunjangan Struktural : ");
                          tS=THR.nextInt();
                          calonDosen=(0.8*gP)+tK+tF+tS;
                          System.out.println("Nama "+nama);
                          System.out.println("Status : Calon Pegawai (Dosen) ");
                          System.out.println("Tunjangan "+calonDosen);
                }
                else if(code==4){//Dosen Tidak Tetap (Kontrak)
                                System.out.print("Masukan Honor Kontrak satu bulan Anda : ");
                                hK=THR.nextInt();
                                System.out.println("Nama "+nama);
                                System.out.println("Status : Dosen Tidak Tetap (Kontrak) ");
                                System.out.println("Tunjangan "+hK);
            
                    }
                    else if(code==5){//Tenaga Kependidikan dalam Dinas Tetap Yayasan
                                    System.out.println("Masukan Gaji Pokok Anda : ");
                                    gP=THR.nextInt();
                                    System.out.print("Masukan Tunjangan Keluarga anda : ");
                                    tK=THR.nextInt();
                                    System.out.print("Masukan Tunjangan Fungsional anda : ");
                                    tF=THR.nextInt();
                                    System.out.print("Masukan Tunjangan Struktural : ");
                                    tS=THR.nextInt();
                                    dosenYayasan=gP+tK+tF+tS;
                                    System.out.println("Nama "+nama);
                                    System.out.println("Status : Tenaga Kependidikan dalam Dinas Tetap Yayasan ");
                                    System.out.println("Tunjangan "+dosenYayasan);
                        }
                        else if(code==6){//Calon Pegawai
                                        System.out.println("Masukan Gaji Pokok Anda : ");
                                        gP=THR.nextInt();
                                        System.out.print("Masukan Tunjangan Keluarga anda : ");
                                        tK=THR.nextInt();
                                        System.out.print("Masukan Tunjangan Fungsional anda (bagi yang memiliki jika tidak tolong tulis angka 0 ) : ");
                                        tF=THR.nextInt();
                                        System.out.print("Masukan Tunjangan Struktural : ");
                                        tS=THR.nextInt();
                                        calonDosen=(0.8*gP)+tK+tF+tS;
                                        System.out.println("Nama "+nama);
                                        System.out.println("Status : Calon Pegawai ");
                                        System.out.println("Tunjangan "+calonDosen);
                            }
                            else if(code==7){//Tenaga Kependidikan/Tenaga lainnya Tidak Tetap(Kontrak) 
                                            System.out.print("Masukan Honor Kontrak satu bulan Anda : ");
                                            hK=THR.nextInt();
                                            System.out.println("Nama "+nama);
                                            System.out.println("Status : Tenaga Kependidikan/Tenaga lainnya Tidak Tetap(Kontrak) ");
                                            if(hK>=2000000){
                                                System.out.println("Tunjangan anda 2000000 ");
                                            
                                            }
                                            else{ 
                                                System.out.println("Tunjangan "+hK);
                                            }
                                            }
                                else if(code==8){//Pegawai Harian
                                        System.out.println("");
                                
                                    }
                         
    }
    
}

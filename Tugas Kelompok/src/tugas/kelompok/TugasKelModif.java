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
public class TugasKelModif {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner THR=new Scanner(System.in);
        int gP,tK,tF,tS,pM,hK,code,bpk;
        String nama;
        System.out.println("Masukan Nama Anda : ");
        nama=THR.nextLine();
        System.out.println("Masukan Code Anda : ");
        code=THR.nextInt();
        
        
        if(code==01){
                System.out.println("Masukan Gaji Pokok Anda : ");
                gP=THR.nextInt();
        }
        else if(code==01){
                   System.out.print("Masukan Tunjangan Keluarga anda : ");
                   tK=THR.nextInt();
            }
            else if(code==01){
                        System.out.print("Masukan Tunjangan Fungsional anda : ");
                        tF=THR.nextInt();
                }
                else if(code==01){
                        System.out.print("Masukan Tunjangan Struktural : ");
                        tS=THR.nextInt();
                           }
                     else if(code==01){
                            System.out.print("Masukan THR dari pemerintah : ");
                            pM=THR.nextInt();
                         }
                    
      
                                System.out.println("Nama anda "+nama+" Tunjangan anda ");
                        
        
    }
    
}



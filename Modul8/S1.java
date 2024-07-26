/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul8;



/**
 *
 * @author ACER
 */
public class S1 extends Mahasiswa{
   

    public S1(String nama, String nim, String tglLahir, String nilaiHuruf, int uts1, int uts2, int uas, double nilaiFinal, String jenjang, String status) {
        super(nama, nim, tglLahir, nilaiHuruf, uts1, uts2, uas, nilaiFinal,jenjang, status);
        
    }
    S1() {
           }
    public String nilaiHuruf1(double nilaiFinal){
        if (nilaiFinal>=80) {
            return "A";
            
        }
        else if(70<=nilaiFinal&&nilaiFinal<80){
        return "B";
        }
        else if(56<=nilaiFinal&&nilaiFinal<70){
        return "C";
         }
        else if(45<=nilaiFinal&&nilaiFinal<56){
        return "D";
          }
        else if(nilaiFinal<45){
        return "E";
                }
        return "Tidak Ditemukan";
    
    
    }
}

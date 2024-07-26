/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;


/**
 *
 * @author ACER
 */
public class segitigaMain {
    public static void main(String[] args) {
Titik A = new Titik( 1,2);
Titik B = new Titik(7,2);
Titik C = new Titik(7,9);
segitiga seg1=new segitiga( A,B, C);

System.out.println("Luas segitiga dengan titik (1,2) (7,2) dan(7,9) adalah :"+ seg1.hitungLuas());
}
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class MainHewan {
    public static void main(String[] args) {
        int pilihan = 0;
        Hewan kewan;
        Scanner user = new Scanner(System.in);
        while(true){
            System.out.println("1. Anjing ");
            System.out.println("2. Kucing ");
            System.out.println("3. Bebek ");
            System.out.println("4. Harimau ");
            System.out.println("5. Buaya");
            System.out.println("6. Naga ");
            System.out.println("0. Exit");
            System.out.println("___________________________________________________________________________");
        System.out.println("Suara hewan apa yang inggin anda dengar : ");
        pilihan=user.nextInt();
            System.out.println("");
        
        
        
        switch(pilihan){
            case 0 : System.exit(0);
            break;
            case 1 :  System.out.println("Suara Anjing ");
                kewan = new Anjing();
                kewan.suara();
            break;
            case 2 : System.out.println("Suara Kucing ");
                kewan = new Kucing();
                kewan.suara();
          break;
            case 3 : System.out.println("Suara Bebek ");
                kewan = new Bebek();
                kewan.suara();
          break;
          case 4 : System.out.println("Suara Harimau ");
                kewan = new Harimau();
                kewan.suara();
          break;
           case 5 : System.out.println("Suara Buaya ");
                kewan = new Buaya();
                kewan.suara();
          break;
           case 6 : System.out.println("Suara Naga ");
                kewan = new Naga();
                kewan.suara();
          break;
        
        
        
        }
            System.out.println("");
       
        }
        

        
    }
}

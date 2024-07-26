/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

/**
 *
 * @author ACER
 */
public class SegitigaThisSetGet {
    public double x1,y1,x2,y2,x3,y3;

 public double gethitungSisi(double xa, double ya,double xb, double yb){
 return Math.sqrt( Math.pow(this.x1-this.y1, 2) +Math.pow(this.x2-this.y2,2));
 }

 public double gethitungKeliling(){
 return gethitungSisi(x1,y1,x2,y2) +gethitungSisi(x2,y2,x3,y3)+ gethitungSisi(x3,y3,x1,y1);
 }

 public double gethitungLuas(){
 double s = gethitungKeliling();
 return Math.sqrt(s * (s-gethitungSisi(this.x1,this.y1,this.x2,this.y2)) *(s-gethitungSisi(this.x2,this.y2,this.x3,this.y3)) *(s-gethitungSisi(this.x3,this.y3,this.x1,this.y1)));
 }
}

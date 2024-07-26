/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

/**
 *
 * @author ACER
 */
public class Segitiga {
    public double x1,y1,x2,y2,x3,y3;

 public double hitungSisi(double xa, double ya,double xb, double yb){
 return Math.sqrt( Math.pow(xa-xb, 2) +Math.pow(ya-yb,2));
 }

 public double hitungKeliling(double sisi1,double sisi2,double sisi3){
 return sisi1+sisi2+sisi3;
 }

 public double hitungLuas(double sisi1,double sisi2,double sisi3,double keliling){
 double s= keliling;
 return Math.sqrt(s * (s-sisi1) *(s-sisi2) *(s-sisi3));
 }
 
}
 

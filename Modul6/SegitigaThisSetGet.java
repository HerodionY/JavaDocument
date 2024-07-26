/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

/**
 *
 * @author ACER
 */
public class SegitigaThisSetGet {
    private double x1,y1,x2,y2,x3,y3,sisi1,sisi2,sisi3;
    private double hitungSisi;
    private double hitungKeliling;
    private double hitungLuas;
    private double rata2;
    private double SegitigaTertinggi;

    public double getHitungKeliling() {
        return hitungKeliling;
    }

    public double getHitungLuas() {
        return hitungLuas;
    }
    SegitigaThisSetGet() {
        }
    
    
    public SegitigaThisSetGet cariSegitigaTerluas(SegitigaThisSetGet[] daftarSegitiga, int jumlahSegitiga) {
        SegitigaThisSetGet terluas = daftarSegitiga[0];
        for (int i = 1; i < jumlahSegitiga; i++) {
            if (daftarSegitiga[i].getHitungLuas() > terluas.getHitungLuas()) {
                terluas = daftarSegitiga[i];
            }
        }
       
        return terluas;}
    
public SegitigaThisSetGet cariSegitigaTerkecil(SegitigaThisSetGet[] daftarSegitiga, int jumlahSegitiga) {
        SegitigaThisSetGet terkecil = daftarSegitiga[0];
        for (int i = 1; i < jumlahSegitiga; i++) {
            if (daftarSegitiga[i].getHitungLuas() > terkecil.getHitungLuas()) {
                terkecil = daftarSegitiga[i];
            }
        }
       
        return terkecil;}
    public double getRata2(double Total,int jumlahSegitiga) {
        return rata2=Total/jumlahSegitiga;
    }
    
    

    public SegitigaThisSetGet(double x1, double y1, double x2, double y2, double x3, double y3, double sisi1, double sisi2, double sisi3, double hitungKeliling, double hitungLuas ) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.hitungKeliling = hitungKeliling;
        this.hitungLuas = hitungLuas;
        
    }

    public double getSisi3() {
        return sisi3;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi1() {
        return sisi1;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }
    

    public double getHitungLuas1() {
        double s = getHitungKeliling();
        return hitungLuas=Math.sqrt(s * (s-getHitungSisi(this.x1,this.y1,this.x2,this.y2)) *(s-getHitungSisi(this.x2,this.y2,this.x3,this.y3)) *(s-getHitungSisi(this.x3,this.y3,this.x1,this.y1)));

    }

    public double getHitungKeliling1() {
        return hitungKeliling=getHitungSisi(x1,y1,x2,y2) +getHitungSisi(x2,y2,x3,y3)+ getHitungSisi(x3,y3,x1,y1);
    }

    public void setHitungKeliling1(double hitungKeliling) {
        this.hitungKeliling = hitungKeliling;
    }
    

    public double getHitungSisi(double xa, double ya,double xb, double yb) {
        return hitungSisi=Math.sqrt( Math.pow(this.x1-this.y1, 2) +Math.pow(this.x2-this.y2,2));
    }

    public void setHitungSisi(double hitungSisi) {
        this.hitungSisi = hitungSisi;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY3() {
        return y3;
    }

    public double getY2() {
        return y2;
    }

    public double getY1() {
        return y1;
    }

    public double getX3() {
        return x3;
    }

    public double getX2() {
        return x2;
    }

    

   

    public double getX1() {
        return x1;
    }

    

   
  }


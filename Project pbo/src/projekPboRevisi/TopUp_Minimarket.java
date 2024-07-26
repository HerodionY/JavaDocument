/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekPboRevisi;

/**
 *
 * @author ACER
 */
public class TopUp_Minimarket extends TopUp {
    private String namaMinimarket;

    public void setNamaMinimarket(String namaMinimarket) {
        this.namaMinimarket = namaMinimarket;
    }

    public String getNamaMinimarket() {
        return namaMinimarket;
    }

    @Override
    public String namaMitra() {
        return "Mitra Minimarket";  // Mengembalikan nama mitra minimarket sesuai kebutuhan
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Login extends DompetKu {
    public void login(Scanner scanner) {
        System.out.print("Username: ");
        this.setUsername(scanner.nextLine()); 
        System.out.print("Password: ");
        this.setPassword(scanner.nextLine());
    }

    
}

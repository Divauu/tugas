
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class VolumeBola {
    public static void main(String[] args) {
        // Bola V = 4/3 x phi x r3
    Scanner inputBola = new Scanner(System.in);
    
        System.out.println("Masukkan Jari-jari : ");
        double JariJari = inputBola.nextDouble();
        
        double Phiphi = 3.14;
        double volumeBola = 4/3 * Phiphi * JariJari * JariJari;
        System.out.println("Volume Bola Adalah : " +volumeBola);
    
    
    }
   
}

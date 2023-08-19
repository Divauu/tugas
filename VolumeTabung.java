
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class VolumeTabung {
    public static void main(String[] args) {
        // Tabung V = phi x r x r x t
    Scanner inputTabung = new Scanner(System.in);
    
        System.out.println("Masukkan Jari-jari : ");
        double JariJari = inputTabung.nextDouble();
        System.out.println("Masukkan Tinggi : ");
        double Tinggi = inputTabung.nextDouble();
        
        double PhiPhi = 22/7;
        double volumeTabung = PhiPhi * JariJari * JariJari * Tinggi;
        System.out.println("Volume Bola Adalah : "+volumeTabung);
        
      
      
       
    
    }
}

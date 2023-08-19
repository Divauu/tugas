
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class VolumeKerucut {
    public static void main(String[] args) {
        // Kerucut V = 1/3 * phi * r * r * t
    Scanner userInput = new Scanner(System.in);
    
    float phi = 22/7f;
    float r, tinggi, volume;
    
        System.out.println("\t Hitung Volume Kerucut \n\n");
        
        System.out.println("Masukkan Jari-jari : ");
        r = userInput.nextFloat();
        
        System.out.println("Masukkan Tinggi : ");
        tinggi = userInput.nextFloat();
                
        volume = 1 / (float) 3 * phi * r * r * tinggi;
        System.out.println("Volume Kerucut : "+volume);
    
    }
    
}
        
    
    
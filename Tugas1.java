/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Tugas1 {
    public static void main(String[] args) {
        String nama = "Diva Nadya";
        int umur = 15;
        double tb = 161;
        int bb = 50;
        double BMI;
        
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
        System.out.println("Tinggi Badan: "+tb);
        System.out.println("Berat Badan: "+bb);
       
        BMI = (bb/ (tb*tb) );
        
        if (BMI <18.5) {
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Kurus");
        }
        else if (BMI <24.9) {
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Normal");
        }
        else if (BMI <29.9) {
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Gemuk");
        }
        else {
            System.out.println(String.format("BMI: %.2f", BMI));
            System.out.println("Obesitas");
        }
        
        
       
            
         
        }
    }


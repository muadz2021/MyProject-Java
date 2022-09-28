/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectadvancedoperasi;

/**
 *
 * @author DELL
 */
public class ProjectAdvancedOperasi {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Operasi A1 = new Operasi();
        int hasil1 = A1.jumlahkan(3, 4);
        System.out.println("Hasilnya adalah: " + hasil1);
        
        Operasi A2 = new Operasi();
        int hasil2 = A2.jumlahkan(4, 7, -9);
        System.out.println("Hasilnya adalah: " + hasil2);
        
        Operasi A3 = new Operasi();
        double hasil3 = A1.jumlahkan(3.4, -0.002, 0.12313);
        System.out.println("Hasilnya adalah: " + hasil3);
        
        Operasi A4 = new Operasi();
        int hasil4 = A4.kalikan(3, 4);
        System.out.println("Hasilnya adalah: " + hasil4);
        
        Operasi A5 = new Operasi();
        double hasil5 = A5.kalikan(33.4, -0.2, 0.12313);
        System.out.println("Hasilnya adalah: " + hasil5);
    }
    
}

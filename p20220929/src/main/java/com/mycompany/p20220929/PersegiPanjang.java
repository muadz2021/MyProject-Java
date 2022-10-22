/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p20220929;

/**
 *
 * @author DELL
 */
public class PersegiPanjang {
    
    double p;
    double l;
    
    PersegiPanjang(double a, double b){
        this.p = a;
        this.l = b;
    }
    
    void hitungLuas(){
        double Luas = p * l;
        System.out.println("Luasnya adalah: " + Luas);
    }
    
    void hitungKeliling(){
        double Keliling = 2 * (p + l);
        System.out.println("Kelilingnya adalah: " + Keliling);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p20220830;

/**
 *
 * @author DELL
 */
public class Persegi {
    
int sisi;
    
    void hitungKeliling () {
        int keliling = this.sisi * 4;
        System.out.println("Kelilingnya adalah : " + keliling);
    }
}

public static void (int[] args) {
    Persegi p1 = new Persegi();
    p1.sisi = 5;
    p1.hitungKeliling();
}

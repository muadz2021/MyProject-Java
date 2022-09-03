/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbangundatar;

/**
 *
 * @author DELL
 */
public class Lingkaran {
    // atribut
    
    int jejari;
    
    // methods
    
    void hitungLuas(){
        double luas = this.jejari * this.jejari * 22 / 7;
        System.out.println("Luas: " + luas + " satuan luas");
    }
    
    void hitungKeliling(){
        double keliling = 2 * this.jejari * 22 / 7 ;
        System.out.println("Keliling: " + keliling + " satuan panjang");
    }
}

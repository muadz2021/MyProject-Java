/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p20221006;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("Luas: " + luas + " satuan luas");
    }
    
    void hitungKeliling(){
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.println("Keliling: " + keliling + " satuan panjang");
    }
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang: ");
        this.panjang = input.nextInt();
        System.out.println("Masukkan lebar: ");
        this.lebar = input.nextInt();
        
        this.hitungLuas();
        this.hitungKeliling();
    }
    
}

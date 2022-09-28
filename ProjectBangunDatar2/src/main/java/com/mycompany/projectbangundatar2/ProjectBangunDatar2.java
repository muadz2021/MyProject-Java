/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectbangundatar2;

/**
 *
 * @author DELL
 */
public class ProjectBangunDatar2 {
    public static void main(String[] args){
        PersegiPanjang A1 = new PersegiPanjang();
        int LuasA1 = A1.hitungLuas(10, 5);
        int KelilingA1 = A1.hitungKeliling(10, 5);
        System.out.println("Luasnya adalah " + LuasA1 + ", Kelilingnya adalah " + KelilingA1);
        
        PersegiPanjang A2 = new PersegiPanjang();
        double LuasA2 = A2.hitungLuas(3.6, 8);
        double KelilingA2 = A2.hitungKeliling(3.6, 8);
        System.out.println("Luasnya adalah " + LuasA2 + ", Kelilingnya adalah " + KelilingA2);
        
        PersegiPanjang A3 = new PersegiPanjang();
        double LuasA3 = A3.hitungLuas(6, 8.3);
        double KelilingA3 = A3.hitungKeliling(6, 8.3);
        System.out.println("Luasnya adalah " + LuasA3 + ", Kelilingnya adalah " + KelilingA3);
        
        PersegiPanjang A4 = new PersegiPanjang();
        double LuasA4 = A4.hitungLuas(5.6, 8.8);
        double KelilingA4 = A4.hitungKeliling(5.6, 8.8);
        System.out.println("Luasnya adalah " + LuasA4 + ", Kelilingnya adalah " + KelilingA4);
        
        Persegi B1 = new Persegi();
        double LuasB1 = B1.hitungLuas(4.5);
        double KelilingB1 = B1.hitungKeliling(4.5);
        System.out.println("Luasnya adalah " + LuasB1 + ", Kelilingnya adalah " + KelilingB1);
        
        Persegi B2 = new Persegi();
        int LuasB2 = B2.hitungLuas(7);
        int KelilingB2 = B2.hitungKeliling(7);
        System.out.println("Luasnya adalah " + LuasB2 + ", Kelilingnya adalah " + KelilingB2);
        
        Lingkaran C1 = new Lingkaran();
        double LuasC1 = C1.hitungLuas(5);
        double KelilingC1 = C1.hitungKeliling(5);
        System.out.println("Luasnya adalah " + LuasC1 + ", Kelilingnya adalah " + KelilingC1);
        
        Lingkaran C2 = new Lingkaran();
        double LuasC2 = C2.hitungLuas(7.4);
        double KelilingC2 = C2.hitungKeliling(7.4);
        System.out.println("Luasnya adalah " + LuasC2 + ", Kelilingnya adalah " + KelilingC2);
        
        Segitiga D1 = new Segitiga();
        double LuasD1 = D1.hitungLuas(8, 10);
        System.out.println("Luasnya adalah " + LuasD1);
        
        Segitiga D2 = new Segitiga();
        double LuasD2 = D2.hitungLuas(8, 11.5);
        System.out.println("Luasnya adalah " + LuasD2);
        
        Segitiga D3 = new Segitiga();
        double LuasD3 = D3.hitungLuas(12.2, 9);
        System.out.println("Luasnya adalah " + LuasD3);
        
        Segitiga D4 = new Segitiga();
        double LuasD4 = D4.hitungLuas(13.9, 20.7);
        System.out.println("Luasnya adalah " + LuasD4);
    }
}

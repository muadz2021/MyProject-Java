/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p20220929;

/**
 *
 * @author DELL
 */
public class Karyawan {
    String nama;
    String id;
    String alamat;
    int gaji;
    
    Karyawan(String a, String b, String c, int d){
        this.nama = a;
        this.id = b;
        this.alamat = c;
        this.gaji = d;
    }
    
    void tampilData(){
        System.out.println("ID Karyawan: " + this.id);
        System.out.println("Nama Karyawan: " + this.nama);
        System.out.println("Alamat Karyawan: " + this.alamat);
        System.out.println("Gaji Karyawan: " + this.gaji);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p20220929;

/**
 *
 * @author DELL
 */
public class MyClass {
    int x;
    int y;
            
    MyClass(int a, int b){
        this.x = a;
        this.y = b;
    }
    
    MyClass(){
        this.x = 0;
        this.y = 0;
    }
    
    MyClass(int a){
        this.x = a;
        this.y = 0;
    }
    
    void output(){
        int hasil = this.x + this.y;
        System.out.println("Hasil penjumlahan adalah: " + hasil);
    }
}

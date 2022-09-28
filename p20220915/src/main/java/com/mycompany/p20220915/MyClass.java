/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p20220915;

/**
 *
 * @author DELL
 */
public class MyClass {
    // void method
    void myMethod1(int x, int y){
        int hasil = x + y;
        System.out.println("Hasilnya: " + hasil);
    }
    
    //nonvoid mehod
    int myMethod2(int x, int y){
        int hasil = x + y;
        return hasil;
    }
    
    void myMehtod3(){
        this.myMethod1(5, 6);
    }
    
    static void myMethod4(){
        
    }
}

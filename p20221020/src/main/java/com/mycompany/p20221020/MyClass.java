/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p20221020;
import java.util.*;

/**
 *
 * @author DELL
 */
public class MyClass {
    
    int n;
    
    void sampleArray(){
        int[] bil = new int[5];
        
        bil[0] = 5;
        bil[1] = 7;
        bil[2] = 4;
        bil[3] = 9;
        bil[4] = 1;
        
        System.out.println(bil);
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        return sum/this.n;
    }
    
    void inputData(){
        int[] bil = new int[100];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah data ke-" + n);
        this.n = input.nextInt();
        
        for(int i=0; i<this.n; i++){
            System.out.println("Masukkan data:" );
            bil[i] = input.nextInt();
        }
    }
}

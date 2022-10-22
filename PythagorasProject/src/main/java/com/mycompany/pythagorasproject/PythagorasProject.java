/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pythagorasproject;
import java.util.*;
import java.lang.*;
import static java.lang.Math.sqrt;

/**
 *
 * @author DELL
 */
public class PythagorasProject {

    public static void main(String[] args) {
        System.out.println("Selamat datang di program pythagoras: ");
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih nomor menu: ");
        int menu = input.nextInt();
        
        switch(menu){
            case 1:
                System.out.print("Masukkan nilai a: ");
                int a1 = input.nextInt();
                System.out.print("Masukkan nilai b: ");
                int b1 = input.nextInt();
                System.out.print("Masukkan nilai c: ");
                int c1 = input.nextInt();
                
                if(a1*a1 + b1*b1 == c1*c1){
                    System.out.println("Triple pythagoras");
                } else {
                    System.out.println("Bukan triple pythagoras");
                }
                break;
            case 2:
                System.out.print("Masukkan nilai a: ");
                int a2 = input.nextInt();
                System.out.print("Masukkan nilai b: ");
                int b2 = input.nextInt();
                
                double c2 = sqrt(a2*a2 + b2*b2);
                System.out.println("Nilai c adalah: " + c2);
                break;
            case 3:
                System.out.print("Masukkan nilai a: ");
                int a3 = input.nextInt();
                System.out.print("Masukkan nilai c: ");
                int c3 = input.nextInt();
                
                double b3 = sqrt(c3*c3 - a3*a3);
                System.out.println("Nilai b adalah: " + b3);
                break;
            default:
                System.out.println("Keluar dari program");
                System.exit(0);
        }
    }
}

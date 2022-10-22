/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gametebakangkaproject;
import java.util.*;

/**
 *
 * @author DELL
 */
public class GameTebakAngkaProject {

    public static void main(String[] args) {
        System.out.println("“Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!”");
        Random rand = new Random();
        int randint = rand.nextInt(101);
        int i = 0;
        
        while (i>=0){
            Scanner input = new Scanner(System.in);
            System.out.print("Tebak angka: ");
            int j = input.nextInt();
            
            if(j<randint){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else if(j>randint){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                break;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.p20221006;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class P20221006 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bil 1: ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bil 2: ");
        int bil2 = input.nextInt();
        
        int hasil = bil1 + bil2;
        System.out.println("Hasil penjumlahannya: " + hasil);
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.input();
    }
}

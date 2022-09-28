/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectluasbangunkompleks;

/**
 *
 * @author DELL
 */
public class ProjectLuasBangunKompleks {

    public static void main(String[] args) {
        Persegi A1 = new Persegi();
        A1.s = 42;
        
        Lingkaran A2 = new Lingkaran();
        A2.r = 21;
        
        int luasBangunA = A1.hitungLuas() + 2 * A2.hitungLuas();
        
        Lingkaran B1 = new Lingkaran();
        B1.r = 14;
        
        Lingkaran B2 = new Lingkaran();
        B2.r = 7;
        
        int luasBangunB = B1.hitungLuas() / 2 - B2.hitungLuas();
        
        System.out.println("Luas Bangun A adalah: " + luasBangunA);
        System.out.println("Luas Bangun B adalah: " + luasBangunB);
    }
}

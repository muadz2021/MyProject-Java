/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.p20220929;

/**
 *
 * @author DELL
 */
public class P20220929 {

    public static void main(String[] args) {
        MyClass m = new MyClass(10, 30);
        m.output();
        
        MyClass n = new MyClass();
        n.x = 10;
        n.y = 45;
        n.output();
        
        MyClass o = new MyClass(50);
        o.y = 20;
        o.output();
        
        PersegiPanjang a = new PersegiPanjang(10, 15);
        a.hitungLuas();
        a.hitungKeliling();
        
        PersegiPanjang b = new PersegiPanjang(7, 13);
        b.hitungLuas();
        b.hitungKeliling();
        
        Integer aa = 30;
        System.out.println(aa.toString());
    }
}

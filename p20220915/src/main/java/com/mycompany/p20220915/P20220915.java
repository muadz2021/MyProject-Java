/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.p20220915;

/**
 *
 * @author DELL
 */
public class P20220915 {

    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.myMethod1(4, 5);
        int hasil = m.myMethod2(m.myMethod2(5, 2), m.myMethod2(6, 6));
        System.out.println("Hasilnya: " + hasil);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectbangundatar;

/**
 *
 * @author DELL
 */
public class ProjectBangunDatar {

    public static void main(String[] args) {
        
        // membuat obyek persegi panjang A
        PersegiPanjang A = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari A
        A.panjang = 10;
        A.lebar = 7;
        
        // menghitung luas dan keliling dari A
        A.hitungLuas();
        A.hitungKeliling();
        
        // membuat obyek persegi panjang B
        PersegiPanjang B = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari B
        B.panjang = 14;
        B.lebar = 9;
        
        // menghitung luas dan keliling dari B
        B.hitungLuas();
        B.hitungKeliling();
        
        // membuat obyek persegi panjang C
        PersegiPanjang C = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari C
        C.panjang = 17;
        C.lebar = 8;
        
        // menghitung luas dan keliling dari C
        C.hitungLuas();
        C.hitungKeliling();
        
        // membuat obyek persegi panjang D
        PersegiPanjang D = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari D
        D.panjang = 26;
        D.lebar = 14;
        
        // menghitung luas dan keliling dari D
        D.hitungLuas();
        D.hitungKeliling();
        
        // membuat obyek lingkaran L1
        Lingkaran L1 = new Lingkaran();
        
        // memberi nilai atribut jejari dari L1
        L1.jejari = 6;
                
        //menghitung luas dan keliling dari L1
        L1.hitungLuas();
        L1.hitungKeliling();
        
        // membuat obyek lingkaran L2
        Lingkaran L2 = new Lingkaran();
        
        // memberi nilai atribut jejari dari L2
        L2.jejari = 11;
                
        //menghitung luas dan keliling dari L2
        L2.hitungLuas();
        L2.hitungKeliling();
    }
    
}


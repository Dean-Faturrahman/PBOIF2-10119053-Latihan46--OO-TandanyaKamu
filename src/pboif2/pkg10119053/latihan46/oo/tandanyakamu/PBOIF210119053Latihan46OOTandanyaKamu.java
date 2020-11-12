/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan46.oo.tandanyakamu;

import java.util.Scanner;
import data.Age;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program tandanya kamu
 */
public class PBOIF210119053Latihan46OOTandanyaKamu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun lahir anda : ");
        int lahir = input.nextInt();
        
        System.out.println("\n======Hasil Perhitungan Umur======"); 
        System.out.println("Tahun lahir anda : " + lahir);
        Age age = new Age(2018);        
        age.setYearBirth(lahir);
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.print("Tandanya Kamu ");
        age.tandanyaKamu(age.hitungUmur());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;


import java.util.Scanner;

/**
 *
 * @author nova
 */
public class DataKaryawan {
    
    public static void main(String[] args) {
        //deklarasi variabel
    String nama, alamat;
    int usia, gaji;
    
    // membuat scanner baru
    Scanner keyboard = new Scanner(System.in);
    
    //Tampilkan output ke user
    System.out.println("### Pendataan Karyawan PT studywithnova");
    System.out.print("Nama karyawan: ");
    //menggunakan scanner dan menyimpan apa yang diketik di variabel nama
    nama = keyboard.nextLine();
    
    System.out.print("Alamat: ");
    alamat = keyboard.nextLine();
    
    System.out.print("Usia: ");
    usia = keyboard.nextInt();
    
    System.out.print("Gaji: ");
    gaji = keyboard.nextInt();
    
    System.out.println("---------------------");
    System.out.println("Nama Karyawan: " + nama);
    System.out.println("Alamat: " + alamat);
    System.out.println("Usia: " + usia);
    System.out.println("Gaji: " + gaji);
    
    }
    
}

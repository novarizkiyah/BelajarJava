/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author nova
 */
public class ContohBufferReader {
    public static void main(String[] args) throws IOException {
    String nama;
    int usia;
    
    //membuat objek inputstream 
    InputStreamReader isr = new InputStreamReader(System.in);
    //membuat objek bufferreader
    BufferedReader br = new BufferedReader(isr);
    
    //mengisi variabel nama dengan BufferedReader
    System.out.print("Input nama: ");
    nama = br.readLine();
    
    System.out.print("Input usia: ");
    usia = Integer.parseInt(br.readLine());
    
    
    //tampilkan isi variabel nama
    System.out.println("Nama kamu adalah " + nama);
    System.out.println("Usia kamu adalah " + usia);
    
    }
}

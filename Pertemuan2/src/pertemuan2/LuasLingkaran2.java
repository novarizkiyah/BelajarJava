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
public class LuasLingkaran2 {
    public static void main(String[] args) throws IOException {
    int r;
    double pi, luas;
    
    pi = 3.14;
    
    //membuat objek inputstream 
    InputStreamReader isr = new InputStreamReader(System.in);
    //membuat objek bufferreader
    BufferedReader br = new BufferedReader(isr);
    System.out.print("Input r: ");
    r = Integer.parseInt(br.readLine());
    
    luas = pi*r*r;
    System.out.println("luas = " + luas);
    }
    
    
}

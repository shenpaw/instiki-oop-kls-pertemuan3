/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg303;

import java.util.Scanner;
//import javax.swing.JOptionPane;
/**
 *
 * @author shendy
 * TGL 22 MARET 2025
 */
public class Pertemuan303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pilih = "";
        
        System.out.println("Menu pilihan");
        System.out.println("~~~~~~~~~~~~");
        System.out.println("Pilihan menu tidak ada");
        System.out.println("Menu A");
        System.out.println("Menu B");
        System.out.println("Menu C");
        System.out.print("silahkan pilih menu: ");
                
//        pilih = JOptionPane.showInputDialog ("pilih menu");
          Scanner inp = new Scanner(System.in);
          pilih = inp.nextLine();
        
        switch(pilih){
            case"A":
                System.out.println("Memilih Menu A");
                break;
            case"B":
                System.out.println("Memilih Menu B");
                break;
            case"C":
                System.out.println("Memilih Menu C");
                break;
            default:
                System.out.println("Pilihan menu tidak ada");
    }
    }
    
}


























































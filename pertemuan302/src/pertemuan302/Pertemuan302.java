/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nilai=0;
       String nama = "";
       String nim = "";
       String ket = "";
       
       Scanner dtIN = new Scanner(System.in);
       
       System.out.print("Input Nama Mahsiswa: ");
       nama = dtIN.nextLine();
       System.out.print("Input NIM: ");
       nim = dtIN.nextLine();
       System.out.print("Input Nilai Ujian: ");
       nilai = Integer.parseInt(dtIN.nextLine());
       
//       keterangan lulus jika nilai 60 ke atas
       if(nilai>=60){
           ket = "lulus";
       }else{
           ket = "tidak lulus";
       }
       
//       keterangan tidak lulus jika nilai dibawah 60
//...

        System.out.printf("Nilai Mahasiswa dengan nama %s (%s) adalah %d dimyatakan %s ",nama,nim,nilai,ket);
               
    }
    
}

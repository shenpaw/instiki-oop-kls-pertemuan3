/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan301;

/**
 *
 * @author shendy
 * TGL 22 MARET 
 */
import javax.swing.JOptionPane;
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int naw = 0;
       naw = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai Awal"));
       
       int awal = naw;
       int akhir = 10;
    
       System.out.println("Perulangan while");
       while(awal<akhir){
           System.out.println("Perulangan ke-"+awal);
           awal++;
       }
       
       System.out.println("Perulangan Do..while");
       awal = naw;
       do{
            System.out.println("Perulangan ke-"+awal);
            awal++;
       }while(awal<akhir);
       
       System.out.println("Perulangan dengan for");
       for(awal=naw; awal<akhir; awal++){
        System.out.println("Perulangan ke-"+awal);
    }
       
       // Menambahkan bagian akhir
       System.out.println("Semua perulangan telah selesai.");
       JOptionPane.showMessageDialog(null, "Perulangan selesai dilakukan! Nilai awal: " + naw + ", Nilai akhir: " + akhir);
    }
}

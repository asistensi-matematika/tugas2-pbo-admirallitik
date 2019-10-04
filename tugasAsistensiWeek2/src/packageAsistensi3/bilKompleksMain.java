/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAsistensi3;
import java.util.Scanner;
/**
 *
 * @author Admiral Litik
 */
public class bilKompleksMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input : ");
            String kompleks1 = input.next();
            System.out.print("Input : ");
            String kompleks2 = input.next();

            bilKompleks BilKom = new bilKompleks();
            BilKom.setKomp1(kompleks1);
            BilKom.setKomp2(kompleks2);
            BilKom.perkalianBilanganKompleks();
        } catch (Exception e) {
            System.out.println("MASUKKAN DATA DENGAN BENAR");
            System.out.println("Note: ");
            System.out.println("Jangan menambah spasi dalam input bilangan.");
            System.out.println("Tulis i dengan 1i.");
            System.out.println("Tulis dalam bentuk a+bi.");
        }
    }
}

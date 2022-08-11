package day1_day8.recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
            
            double vize1, vize2, vizeOrt, finalNotu, finalOrt, gecmeNotu;
            
            System.out.print("1. vize notunuz : ");
            vize1 = scan.nextDouble();
            
            System.out.print("2. vize notunuz : ");
            vize2 = scan.nextDouble();
            
            vizeOrt = ((vize1+vize2)/2)*0.3;
            
            System.out.print("Final Notunuz : ");
            finalNotu = scan.nextDouble();
            
            finalOrt = finalNotu*0.7;
            
            double sonuc = vizeOrt+finalOrt;
            System.out.println(" = " + sonuc);
        
        }
}

package day1_day8.day3_practice;

import java.util.Scanner;

public class Q01_StringManipulaton {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("4 kelime giriniz");
        String str1= scan.next();
        String str2= scan.next();
        String str3= scan.next();
        String str4= scan.next();

        String cumle =str1.substring(0,1).toUpperCase()+str1.substring(1).toLowerCase()
                .concat(" ").concat(str2).concat(" ").concat(str3).concat(" ").concat(str4).concat(".");


        System.out.println(cumle);
    }
}

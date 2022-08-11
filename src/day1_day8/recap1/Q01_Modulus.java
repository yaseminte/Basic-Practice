package day1_day8.recap1;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki
     * rakamlari toplamini bulunuz
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("5 basamakli bir sayi giriniz :");
        int sayi = scan.nextInt();

        // int sonIkıBasamak = sayi%100;

        // int ilkIkiBasamak = sayi/1000;

        // System.out.print("Sayinin ilk iki ve son iki basamaginin toplami : " +
        //                  ( ilkIkiBasamak+sonIkıBasamak));


        int ilkIki = sayi / 1000;
        int sonIki = sayi % 100;

        int ilkIkiToplam = (ilkIki / 10) + (ilkIki % 10);
        int sonIkiToplam = (sonIki / 10) + (sonIki % 10);

        System.out.println("Toplam : " + (ilkIkiToplam + sonIkiToplam));


    }
}

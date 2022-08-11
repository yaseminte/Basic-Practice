package day1_day8.recap2;

import java.util.Scanner;

public class Q06_StringManipulation {

    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("ilk kelimeyi giriniz :");
        String ilkKelime = scan.nextLine();

        System.out.print("ikinci kelimeyi giriniz : ");
        String ikinciKelime = scan.next();

        System.out.println("1.yontem : " + ilkKelime + " " + ikinciKelime);
        System.out.println("2.yontem : " + ilkKelime.concat(" " + ikinciKelime));

        String ilkKelimeIlkHarfsiz = ilkKelime.substring(1);
        String ikinciKelimeIlksiz = ikinciKelime.substring(1);

        System.out.println("Manipulation'dan sonraki hali : " + ilkKelimeIlkHarfsiz + "" + ikinciKelimeIlksiz);
        // sout icindeki hiclik olmasa da olur kod okunurlugu acisindan koyuldu
       /*
       String yeniKelime = ilkKelime.substring(1)+ikinciKelime.substring(1);

        System.out.println("yeniKelime = " + yeniKelime);

        */

    }
}

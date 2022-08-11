package day1_day8.day01ANDday2_practice;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.print("Iki tamsayi degeri giriniz : ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        int toplam = sayi1+ sayi2;

        System.out.println("toplam = " + toplam);


    }
}

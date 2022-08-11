package day1_day8.day6_practice;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        int toplam = basamakToplama(sayi);
        System.out.println("girilen sayinin basamaklari toplami : " + basamakToplama(toplam));
    }

    private static int basamakToplama(int sayi) {
        int toplam = 0;
        while(sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        return toplam;
    }
}

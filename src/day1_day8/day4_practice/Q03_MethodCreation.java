package day1_day8.day4_practice;

import java.util.Scanner;

public class Q03_MethodCreation {
    /*
Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
  0-1-1-2-3-5-8-13-21-34....
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("47'den kucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();

        fibonacci(sayi);

    }

    private static void fibonacci(int sayi) {

        if (sayi<47){
            int sayi1 = 0;
            int sayi2 = 1;
            int sayi3;
            System.out.print(sayi1 + " ");
            System.out.print(sayi2 + " ");
            for (int i = 2; i < sayi; i++) {
                sayi3=sayi1+sayi2;
                System.out.print(sayi3 + " ");
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
        }else System.out.println("47'den kucuk bir sayi giriniz..");


    }
}

        /*
        int ilkSayi = 0;
        int sonrakiSayi = 1;
        int gelecekSayi;


        for (int i = 0; i <= n; i++) {
            System.out.print(ilkSayi + " ");
            gelecekSayi = ilkSayi+sonrakiSayi;
            ilkSayi=sonrakiSayi;
            sonrakiSayi=gelecekSayi;
        }

         */

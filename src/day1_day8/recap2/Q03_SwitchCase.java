package day1_day8.recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamakli bir sayi giriniz :");
        int sayi = scan.nextInt();

        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yuzlerBasamagi = (sayi / 100);

        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBasamagi) {
                case 0:
                    break;
                case 1:
                    System.out.print("yuz\t");
                    break;
                case 2:
                    System.out.print("ikiyuz\t");
                    break;
                case 3:
                    System.out.print("ucyuz\t");
                    break;
                case 4:
                    System.out.print("dortyuz\t");
                    break;
                case 5:
                    System.out.print("besyuz\t");
                    break;
                case 6:
                    System.out.print("altiyuz\t");
                    break;
                case 7:
                    System.out.print("yediyuz\t");
                    break;
                case 8:
                    System.out.print("sekizyuz\t");
                    break;
                case 9:
                    System.out.print("dokuzyuz\t");
                    break;
            }

            switch (onlarBasamagi) {
                case 0:
                    break;
                case 1:
                    System.out.print("on\t");
                    break;
                case 2:
                    System.out.print("yirmi\t");
                    break;
                case 3:
                    System.out.print("otuz\t");
                    break;
                case 4:
                    System.out.print("kirk\t");
                    break;
                case 5:
                    System.out.print("elli\t");
                    break;
                case 6:
                    System.out.print("altmis\t");
                    break;
                case 7:
                    System.out.print("yetmis\t");
                    break;
                case 8:
                    System.out.print("seksen\t");
                    break;
                case 9:
                    System.out.print("doksan\t");
                    break;

            }

            switch (birlerBasamagi) {
                case 0:
                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("uc");
                    break;
                case 4:
                    System.out.print("dort");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;
            }
        }else
            System.out.println("3 basamakli sayi giriniz..");
    }
}

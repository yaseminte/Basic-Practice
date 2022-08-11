package day1_day8.day01ANDday2_practice;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen ekrana Y veya N harfini giriniz : ");
        char harf = scan.next().toUpperCase().charAt(0);

        if (harf == 'Y') {
            System.out.println("YES");
        }else if (harf == 'N') {
            System.out.println("NO");
        }else
            System.out.println("Hatali bir harf girdiniz!\nLutfen sadece Y veya N harfini giriniz");
    }
}
package day1_day8.day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

    public static void main(String[] args) {

        farkiBul();

    }

    public static void farkiBul() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array'in uzunlugu giriniz : ");
        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array'in " + (i+1) + ". elemanini giriniz : "); // i--> oldugunda 0.eleman diyecek,
                                                                              // biz index degil direkt eleman sorduk
            arr[i]=scan.nextInt(); // fori den gelen indexler, bu satirda kullanici tarafindan dongu bitene kadar
                                   // girilen elemanlar okunur
        }
        Arrays.sort(arr);
        System.out.println("Arraydeki en buyuk eleman ile en buyuk elemanin arasindaki fark : " + (arr[uzunluk-1]-arr[0]));

        // ödev : bu soruyu MAth class'i kullanarak cozunuz..
    }
}

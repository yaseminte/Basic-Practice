package day1_day8.day5_practice;

import java.util.Scanner;

public class Q01_ElifHocaninCozumu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz :");
        String harf = scan.next().toLowerCase();

        String sesliHarfler = "aeiou";
        String sessizHarfler = "bcdfghjklmnprstxwvz";

        if (harf.length()==1){
            for (int i = 0; i < sesliHarfler.length(); i++) {
                if (sesliHarfler.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                }else if (sessizHarfler.contains(harf)){
                    System.out.println("sessiz harf");
                    break;
                }else {
                    System.out.println("Yanlis karakter girdiniz");
                    break;
                }
            }
        } else System.out.println("tek karakter giriniz");
    }
}

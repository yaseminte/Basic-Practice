package day1_day8.day3_practice;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str = scan.nextLine();

        int bosluk = str.indexOf(' ');

        if (bosluk == -1 && !(str.isEmpty())){
            System.out.println("bosluk yoktur");
        }else {
            System.out.println("bosluk vardir");
        }



      /*  if (str.contains(" ")){
            System.out.println("Girilen cumlede space karakter vardir" + "\n" + str);
        }else
            System.out.println("Girilen cumlede space yok " + "\n" + str);

        if (str.isEmpty()){
            System.out.println("Girilen cumle bos");
        }else
            System.out.println("Girilen cumle : " + "\n" + str);

       */
    }
}

package day1_day8.recap2;

import java.util.Scanner;

public class Q08_StringManipulation {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harften olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz : ");
        String str = scan.next();
        String yeniKelime="";

        if (str.length()>=3){
            System.out.println(str.substring(str.length()-2) + str.substring(str.length()-2)
                    + str.substring(str.length()-2));

        }else System.out.println(str);


        /*
            if (kelime.length()>=3){
            yeniKelime= kelime.substring(kelime.length()-2);
            System.out.println(yeniKelime.concat(yeniKelime).concat(yeniKelime));
            }
            else {
            System.out.println(kelime);
            }
         */


           /* System.out.print(kelime.substring(kelime.length() - 2));
            System.out.print(kelime.substring(kelime.length() - 2));
            System.out.print(kelime.substring(kelime.length() - 2));

            */
    }

}

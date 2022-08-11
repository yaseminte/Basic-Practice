package day1_day8.day5_practice;

import java.util.Scanner;

public class Q01_ForLoop {

     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */
     public static void main(String[] args) {


         String sesliHarfler = "aeiouAEIOU";

         Scanner scan = new Scanner(System.in);
         System.out.print("Bir harf giriniz : ");
         String harf = scan.next();
         boolean sesliHarf = false;
         boolean yanlisKarakter = false;
         boolean sessizHarf = false;


         for (int i = 0; i < sesliHarfler.length(); i++) {
             if (sesliHarfler.contains(harf)){
                sesliHarf = true;
             } else if (harf.length()>=2 || harf.charAt(0)<'A' || harf.charAt(0)>'z'){
                 yanlisKarakter = true;
             } else{
                 sessizHarf = true;
             }

         }
         if (sesliHarf==true){
             System.out.println(harf + " harfi sesli harftir");
         }else if (yanlisKarakter==true){
             System.out.println("Yanlis karakter girdiniz");
         }else if (sessizHarf==true){
             System.out.println(harf + " harfi sessiz harftir");
         }

     }
}


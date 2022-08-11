package day1_day8.day3_practice;

import java.util.Scanner;

public class Q08_MethodCreation {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

        basitHesapMakinesi();

    }

    public static void basitHesapMakinesi() {

        Scanner scan = new Scanner(System.in);
        System.out.println("islem yapmak istediginiz ilk sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("Lutfen yapacaginiz islemin sembolunu seciniz\n(+)\n(-)\n(x)\n(/)");
        char select = scan.next().charAt(0);

        if (select == '+' || select == '-' || select == 'x' || select == '/') {

            switch (select) {

                case '+':
                    System.out.println("Sayilarin toplami : " + (sayi1 + sayi2));
                    break;
                case '-':
                    if (sayi1 >= sayi2) {
                        System.out.println("Cikarma isleminin sonucu : " + (sayi1 - sayi2));
                    } else
                        System.out.println("Cikarma isleminin sonucu : " + (sayi2 - sayi1));
                    break;
                case 'x':
                    System.out.println("Sayilarin carpimlari sonucu : " + (sayi1 * sayi2));
                    break;
                case '/':
                    if (sayi1 >= sayi2) {
                        System.out.println("Bolme isleminin sonucu : " + (sayi1 / sayi2));
                    } else
                        System.out.println("Bolme isleminin sonucu : " + (sayi2 / sayi1));
                    break;

            }

            }else{
            System.out.println("Hatali secim yaptiniz");
        }
    }
}

package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogretmenList = new ArrayList<Kisi>();
    static List<Kisi> ogrenciList = new ArrayList<Kisi>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;


    public static void girisPaneli() {
        System.out.println(" ====================================\n" +
                "     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "    ====================================\n" +
                "     1- ÖĞRENCİ İŞLEMLERİ\n" +
                "     2- ÖĞRETMEN İŞLEMLERİ\n" +
                "     Q- ÇIKIŞ");

        String secim = scan.nextLine().toUpperCase(); // kullanici kucuk harf girse bile buyuk harfe cevirdik
        // cunku kontrolu buyuk harf ile yapacagiz

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";

                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();

                break;
            case "Q":


                break;
            default:
                System.out.println("Hatali Giris");
                girisPaneli();
                break;
        }


    }

    private static void islemMenusu() {
        System.out.println("Sectigin kisi turu " + kisiTuru);
        System.out.println("  ============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         Q-ÇIKIŞ");

        System.out.println("islem tercihinizi giriniz : ");
        char secilenIslem = scan.next().charAt(0);

        switch (secilenIslem) {
            case '1':
                ekle();
                islemMenusu();
                break;

            case '2':
                arama();
                islemMenusu();
                break;
            case '3':

                islemMenusu();
                break;
            case '4':

                islemMenusu();
                break;
            case '5':

                girisPaneli();
                break;

            case 'Q':

                break;
            default:
                System.out.println("hatali secim yaptiniz");
        }


    }

    private static void arama() {
        System.out.println("**** " + kisiTuru + "arama sayfasına hoşgeldiniz");
        boolean flag = true; // bayrak yukarıda true olan her şart devam eder

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){ // bu satırda öğrenci arıyorsa çalışır
            //dummy atılabilir
            System.out.println("kimlik no giriniz");
            String arananKimlikNo= scan.next().replaceAll(" ",""); // kullanıcı boşluk girerse diye boşluk hiçlik yapıldı

            for (Kisi each:ogrenciList) {
                if (each.getKimlikNo().equals(arananKimlikNo)){ // kullanıcının girdiği TC ile öğrenci listesindeki TC'lerden eşleşen var mı?
                    System.out.println("Aradığınız öğrenci : " + each.getAdSoyad());
                    flag =false;
                }
            } if (flag){//flag true ise hala bu if body'si çalışır. yani aranan tc ile öğrenci yok demektir
                System.out.println("aradığınız öğreni mevcut değil");
            }


        }else {
            System.out.println("**** " + kisiTuru + "arama sayfasına hoşgeldiniz");
            System.out.println("kimlik no giriniz");
            String arananKimlikNo= scan.next().replaceAll(" ",""); // kullanıcı boşluk girerse diye boşluk hiçlik yapıldı

            for (Kisi each:ogretmenList) {
                if (each.getKimlikNo().equals(arananKimlikNo)){ // kullanıcının girdiği TC ile öğretmen listesindeki TC'lerden eşleşen var mı?
                    System.out.println("Aradığınız öğrenci : " + each.getAdSoyad());
                    flag =false;
                }
            } if (flag){//flag true ise hala bu if body'si çalışır. yani aranan tc ile öğretmen yok demektir
                System.out.println("aradığınız öğreni mevcut değil");
            }

        }
    }

    private static void ekle() { // bu method hem ogrenci hem ogretmen islemleri icin tasarlandi

        System.out.println("**** " + kisiTuru + " ekleme sayfasina hosgeldin");
        System.out.println("isim soyisim giriniz");
        String adSoyad = scan.nextLine();

        System.out.println("kimlik no giriniz");
        String kimlikNo = scan.next();

        System.out.println("yas giriniz");
        String yas = scan.next();

        if (kisiTuru.equals("OGRENCI")){ //TODO sonra doldur

        }else {
            System.out.println("Bolum giriniz");
            String bolum = scan.nextLine();

            System.out.println("sicil no giriniz");
            String sicilNo = scan.next();

            Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);

            ogretmenList.add(ogretmen);


        }



    }


}

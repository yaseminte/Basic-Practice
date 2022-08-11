package day10_practice.constructor;

import java.util.Scanner;

public class ConstructorIsimDegistirme {

// class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin

     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni
     *  bilgileri
     * yazdirsin

     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin

     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
     *  "soyisim"
      variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
      istesin ve
      eski soyismi degistirsin.

     * Not :Instance variable'lar object'lere aittir ve diger adi object
     * variable'dir
     */

    String isim = "Emre";
    String soyisim = "Ensaroglu";
    String bolum = "Matematik";
    int yas = 17;

    public ConstructorIsimDegistirme() {
    }

    public ConstructorIsimDegistirme(String isim, String soyisim, String bolum, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.bolum = bolum;
        this.yas = yas;
    }

    public void isimDegistir(String isim,String soyisim, String bolum, int yas){
        this.isim = isim;
        this.soyisim = soyisim;
        this.bolum = bolum;
        this.yas = yas;
    }

    public void soyisimDegistir(String soyisim){
        Scanner scan = new Scanner(System.in);
        System.out.print("Yeni soyisminizi giriniz : ");
        String yeniSoyIsim = scan.nextLine();
        this.isim = isim;
        this.soyisim = yeniSoyIsim;
        this.bolum = bolum;
        this.yas = yas;


    }


    @Override
    public String toString() {
        return "ConstructorIsimDegistirme{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", bolum='" + bolum + '\'' +
                ", yas=" + yas +
                '}';
    }
}

package day10_practice.constructor;

public class BookClass {

    String adi, yazari;
    int yayinYili;

    public BookClass() {
        System.out.println("parametresiz calisti");
    }

    public BookClass(String adi, String yazari) {
        System.out.println();
        this.adi = adi;
        this.yazari = yazari;
    }

    public BookClass(String adi, String yazari, int yayinYili) {
        this("SQL","Hatice");
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    @Override
    public String toString() {
        return "BookClass{" +
                "adi='" + adi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", yayinYili=" + yayinYili +
                '}';
    }
    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin

    public static void main(String[] args) {

        BookClass obje1 = new BookClass("Java","Selim Deniz",2022);
        System.out.println(obje1.toString());


        BookClass obje2 = new BookClass("Selenium","Ayse Erdem");
        System.out.println(obje2);
        System.out.println(obje2.adi + "\n" + obje2.yazari);

        BookClass obje3 = new BookClass("API", "Esra",2021);
        System.out.println(obje3);


    }
}
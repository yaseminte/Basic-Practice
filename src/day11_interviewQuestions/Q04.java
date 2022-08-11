package day11_interviewQuestions;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    //bunu kart sifre kontrol de de kullabilirinisz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sifre = "erdal.bey123";
        int girisSayisi = 3;

        System.out.println("Sifre Giriniz");
        String inputSifre = scan.nextLine();

        while(true){

            System.out.println("Sifre gir");
            String girilenSifre = scan.nextLine();

            if (sifre.equals(girilenSifre)){
                System.out.println("Sifren basarili");
                break;
            }else {
                System.out.println("sifren yanlis");
                girisSayisi--;
                System.out.println("Kalan giris hakkin : " + girisSayisi);

                if (girisSayisi == 0){
                    System.out.println("Kartiniz bloke oldu");
                    break;
                }
            }

        }



    }

}


package day1_day8.day01ANDday2_practice;

import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {
    /*
        galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

        int gallon = 1000;
        double litre = gallon*3.785;

        String sonuc1 = gallon + " galon degeri " + litre + " litreye esittir";
        System.out.println(sonuc1);
        //1000 galon degeri 3785.0 litreye esittir

        int l =100;
        double g =l/3.785;

        System.out.println(l + " litre degeri " + g + " gallona esittir");
        //100 litre degeri 26.42007926023778 gallona esittir

        Scanner scan = new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz :");
        double fh = scan.nextInt();

        // c = (f-32)*5/9

        System.out.println("girdiginiz fahrenayt degeri : " + (fh-32)*5/9);
}
}
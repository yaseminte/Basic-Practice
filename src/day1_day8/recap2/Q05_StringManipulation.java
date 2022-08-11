package day1_day8.recap2;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin,
    //sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz :");
        String firstName = scan.nextLine(), lastName = scan.nextLine(); // multiple declaration

        String fullName = firstName.concat(" " + lastName).toUpperCase();

        System.out.println("fullName = " + fullName);
    }
}

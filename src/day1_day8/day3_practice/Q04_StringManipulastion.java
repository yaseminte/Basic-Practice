package day1_day8.day3_practice;

import java.util.Scanner;

public class Q04_StringManipulastion {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime = scan.next();

        //char ortancaKrk = kelime.charAt((kelime.length()-1/2);
        char ortancaKrk = kelime.charAt((kelime.length()-1)/2);

        if (kelime.length()%2==1 && kelime.length()>=3){
            System.out.println("ortanca karakter : " + ortancaKrk);
        }
    }
}

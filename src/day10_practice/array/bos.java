package day10_practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bos {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>(List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya"));
        System.out.println(sehirler);

        System.out.println(sehirler.subList(1,3));
        Collections.sort(sehirler);
        System.out.println(sehirler);
        Collections.reverse(sehirler);
        System.out.println(sehirler);



        ArrayList<Integer> listRakam2 = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add(i);
                }
            }
        } ;
        System.out.println(listRakam2);

    }}



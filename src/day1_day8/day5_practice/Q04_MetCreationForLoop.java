package day1_day8.day5_practice;

import java.util.Scanner;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        reverseString(str);

        System.out.println("String'in tersi :" + reverseString(str));

    }

    private static String reverseString(String str) {

        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            reversed+=str.substring(i,i+1); // str.charAt(i); -> de yazsak oluyor
        }

        return reversed;
    }
    }


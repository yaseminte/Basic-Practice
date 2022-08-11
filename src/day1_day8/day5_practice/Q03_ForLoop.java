package day1_day8.day5_practice;

import java.util.Scanner;

public class Q03_ForLoop {

    /*
       Get the number of rows and columns from user.
       Create a rectangle.
       rows = 3 and column = 5 ==> * * * * *
                                   * * * * *
                                   * * * * *
   */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("satir sayisiniz giriniz : ");
        int satir = scan.nextInt();
        System.out.print("sutun sayisini giriniz :");
        int sutun = scan.nextInt();

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {
                System.out.print("* ");
            }
            System.out.println(""); // bu bosluk olmazsa hepsini yanyan yazar
        }

    }
}

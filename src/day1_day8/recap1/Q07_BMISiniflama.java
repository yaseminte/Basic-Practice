package day1_day8.recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {

		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Boyunuzu cm olarak giriniz : ");
            double boy = scan.nextDouble()/100;

            System.out.print("Kilonuzu kg olarak giriniz : " );
            double kilo = scan.nextDouble();

            double vKE = kilo / (boy*boy);

            if (vKE<=20){
                System.out.println("oldukca zayifsiniz");
            }else if (vKE<=25){
                System.out.println("Normal sinirlardasiniz");
            }else if (vKE<=30){
                System.out.println("Sisman kategorisindesiniz");
            }else {
                System.out.println("Obez grubundasiniz.");
            }
        }
}

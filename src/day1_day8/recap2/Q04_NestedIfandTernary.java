package day1_day8.recap2;

public class Q04_NestedIfandTernary {
     /*
    0 ~ 9 arasındaki rakamları kelimelere cevirip yazdiran bir java programi yazin.
    Sayı 9'dan buyuk veya sifirdan kucukse, cikis "Gecersiz" olmalidir
    NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
     public static void main(String[] args) {

          int sayi =9;
          String sonuc = "";

          if (sayi>=0 && sayi<=9){
               if (sayi==9){ sonuc="dokuz";}
               else if (sayi==8){ sonuc="sekiz";}
               else if (sayi==7){ sonuc= "yedi";}
               else if (sayi==6){ sonuc="alti";}
               else if (sayi==5){ sonuc= "bes";}
               else if (sayi==4){ sonuc= "dort";}
               else if (sayi==3){ sonuc= "uc";}
               else if (sayi==2){ sonuc= "iki";}
               else if (sayi==1){ sonuc = "bir";}
               else sonuc="sifir";

               System.out.println(sonuc);

          }else System.out.println("Gecersiz");

          String result = sayi==0 ? "sifir" : sayi==1 ? "bir" : sayi==2 ? "iki" : sayi==3 ? "uc" :
                          sayi==4 ? "dort" : sayi==5 ? "bes" : sayi==6 ? "alti" : sayi==7 ? "yedi" :
                          sayi==8 ? "sekiz" : sayi==9 ? "dokuz" : "gecersiz";

     }
}

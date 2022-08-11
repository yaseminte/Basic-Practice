package day1_day8.day01ANDday2_practice;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */

    public static void main(String[] args) {

        int fiyat = 5;

        String sonuc = fiyat<1 ? "hatali fiyat" : fiyat<10  ? "ucuz" : fiyat<20 ? "normal" : "pahali";
        System.out.println(sonuc);
    }
}

package day1_day8.day4_practice;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {
        String input = "aa bb ccccc ddddaaa";

        birKereYazdir(input);
    }

    public static void birKereYazdir(String input) {

        String output = ""; // String default degeri "" oldugu icin isleme etki etmesin diye bu sekilde atama yaptik

        for (int i = 0; i < input.length() ; i++) { //(int i = 0; i <= input.length()-1 ; i++)
            if (!output.contains(input.substring(i,i+1))){ // tekrarsiz karakterleri dondurecegimiz icin sonucumuz
                                                           // input'dan aldigimiz herhangi bir karakteri icermesin
               output += input.substring(i,i+1); // o zaman sonuca eklesin
            }
        }
        System.out.println("output = " + output);
    }
}

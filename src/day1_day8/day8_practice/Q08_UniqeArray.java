package day1_day8.day8_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};

        List<Integer> tekrarsizList = new ArrayList<>();
        int ilkDeger = arr[0];
        tekrarsizList.add(ilkDeger);


        for (int i = 1; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }
        }

        int[] yeniArr = new int[tekrarsizList.size()];

        for (int i = 0; i < tekrarsizList.size(); i++) {
            yeniArr[i]= tekrarsizList.get(i);
        }
        System.out.println("Yeni Array :" + Arrays.toString(yeniArr));
    }
}

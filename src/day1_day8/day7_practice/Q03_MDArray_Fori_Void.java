package day1_day8.day7_practice;

public class Q03_MDArray_Fori_Void {
    public static void main(String[] args) {

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

            int arr[][] = {{1,3,6},{2,8},{5,7,9,14}};
            ciftleriTopla(arr);
        }
        private static void ciftleriTopla(int[][] arr) {
            int toplam = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j]%2==0){
                        toplam += arr[i][j];
                    }
                }
            }
            System.out.println("toplam = " + toplam);
    }
}

package day1_day8.day01ANDday2_practice;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

    public static void main(String[] args) {

        int not = 90;

        boolean gecerliNot= not>=0 && not<=100;

        if (not>=90 && not<=100){
            System.out.println("A");
        }else if (not<90 && not>=80){
            System.out.println("B");
        }else if (not<80 && not>=70){
            System.out.println("C");
        }else if (not<70 && not>=60){
            System.out.println("D");
        }else if (not<60 && not>=0){
            System.out.println("F");
        }else
            gecerliNot=false;

        if (gecerliNot){
            System.out.println("Notunuz : " + not);
        }else
            System.out.println("Hatali Not Girdiniz!");
    }
}

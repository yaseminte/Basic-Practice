package day10_practice.constructor;

public class Runner {
    public static void main(String[] args) {


        ConstructorIsimDegistirme obj1 = new ConstructorIsimDegistirme();
        obj1.isimDegistir("Yasemin","Turker","IT",33);

        System.out.println(obj1.toString());

       obj1.soyisimDegistir(obj1.soyisim);
        System.out.println(obj1);
    }


}

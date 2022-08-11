package day1_day8.recap2;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        String day = "pazar";
        day = day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase();

        switch (day) {
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi gunleri");
                break;

            case "persembe":
            case "cuma":
                System.out.println(" Selenyum dersi gunleri");
                break;

            case "carsamba":
            case "cumartesi":
                System.out.println(" SQL dersi gunleri");
                break;

            case "pazar":
                System.out.println("izin gunu");
                break;

            default:
                System.out.println("Hatali gun ismi girdiniz!");

        }
    }
}

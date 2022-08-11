package day12_okulProje;

public class Kisi {

    // herkesin ortak ozelligi
    private String adSoyad ;
    private String kimlikNo;
    private String yas;

    public Kisi() {
    }

    public Kisi(String adSoyad, String kimlikNo, String yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setYas(String yas) { // yas kontrolu yapiniz
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public String getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas='" + yas + '\'' +
                '}';
    }
}

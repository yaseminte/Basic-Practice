package day09_practice.restourant;

public class Mutfak {

    public String yemekler = "adanaKebap, urfaCiger, kusbasi, kusleme";

    public String araSicaklar = "yaylacorba, mercimek, duguncorba, corba";

    public String tatlilar = "baklava, sutlac, gullac, kunefe";

    public String icecekler = "ayran, salgam, kola";



    public Mutfak(String adanaKebap, String mercimek, String kunefe, String salgam) {
       this.yemekler = adanaKebap;
       this.araSicaklar = mercimek;
       this.tatlilar = kunefe;
       this.icecekler = salgam;
    }

    public Mutfak() {
    }

    @Override
    public String toString() {
        return
                "\nyemekler=" + yemekler +
                "\naraSicaklar=" + araSicaklar +
                "\ntatlilar=" + tatlilar +
                "\nicecekler=" + icecekler;
    }
}

package AbstractOrnek2;

/**
 * Main
 *
 * @author Goksel Ates
 * @since 5.284.0
 */
public class Main {

    public static void main(String[] args) {
        Kare kare = new Kare("Kare",8L);
        Daire daire = new Daire("Daire",5L);
        Dikdortgen dikdortgen = new Dikdortgen("Dikdortgen",10L,20L);

        /* Nasıl yaptığını yani alanı nasıl hesapladığını vs. Bilmiyoruz.
        Sadece Ne yaptığı biliyoruz yani alan hesaplama yapıyor.
         */
        kare.alanHesapla();
        daire.alanHesapla();
        dikdortgen.isminiSoyle();
        dikdortgen.alanHesapla();
    }

}